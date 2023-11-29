package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int engine(String rightAnswer, String name) {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();

        if (response.equals(rightAnswer)) {
            System.out.println("Correct!");
            return 1;
        } else {
            System.out.println("'" + response + "'" + " is wrong answer ;(. Correct answer was '" + rightAnswer + "'"
                    + "\nLet's try again, " + name + "!");
            return 4;
        }
    }
}

