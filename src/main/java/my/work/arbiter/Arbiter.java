package my.work.arbiter;

public class Arbiter extends Thread {

    private final int guessTime;

    public Arbiter(int guessTime) {
        this.guessTime = guessTime;
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName() + " started.");
        super.start();
    }

    @Override
    public void run() {
        for (var i = guessTime; i >= 1; i--) {
            try {
                Thread.sleep(1000);
                System.out.println("Guessing remaining time " + i + " seconds.");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Number wasn't guessed in time.");
        System.exit(0);
    }
}
