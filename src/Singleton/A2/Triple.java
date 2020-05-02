package Singleton.A2;

import java.util.Map;

public class Triple {
    private static final Map<Integer, Triple> instances = Map.ofEntries(
            Map.entry(0, new Triple()),
            Map.entry(1, new Triple()),
            Map.entry(2, new Triple())
    );

    private Triple() {
    }

    public static Triple getInstance(int id) {
        if (id >= 0 && id < 3) {
            System.out.println(id + "番目のインスタンスです。");
            return instances.get(id);
        } else {
            System.out.println("Invalid value of id: " + id + " (id >= 0 && id < 3)");
            return null;
        }
    }
}
