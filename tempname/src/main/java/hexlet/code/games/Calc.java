package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.engine;

public class Calc {
    public static void calc() {
        Random random = new Random();
        String rules = "What is the result of the expression?";
        String[][] rounds = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            int operNum = random.nextInt(3);
            String[] operators = {" + ", " - ", " * "};

            rounds[i][0] = number1 + operators[operNum] + number2;

            switch (operNum) {
                case 0:
                    rounds[i][1] = String.valueOf(number1 + number2);
                    break;
                case 1:
                    rounds[i][1] = String.valueOf(number1 - number2);
                    break;
                case 2:
                    rounds[i][1] = String.valueOf(number1 * number2);
                    break;
                default:
                    break;
            }
        }
        engine(rules, rounds);
    }
}
