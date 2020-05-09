package Decorator.A2;

import java.util.ArrayList;
import java.util.Comparator;

public class MultiStringDisplay extends Display {
    private ArrayList<String> strings = new ArrayList<>();
    public MultiStringDisplay() {
    }
    public void add(String str) {
        strings.add(str);
    }
    @Override public int getColumns() {
        return strings.stream().map(s -> s.getBytes().length).max(Comparator.naturalOrder()).orElse(0);
    }

    @Override public int getRows() {
        return strings.size();
    }

    @Override public String getRowText(int row) {
        return strings.get(row);
    }
}
