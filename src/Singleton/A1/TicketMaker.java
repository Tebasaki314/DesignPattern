package Singleton.A1;

public class TicketMaker {
    private static final TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public  int getNextTicketNumber() {
        return ticket++;
    }
}
