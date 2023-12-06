package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.engine;

public class Prime {
    public static void prime() {
        Random random = new Random();
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number = random.nextInt(100);
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
