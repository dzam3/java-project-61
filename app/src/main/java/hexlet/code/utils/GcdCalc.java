package hexlet.code.utils;

import static java.util.Arrays.sort;

public class GcdCalc {
    public static int getGcd(int[] numbers) {
        sort(numbers);
        int a = numbers[1];
        int b = numbers[0];

        if (b == 0) {
            return a;
        } else {
            int r = (a % b);
            while (r > 0) {
                a = b;
                b = r;
                r = (a % b);
            }
            return b;
        }
    }
}
