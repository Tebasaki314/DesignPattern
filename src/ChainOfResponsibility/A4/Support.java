package ChainOfResponsibility.A4;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Support {
    private String name;
    private ArrayList supports = new ArrayList();
    public Support(String name) {
        this.name = name;
        supports.add(this);
    }
    public Support setNext(Support next) {
        supports.add(next);
        return this;
    }
    public final void support(Trouble trouble) {
        Iterator it = supports.iterator();
        while (it.hasNext()) {
            Support s = (Support)it.next();
            if (s.resolve(trouble)) {
                s.done(trouble);
                return;
            }
        }
        fail(trouble);
    }
    public String toString() {
        return "[" + name + "]";
    }
    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
