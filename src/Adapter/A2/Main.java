package Adapter.A2;

import java.io.IOException;

public class Main {
    private static final String PACKAGE_DIR = "src/Adapter/A2/";

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile(PACKAGE_DIR + "file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile(PACKAGE_DIR + "newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
