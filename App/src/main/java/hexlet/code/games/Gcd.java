package hexlet.code.games;

import hexlet.code.tools.ArrayMax;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static hexlet.code.Engine.engine;

public class Gcd {
    public static void gcd(String name) {
        Random random = new Random();
        int i = 0;

        while (i < 3) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            Integer rightAnswer;

            System.out.println("Find the greatest common divisor of given numbers.\n"
                    + "Question: " + number1 + " " + number2
                    + "\nYour answer: ");

            int[] factors1 = {1};
            int[] factors2 = {1};

//TODO extract logic below into separate classes in tools package
            while (number1 % 2 == 0) {
                number1 /= 2;
                factors1 = ArrayUtils.add(factors1, 2);
            }

            for (int counter = 3; counter <= number1; counter += 2) {
                if (number1 % counter == 0) {
                    factors1 = ArrayUtils.add(factors1, counter);
                }
            }

            while (number2 % 2 == 0) {
                number2 /= 2;
                factors2 = ArrayUtils.add(factors2, 2);
            }

            for (int counter = 3; counter <= number2; counter += 2) {
                if (number2 % counter == 0) {
                    factors2 = ArrayUtils.add(factors2, counter);
                }
            }

            List<Integer> convertedFactors1;
            convertedFactors1 = IntStream.of(factors1).boxed().collect(Collectors.toList());
            List<Integer> convertedFactors2;
            convertedFactors2 = IntStream.of(factors2).boxed().collect(Collectors.toList());

            Integer[] commonFactors;
            commonFactors = CollectionUtils.intersection(convertedFactors1, convertedFactors2).toArray(new Integer[0]);

            rightAnswer = ArrayMax.findMax(commonFactors);

            i += engine(String.valueOf(rightAnswer), name);

            if (i == 3) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}
