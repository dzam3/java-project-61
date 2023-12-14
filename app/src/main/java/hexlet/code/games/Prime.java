package hexlet.code.games;

import static hexlet.code.Engine.engine;
import static hexlet.code.utils.RandomNum.getRandom;

public class Prime {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    private static final int NUM_BOUND = 100;
    public static void prime() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];

        for (int i = 0; i < ROUNDS_QTY; i++) {
            rounds[i] = roundsGen();
        }
        engine(rules, rounds);
    }

    private static String[] roundsGen() {
        int number = getRandom(NUM_BOUND);
        String[] round = new String[ROUNDS_SLOTS];
        round[0] = String.valueOf(number);

        String rightAnswer = isPrime(number) ? "yes" : "no";
        round[1] = rightAnswer;

        return round;
    }

    private static boolean isPrime(int number) {
        for (int counter = 2; counter <= Math.sqrt(number); counter += 1) {
            if (number % counter == 0) {
                return false;
            }
        }
        return true;
    }
}
