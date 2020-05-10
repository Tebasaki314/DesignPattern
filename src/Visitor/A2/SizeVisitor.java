package Visitor.A2;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int totalsize = 0;
    @Override public void visit(File file) {
        totalsize += file.getSize();
    }

    @Override public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Element e = (Element)it.next();
            e.accept(this);
        }
    }
    public int getSize() {
        return totalsize;
    }
}
