package hexlet.code.games;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;

import static hexlet.code.Engine.engine;
import static hexlet.code.tools.ArrayToStringConverter.convertIntArrayToStringArray;

public class Progression {
    public static void progression(String name) {
        Random random = new Random();
        int i = 0;

        while (i < 3) {
            int progLength = random.nextInt(5,10);
            int position = random.nextInt(1, progLength) - 1;
            int[] prog = new int[progLength];
            int progStart = random.nextInt(50);
            prog[0] = progStart;
            int progStep = random.nextInt(1,10);

            for (int counter = 1; counter < progLength; counter++) {
                prog[counter] = prog[counter - 1] + progStep;
            }

            String[] progString = convertIntArrayToStringArray(prog);
            progString[position] = "..";

            String progForPrint = ArrayUtils.toString(progString).replace(",", " ");

            System.out.println("What number is missing in the progression?\n"
                    + "Question: " + progForPrint.substring(1, progForPrint.length() - 1)
                    + "\nYour answer: ");

            int rightAnswer = prog[position];

            i += engine(String.valueOf(rightAnswer), name);

            if (i == 3) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}
