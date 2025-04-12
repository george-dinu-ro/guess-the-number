package my.work.guesser;

import my.work.storage.Storage;

public class DescendGuesser extends Guesser {

    public DescendGuesser(Storage storage, int maxNumber) {
        super(storage, maxNumber);
    }

    @Override
    public void run() {
        for (var i = getMaxNumber(); i >= 0; i--) {
            try {
                if (getStorage().isNumber(i)) {
                    System.out.println("Number " + i + " found by " + getName());
                    System.exit(0);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
