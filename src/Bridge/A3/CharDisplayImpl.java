package Bridge.A3;

public class CharDisplayImpl extends DisplayImpl {
    char prefix;
    char body;
    char suffix;

    public CharDisplayImpl(char prefix, char body, char suffix) {
        this.prefix = prefix;
        this.body = body;
        this.suffix = suffix;
    }

    @Override public void rawOpen() {
        System.out.print(prefix);
    }

    @Override public void rawPrint() {
        System.out.print(body);
    }

    @Override public void rawClose() {
        System.out.println(suffix);
    }
}
