package hexlet.code.utils;

import java.util.Random;

public class RandomNum {

    public static int getRandom() {
        Random randomNum = new Random();
        return randomNum.nextInt();
    }

    public static int getRandom(int bound) {
        Random randomNum = new Random();
        return randomNum.nextInt(bound);
    }

    public static int getRandom(int start, int bound) {
        Random randomNum = new Random();
        return randomNum.nextInt(start, bound);
    }
}
