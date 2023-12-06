package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.engine;

public class Calc {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    private static final int NUM_BOUND = 100;
    private static final int OPER_SLOTS = 3;
    public static void calc() {
        Random random = new Random();
        String rules = "What is the result of the expression?";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];

        for (var i = 0; i < ROUNDS_QTY; i++) {
            int number1 = random.nextInt(NUM_BOUND);
            int number2 = random.nextInt(NUM_BOUND);
            int operNum = random.nextInt(OPER_SLOTS);
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
