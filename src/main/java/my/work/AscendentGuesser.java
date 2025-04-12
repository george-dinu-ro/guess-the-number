package my.work;

public class AscendentGuesser extends Guesser {

    public AscendentGuesser(Storage storage, int maxNumber) {
        super(storage, maxNumber);
    }

    @Override
    public void run() {
        for (var i = 0; i <= getMaxNumber(); i++) {
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
