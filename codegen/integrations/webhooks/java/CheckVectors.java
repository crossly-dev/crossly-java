import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

import net.crossly.webhooks.CrosslyWebhooks;

/**
 * Runs the shared conformance vectors against the Java port.
 *
 * Reads the TSV rather than the JSON on purpose: the JDK has no JSON parser,
 * and pulling one in — or hand-rolling one — would add a second thing that can
 * be wrong to a test whose entire job is to be trustworthy.
 */
public final class CheckVectors {

  public static void main(String[] args) throws Exception {
    List<String> lines = Files.readAllLines(
        Paths.get("..", "test-vectors.tsv"), StandardCharsets.UTF_8);

    int ok = 0;
    int bad = 0;
    int total = 0;

    for (String line : lines) {
      if (line.isEmpty() || line.startsWith("#")) {
        continue;
      }
      String[] cols = line.split("\t", -1);
      if (cols.length < 6) {
        continue;
      }

      String name = cols[0];
      String body = new String(Base64.getDecoder().decode(cols[1]), StandardCharsets.UTF_8);
      String header = cols[2];
      String secret = cols[3];
      long now = Long.parseLong(cols[4]);
      String expect = cols[5];
      total++;

      String got;
      try {
        CrosslyWebhooks.verify(body.getBytes(StandardCharsets.UTF_8), header, secret, 300, now);
        got = "ok";
      } catch (CrosslyWebhooks.VerificationException e) {
        got = e.reason;
      } catch (RuntimeException e) {
        // Any other throw is itself a conformance failure — a malformed header
        // must be rejected cleanly, never by crashing.
        got = "threw:" + e.getClass().getSimpleName();
      }

      if (got.equals(expect)) {
        ok++;
      } else {
        bad++;
        System.out.println("  MISMATCH " + name + ": expected " + expect + ", got " + got);
      }
    }

    System.out.println("  java: " + ok + "/" + total + " vectors agree");
    System.exit(bad > 0 ? 1 : 0);
  }
}
