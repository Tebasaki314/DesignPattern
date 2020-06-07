package Facade.Sample;

import Facade.Sample.pagemaker.PageMaker;

public class Main {
    private static final String FILE_DIR = "src/Facade/Sample/";

    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", FILE_DIR + "welcome.html");
    }
}
