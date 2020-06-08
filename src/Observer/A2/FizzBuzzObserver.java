package Observer.A2;

public class FizzBuzzObserver implements Observer {
    @Override public void update(NumberGenerator generator) {
        int num = generator.getNumber();
        System.out.print("FizzBuzzObserver:");
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.print("Fizz");
        } else if (num % 5 == 0) {
            System.out.print("Buzz");
        }
        System.out.println();
    }
}
