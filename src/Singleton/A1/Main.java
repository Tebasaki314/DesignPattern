package Singleton.A1;

import Singleton.Sample.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        TicketMaker obj1 = TicketMaker.getInstance();
        TicketMaker obj2 = TicketMaker.getInstance();

        System.out.println("1枚目のチケット番号 " + obj1.getNextTicketNumber());
        System.out.println("2枚目のチケット番号 " + obj1.getNextTicketNumber());
        System.out.println("3枚目のチケット番号 " + obj2.getNextTicketNumber());
        System.out.println("4枚目のチケット番号 " + obj2.getNextTicketNumber());
        System.out.println("5枚目のチケット番号 " + obj1.getNextTicketNumber());

        System.out.println("End.");
    }
}
