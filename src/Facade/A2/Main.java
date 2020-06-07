package Facade.A2;

import Facade.A2.pagemaker.PageMaker;

public class Main {
    private static final String FILE_DIR = "src/Facade/A2/";

    public static void main(String[] args) {
        PageMaker.makeLinkPage(FILE_DIR + "linkpage.html");
    }
}
