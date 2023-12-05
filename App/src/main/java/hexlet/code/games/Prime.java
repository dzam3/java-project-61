package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.engine;

public class Prime {
    public static void prime() {
        Random random = new Random();
        int i = 0;

        while (i < 3) {
            int number = random.nextInt(100);

            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n"
                    + "Question: " + number
                    + "\nYour answer: ");
            String rightAnswer = "yes";

            for (int counter = 2; counter <= Math.sqrt(number); counter += 1) {
                if (number % counter == 0) {
                    rightAnswer = "no";
                    break;
                }
            }

            if (number == 1 || number == 2) {
                rightAnswer = "yes";
            }

            i += engine(rightAnswer);

            if (i == 3) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}
