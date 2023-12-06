package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.engine;

public class Prime {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    private static final int NUM_BOUND = 100;
    public static void prime() {
        Random random = new Random();
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];

        for (var i = 0; i < ROUNDS_QTY; i++) {
            int number = random.nextInt(NUM_BOUND);
            rounds[i][0] = String.valueOf(number);

            String rightAnswer = "yes";

            for (int counter = 2; counter <= Math.sqrt(number); counter += 1) {
                if (number % counter == 0) {
                    rightAnswer = "no";
                    break;
                }
            }
            rounds[i][1] = rightAnswer;
        }
        engine(rules, rounds);
    }
}
