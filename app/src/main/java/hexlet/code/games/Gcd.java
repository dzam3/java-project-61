package hexlet.code.games;

import static hexlet.code.Engine.engine;
import static hexlet.code.utils.GcdCalc.getGcd;
import static hexlet.code.utils.RandomNum.getRandom;

public class Gcd {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    private static final int NUM_BOUND = 100;
    public static void gcd() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];
        roundsGen(rounds);
        engine(rules, rounds);
    }

    private static void roundsGen(String[][] rounds) {
        for (var i = 0; i < ROUNDS_QTY; i++) {
            int number1 = getRandom(NUM_BOUND);
            int number2 = getRandom(NUM_BOUND);
            rounds[i][0] = number1 + " " + number2;
            int[] numbers = {number1, number2};
            int gcd = getGcd(numbers);

            rounds[i][1] = String.valueOf(gcd);
        }
    }
}
