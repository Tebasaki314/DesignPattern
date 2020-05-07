package Bridge.A2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {
    private static final String FILE_DIR = "src/Bridge/A2/";
    private String filename;
    BufferedReader reader;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override public void rawOpen() {
        try {
            BufferedReader bufferedReader = reader = new BufferedReader(new FileReader(FILE_DIR + filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override public void rawPrint() {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override public void rawClose() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
