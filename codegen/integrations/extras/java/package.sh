#!/usr/bin/env bash
# Build the release artifacts of both Java clients into dist/ (run from the repository root, after check-java.sh):
# per client the jar, -sources.jar, -javadoc.jar and the pom, named as Maven Central lays them out.
set -euo pipefail
export MAVEN_OPTS="${MAVEN_OPTS:--Xmx3g -XX:+UseParallelGC}"
mkdir -p dist
for client in seller buyer; do
  (cd "$client" && mvn -B -q -DskipTests package)
  art=$(sed -n 's:.*<artifactId>\(.*\)</artifactId>.*:\1:p' "$client/pom.xml" | head -1)
  ver=$(sed -n 's:.*<version>\(.*\)</version>.*:\1:p' "$client/pom.xml" | head -1)
  t="$client/target"
  cp "$t/$art-$ver.jar" "$t/$art-$ver-sources.jar" dist/
  if [ ! -f "$t/$art-$ver-javadoc.jar" ]; then
    # Javadoc is best effort (failOnError=false); Central still requires the jar, so a pointer stands in.
    echo "::warning::javadoc failed for $art; publishing a stub javadoc jar"
    stub="$(mktemp -d)"
    printf 'API reference: https://crossly.net/docs\nSources: %s-%s-sources.jar\n' "$art" "$ver" > "$stub/README.txt"
    (cd "$stub" && jar cf "$OLDPWD/$t/$art-$ver-javadoc.jar" README.txt)
  fi
  cp "$t/$art-$ver-javadoc.jar" dist/
  cp "$client/pom.xml" "dist/$art-$ver.pom"
done
ls -l dist
