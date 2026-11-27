#!/usr/bin/env node
/**
 * Finish one generated Java client so it builds, publishes to Maven Central and carries the vendored extras.
 *
 *   node codegen/integrations/extras/java/finish.mjs <seller|buyer dir>
 *
 * Run by codegen/ci/check-java.sh before every build. Idempotent: a second run (CI on a committed release) changes
 * nothing. It does what the generator cannot be told to (the shared generate-sdks.mjs passes only the package
 * options):
 *
 *   1. Coordinates and Central metadata: the 5.4.0 template writes org.openapitools:openapi-java-client, an
 *      Unlicense block and the generator's own developers. Central refuses a pom without name, description, url,
 *      licenses, developers and scm, and the group must be the verified net.crossly namespace.
 *   2. Build settings: javac forked with 512 MB does not hold ~4,000 model classes; -Xlint:all floods the log; the
 *      jar manifest gets Implementation-Version (the User-Agent reads it); javadoc must not fail the release.
 *   3. Optional framework dependencies for the webhook middleware (provided + optional: never transitive).
 *   4. Vendored files (codegen/repo.json, copied again here) land in src/main/java/net/crossly/, because
 *      assemble.mjs only copies into an existing directory; each one whose `package` names a sub-package is moved
 *      to the directory that package needs.
 */
import { cpSync, existsSync, mkdirSync, readdirSync, readFileSync, renameSync, writeFileSync } from 'node:fs';
import { basename, dirname, join, resolve, sep } from 'node:path';
import { fileURLToPath } from 'node:url';

const dir = resolve(process.argv[2] ?? '');
const pomPath = join(dir, 'pom.xml');
if (!existsSync(pomPath)) {
  console.error(`finish: no pom.xml in ${dir}`);
  process.exit(2);
}
const side = basename(dir) === 'buyer' ? 'buyer' : 'seller';
const artifactId = side === 'buyer' ? 'crossly-buyer' : 'crossly';
const REPO = 'https://github.com/crossly-dev/crossly-java';

// ── 4. vendored files into their package directories ────────────────────────────────────────────────────────
// assemble.mjs vendors after each generation; doing it again here means CI on a tree committed before this
// repository's first release (or before an extras change) still builds and checks the current extras.
const CODEGEN = resolve(dirname(fileURLToPath(import.meta.url)), '..', '..', '..');
const ROOT = resolve(CODEGEN, '..');
const repoJson = join(CODEGEN, 'repo.json');
for (const v of existsSync(repoJson) ? JSON.parse(readFileSync(repoJson, 'utf8')).vendor ?? [] : []) {
  if (resolve(ROOT, v.to).startsWith(dir + sep)) cpSync(join(CODEGEN, 'integrations', v.from), resolve(ROOT, v.to));
}
const javaRoot = join(dir, 'src', 'main', 'java');
const landing = join(javaRoot, 'net', 'crossly');
let moved = 0;
for (const name of existsSync(landing) ? readdirSync(landing) : []) {
  if (!name.endsWith('.java')) continue;
  const file = join(landing, name);
  const pkg = readFileSync(file, 'utf8').match(/^package\s+([\w.]+)\s*;/m)?.[1];
  if (!pkg || pkg === 'net.crossly') continue;
  const target = join(javaRoot, ...pkg.split('.'));
  mkdirSync(target, { recursive: true });
  renameSync(file, join(target, name));
  moved += 1;
}

// ── 1-3. the pom ────────────────────────────────────────────────────────────────────────────────────────────
let pom = readFileSync(pomPath, 'utf8');
const before = pom;
const headStart = pom.indexOf('<modelVersion>');
const headEnd = pom.indexOf('<build>');
if (headStart < 0 || headEnd < 0) {
  console.error('finish: pom.xml has no <modelVersion> or <build>: the template changed, update finish.mjs');
  process.exit(1);
}
const head = pom.slice(headStart, headEnd);
if (!head.includes('<groupId>net.crossly</groupId>')) {
  const version = head.match(/<version>([^<]+)<\/version>/)?.[1];
  if (!version) {
    console.error('finish: no project <version> in pom.xml');
    process.exit(1);
  }
  const what = side === 'buyer' ? 'buyer API (shopping: cart, orders, wishlists, offers)' : 'seller API (listings, crossposting, orders, analytics)';
  const header = `<modelVersion>4.0.0</modelVersion>
    <groupId>net.crossly</groupId>
    <artifactId>${artifactId}</artifactId>
    <packaging>jar</packaging>
    <name>Crossly Java SDK (${side})</name>
    <version>${version}</version>
    <description>Official Java client for the Crossly ${what}, generated from the public OpenAPI spec, with retries, auto-pagination and the webhook verifier.</description>
    <url>${REPO}</url>
    <scm>
        <connection>scm:git:${REPO}.git</connection>
        <developerConnection>scm:git:${REPO}.git</developerConnection>
        <url>${REPO}</url>
    </scm>

    <licenses>
        <license>
            <name>MIT License</name>
            <url>https://opensource.org/licenses/MIT</url>
            <distribution>repo</distribution>
        </license>
    </licenses>

    <developers>
        <developer>
            <id>crossly</id>
            <name>Crossly</name>
            <organization>Crossly</organization>
            <organizationUrl>https://crossly.net</organizationUrl>
        </developer>
    </developers>

    `;
  pom = pom.slice(0, headStart) + header + pom.slice(headEnd);
}

const swap = (from, to) => {
  if (pom.includes(from)) pom = pom.replace(from, to);
};
swap('<maxmem>512m</maxmem>', '<maxmem>6144m</maxmem>');
swap('<arg>-Xlint:all</arg>', '<arg>-nowarn</arg>');

// maven-jar-plugin: the template leaves its <configuration> empty.
if (!pom.includes('addDefaultImplementationEntries')) pom = pom.replace(
  /(<artifactId>maven-jar-plugin<\/artifactId>[\s\S]*?<configuration>)\s*(<\/configuration>)/,
  `$1
                    <archive>
                        <manifest>
                            <addDefaultImplementationEntries>true</addDefaultImplementationEntries>
                        </manifest>
                    </archive>
                $2`,
);
if (!pom.includes('<failOnError>false</failOnError>')) {
  pom = pom.replace(
    /(<artifactId>maven-javadoc-plugin<\/artifactId>[\s\S]*?<configuration>)/,
    `$1
                    <failOnError>false</failOnError>
                    <quiet>true</quiet>
                    <maxmemory>6g</maxmemory>`,
  );
}
if (!pom.includes('<artifactId>jakarta.servlet-api</artifactId>')) {
  const marker = '        <!-- test dependencies -->';
  if (!pom.includes(marker)) {
    console.error('finish: no "<!-- test dependencies -->" marker in pom.xml: the template changed, update finish.mjs');
    process.exit(1);
  }
  pom = pom.replace(
    marker,
    `        <!-- Webhook middleware (net.crossly.webhooks): compiled against, never brought in. -->
        <dependency>
            <groupId>jakarta.servlet</groupId>
            <artifactId>jakarta.servlet-api</artifactId>
            <version>6.0.0</version>
            <scope>provided</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>6.1.14</version>
            <scope>provided</scope>
            <optional>true</optional>
        </dependency>
${marker}`,
  );
}

if (pom !== before) writeFileSync(pomPath, pom);
// An anyOf parameter (e.g. listListings' `tag`: string | string[]) is emitted as `AnyOfstringarray`, a type the
// 5.4.0 template never generates. Every such undefined AnyOf* name becomes String: one value, which every such
// parameter accepts.
const sources = [];
const walk = (d) => {
  for (const e of existsSync(d) ? readdirSync(d, { withFileTypes: true }) : []) {
    const p = join(d, e.name);
    if (e.isDirectory()) walk(p);
    else if (e.name.endsWith('.java')) sources.push(p);
  }
};
walk(javaRoot);
const definedAnyOf = new Set();
for (const f of sources) {
  for (const m of readFileSync(f, 'utf8').matchAll(/\b(?:class|enum|interface|object)\s+(AnyOf\w+)/g)) definedAnyOf.add(m[1]);
}
let anyOf = 0;
for (const f of sources) {
  const text = readFileSync(f, 'utf8');
  const next = text
    .replace(/^import\s+[\w.]+\.(AnyOf\w+);?[ \t]*\r?\n/gm, (line, name) => (definedAnyOf.has(name) ? line : ''))
    .replace(/\bAnyOf\w+\b/g, (name) => (definedAnyOf.has(name) ? name : (anyOf++, 'String')));
  if (next !== text) writeFileSync(f, next);
}
console.log(`finish ${side}: ${artifactId}, pom ${pom === before ? 'already finished' : 'updated'}, ${moved} vendored file(s) moved, ${anyOf} AnyOf type(s) -> String`);
