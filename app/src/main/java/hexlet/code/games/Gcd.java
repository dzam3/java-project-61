package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.engine;
import static java.util.Arrays.sort;

public class Gcd {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    public static void gcd() {
        Random random = new Random();
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];

        for (var i = 0; i < 3; i++) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            rounds[i][0] = number1 + " " + number2;
            int[] numbers = {number1, number2};
            sort(numbers);

            int a = numbers[1];
            int b = numbers[0];

            if (b == 0) {
                rounds[i][1] = String.valueOf(a);
            } else {
                int r = (a % b);
                while (r > 0) {
                    a = b;
                    b = r;
                    r = (a % b);
                }
                rounds[i][1] = String.valueOf(b);
            }
        }
        engine(rules, rounds);
    }
}
