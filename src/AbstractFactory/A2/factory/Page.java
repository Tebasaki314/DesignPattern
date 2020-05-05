package AbstractFactory.A2.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
    private static final String FILE_DIR = "src/AbstractFactory/A2/";
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item) {
        content.add(item);
    }
    public void output() {
        try {
            String filename = FILE_DIR + title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " を作成しました。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
