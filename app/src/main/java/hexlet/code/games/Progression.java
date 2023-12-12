package hexlet.code.games;

import static hexlet.code.Engine.engine;
import static hexlet.code.utils.RandomNum.getRandom;

public class Progression {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    private static final int LEN_MIN = 5;
    private static final int LEN_MAX = 10;
    private static final int START_BOUND = 50;

    public static void progression() {
        String rules = "What number is missing in the progression?";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];

        roundsGen(rounds);
        engine(rules, rounds);
    }

    private static void roundsGen(String[][] rounds) {
        for (var i = 0; i < ROUNDS_QTY; i++) {
            int progLength = getRandom(LEN_MIN, LEN_MAX);
            int progStart = getRandom(START_BOUND);
            int progStep = getRandom(1, LEN_MAX);
            int hiddenNumber = getRandom(1, progLength);
            String[] prog = getProgression(progLength, progStart, progStep);

            String rightAnswer = prog[hiddenNumber];
            prog[hiddenNumber] = "..";

            rounds[i][0] = String.join(" ", prog);
            rounds[i][1] = rightAnswer;
        }
    }

    private static String[] getProgression(int progLength, int progStart, int progStep) {
        String[] prog = new String[progLength];
        prog[0] = String.valueOf(progStart);

        for (int counter = 1; counter < progLength; counter++) {
            prog[counter] = String.valueOf(Integer.parseInt(prog[counter - 1]) + progStep);
        }
        return prog;
    }
}
