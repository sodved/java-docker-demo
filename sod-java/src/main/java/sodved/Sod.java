package sodved;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Sod {

    private static final String FNAME = "/tmp/sod.txt";

    public static void main (String[] argv) {
        try(FileOutputStream outs = new FileOutputStream(FNAME);
            OutputStreamWriter out = new OutputStreamWriter(outs)) {
            out.write("File created: " + DateTimeFormatter.ISO_INSTANT.format(Instant.now()) + "\n");
        }
        catch (Exception err) {
            System.err.println("Caught error: " + err.toString());
        }
    }

}
