package hexlet.code.games;

import java.util.Random;
import static hexlet.code.Engine.engine;

public class Calc {
    public static void calc() {
        Random random = new Random();
        int i = 0;

        while (i < 3) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            int operator = random.nextInt(3);
            int rightAnswer = 0;
            System.out.println("What is the result of the expression?");

            switch (operator) {
                case 0:
                    rightAnswer = number1 + number2;
                    System.out.println("Question: " + number1 + " + " + number2);
                    hexlet.code.
                case 1:
                    rightAnswer = number1 - number2;
                    System.out.println("Question: " + number1 + " - " + number2);
                    break;
                case 2:
                    rightAnswer = number1 * number2;
                    System.out.println("Question: " + number1 + " * " + number2);
                    break;
            }
            System.out.println("Your answer: ");
            i += engine(String.valueOf(rightAnswer));

            if (i == 3) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}
