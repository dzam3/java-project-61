package hexlet.code.games;

import static hexlet.code.utils.RandomNum.getRandom;

import static hexlet.code.Engine.engine;

public class Calc {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    private static final int NUM_BOUND = 100;
    private static final int OPER_SLOTS = 3;
    public static void calc() {
        String rules = "What is the result of the expression?";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];

        roundsGen(rounds);
        engine(rules, rounds);
    }

    private static void roundsGen(String[][] rounds) {
        for (var i = 0; i < ROUNDS_QTY; i++) {
            int number1 = getRandom(NUM_BOUND);
            int number2 = getRandom(NUM_BOUND);
            int operNum = getRandom(OPER_SLOTS);
            String[] operators = {" + ", " - ", " * "};

            rounds[i][0] = number1 + operators[operNum] + number2;
            int rightAnswer = 0;

            switch (operNum) {
                case 0:
                    rightAnswer = number1 + number2;
                    break;
                case 1:
                    rightAnswer = number1 - number2;
                    break;
                case 2:
                    rightAnswer = number1 * number2;
                    break;
                default:
                    break;
            }
            rounds[i][1] = String.valueOf(rightAnswer);
        }
    }
}
