package Memento.A4.game;

import java.io.*;

public class Main {
    private static final String filename = "src/Memento/A4/game.dat";

    public static void main(String[] args) throws IOException {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        if (memento != null) {
            System.out.println("前回保存した結果からスタートします。");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新規にスタートします。");
            memento = gamer.createMemento();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("現状:" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");
            // Mementoの取り扱いの決定
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (だいぶ増えたので、現在の状態を保存しておこう)");
                memento = gamer.createMemento();
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    (だいぶ減ったので、以前の状態に復帰しよう)");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
            }
            System.out.println("");
        }
    }
    public static Memento loadMemento() {
        Memento memento = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            memento = (Memento) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }

    public static void saveMemento(Memento memento) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(fos);
            oos.writeObject(memento);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
