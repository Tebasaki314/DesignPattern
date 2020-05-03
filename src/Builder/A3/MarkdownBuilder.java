package Builder.A3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MarkdownBuilder extends Builder {
    private static final String FILE_DIR = "src/Builder/A3/";

    private String filename;
    private PrintWriter writer;

    @Override public void makeTitle(String title) {
        filename = FILE_DIR + title + ".md";
        try  {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("# " + title);
    }

    @Override public void makeString(String str) {
        writer.println("");
        writer.println(str);
        writer.println("");
    }

    @Override public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            writer.println("* " + items[i]);
        }
    }

    @Override public void close() {
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
