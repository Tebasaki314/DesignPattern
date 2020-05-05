package AbstractFactory.A2.tablefactory;

import AbstractFactory.A2.factory.Factory;
import AbstractFactory.A2.factory.Link;
import AbstractFactory.A2.factory.Page;
import AbstractFactory.A2.factory.Tray;

public class TableFactory extends Factory {
    @Override public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
