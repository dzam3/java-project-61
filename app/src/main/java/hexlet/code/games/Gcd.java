package hexlet.code.games;

import static hexlet.code.Engine.engine;
import static hexlet.code.utils.RandomNum.getRandom;
import static java.util.Arrays.sort;

public class Gcd {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    private static final int NUM_BOUND = 100;
    public static void gcd() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];
        for (int i = 0; i < ROUNDS_QTY; i++) {
            rounds[i] = roundsGen();
        }
        engine(rules, rounds);
    }

    private static String[] roundsGen() {
        int number1 = getRandom(NUM_BOUND);
        int number2 = getRandom(NUM_BOUND);
        String[] round = new String[ROUNDS_SLOTS];
        round[0] = number1 + " " + number2;
        int[] numbers = {number1, number2};
        sort(numbers);
        int a = numbers[1];
        int b = numbers[0];
        int gcd = getGcd(a, b);
        round[1] = String.valueOf(gcd);

        return round;
    }

    private static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            int r = (a % b);
            while (r > 0) {
                a = b;
                b = r;
                r = (a % b);
            }
            return b;
        }
    }
}
