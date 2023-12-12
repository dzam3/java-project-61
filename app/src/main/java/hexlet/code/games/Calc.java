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

        for (int i = 0; i < ROUNDS_QTY; i++) {
            rounds[i] = roundsGen();
        }
        engine(rules, rounds);
    }

    private static String[] roundsGen() {
        int number1 = getRandom(NUM_BOUND);
        int number2 = getRandom(NUM_BOUND);
        int operNum = getRandom(OPER_SLOTS);
        String[] operators = {" + ", " - ", " * "};

        String[] round = new String[ROUNDS_SLOTS];
        round[0] = number1 + operators[operNum] + number2;

        int rightAnswer = getRightAnswer(operNum, number1, number2);
        round[1] = String.valueOf(rightAnswer);
        return round;
    }

    private static int getRightAnswer(int operNum, int number1, int number2) {
        return switch (operNum) {
            case 0 -> number1 + number2;
            case 1 -> number1 - number2;
            case 2 -> number1 * number2;
            default -> throw new IllegalArgumentException("Unsupported value: " + operNum);
        };
    }
}
