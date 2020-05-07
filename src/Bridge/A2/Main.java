package Bridge.A2;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new FileDisplayImpl("star.txt"));
        d1.display();
    }
}
