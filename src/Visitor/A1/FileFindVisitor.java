package Visitor.A1;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
    private String filetype;
    private ArrayList files = new ArrayList();
    public FileFindVisitor(String filetype) {
        this.filetype = filetype;
    }
    @Override public void visit(File file) {
        if (file.getName().endsWith(filetype)) {
            files.add(file);
        }
    }

    @Override public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Element e = (Element)it.next();
            e.accept(this);
        }
    }

    public Iterator getFoundFiles() {
        return files.iterator();
    }
}
