package AbstractFactory.Sample;

import AbstractFactory.Sample.factory.Factory;
import AbstractFactory.Sample.factory.Link;
import AbstractFactory.Sample.factory.Page;
import AbstractFactory.Sample.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main AbstractFactory.Sample.listfactory.ListFactory");
            System.out.println("Example 1: java Main AbstractFactory.Sample.tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞", "https://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "https://www.yomiuri.co.jp/");

        Link usYahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
        Link jpYahoo = factory.createLink("Yahoo! Japan", "https://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "https://www.excite.com/");
        Link google = factory.createLink("Google", "https://www.google.com/");

        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);
        traynews.add(yomiuri);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(usYahoo);
        trayyahoo.add(jpYahoo);

        Tray traysearch = factory.createTray("サーチエンジン");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "てばさき");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
