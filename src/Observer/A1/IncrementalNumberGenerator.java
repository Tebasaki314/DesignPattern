package Observer.A1;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int start;
    private int end;
    private int delta;

    public IncrementalNumberGenerator(int start, int end, int delta) {
        this.start = start;
        this.end = end;
        this.delta = delta;
    }

    @Override public int getNumber() {
        return number;
    }

    @Override public void execute() {
        for (int i = start; i < end; i += delta) {
            this.number = i;
            notifyObservers();
        }
    }
}
