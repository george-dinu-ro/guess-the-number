package my.work;

import my.work.arbiter.Arbiter;
import my.work.guesser.AscendentGuesser;
import my.work.guesser.DescendGuesser;
import my.work.guesser.RandomGuesser;
import my.work.storage.Storage;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var maxNumber = 10_000;
        var guessTime = 10;//in seconds
        var storage = new Storage(new Random().nextInt(maxNumber + 1));

        List.of(
                new AscendentGuesser(storage, maxNumber),
                new DescendGuesser(storage, maxNumber),
                new RandomGuesser(storage, maxNumber),
                new Arbiter(guessTime)
        ).forEach(Thread::start);
    }
}