package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.engine;
public class Progression {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    private static final int LEN_MIN = 5;
    private static final int LEN_MAX = 10;
    private static final int START_BOUND = 50;

    public static void progression() {
        Random random = new Random();
        String rules = "What number is missing in the progression?";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];

        for (var i = 0; i < ROUNDS_QTY; i++) {
            int progLength = random.nextInt(LEN_MIN, LEN_MAX);
            int progStart = random.nextInt(START_BOUND);
            int progStep = random.nextInt(1, LEN_MAX);
            int hiddenNumber = random.nextInt(1, progLength);
            int[] prog = new int[progLength];
            String progString = String.valueOf(progStart);
            prog[0] = progStart;

            for (int counter = 1; counter < progLength; counter++) {
                prog[counter] = prog[counter - 1] + progStep;
                if (counter == hiddenNumber) {
                    progString += " ..";
                } else {
                    progString += " " + prog[counter];
                }
            }
            rounds[i][0] = progString;
            rounds[i][1] = String.valueOf(prog[hiddenNumber]);
        }
        engine(rules, rounds);
    }
}
