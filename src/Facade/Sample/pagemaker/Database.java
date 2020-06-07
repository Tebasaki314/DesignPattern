package Facade.Sample.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private static final String FILE_DIR = "src/Facade/Sample/";
    private Database() {}
    public static Properties getProperties(String dbname) {
        String filename = FILE_DIR + dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
