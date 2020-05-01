package TemplateMethod.Sample;

public class Main {
    public static void main(String[] args) {
        // 'H'を持ったCharDisplayのインスタンス
        AbstractDisplay d1 = new CharDisplay('H');
        // "Hello, world."を持ったStringDisplayのインスタンス
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        // "こんにちは。"を持ったStringDisplayのインスタンス
        AbstractDisplay d3 = new StringDisplay("こんにちは。");
        d1.display();
        d2.display();
        d3.display();
    }
}
