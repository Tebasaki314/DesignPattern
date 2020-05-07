package Bridge.A1;

import java.util.Random;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void randomDisplay(int times) {
        Random rand = new Random();
        int num = rand.nextInt(times);
        open();
        for (int i = 0; i < num; i++) {
            print();
        }
        close();
    }
}
