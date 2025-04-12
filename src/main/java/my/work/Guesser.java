package my.work;

public abstract class Guesser extends Thread {

    private final Storage storage;

    private final int maxNumber;

    public Guesser(Storage storage, int maxNumber) {
        this.storage = storage;
        this.maxNumber = maxNumber;
        this.setName(getClass().getSimpleName());
    }

    public Storage getStorage() {
        return storage;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public void start() {
        System.out.println(getName() + " started.");
        super.start();
    }

    public abstract void run();

}
