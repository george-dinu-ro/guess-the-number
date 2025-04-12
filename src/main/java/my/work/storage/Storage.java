package my.work.storage;

public class Storage {

    private final int number;

    public Storage(int number) {
        System.out.println("Storage created with number:" + number);
        this.number = number;
    }

    public boolean isNumber(int number) throws InterruptedException {
        Thread.sleep(10);
        return this.number == number;
    }

}
