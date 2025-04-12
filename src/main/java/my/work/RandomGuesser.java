package my.work;

import java.util.Random;

public class RandomGuesser extends Guesser {
    public RandomGuesser(Storage storage, int maxNumber) {
        super(storage, maxNumber);
    }

    @Override
    public void run() {
        var randomGenerator = new Random();

        while (true) {
            var number = randomGenerator.nextInt(getMaxNumber());

            try {
                if (getStorage().isNumber(number)) {
                    System.out.println("Number " + number + " found by " + getName());
                    System.exit(0);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
