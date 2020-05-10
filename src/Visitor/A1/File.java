package Visitor.A1;

public class File extends Entry {
    private String name;
    private int size;

    @Override public void accept(Visitor v) {
        v.visit(this);
    }

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    @Override public String getName() {
        return name;
    }

    @Override public int getSize() {
        return size;
    }
}
