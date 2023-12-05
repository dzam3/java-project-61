package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int engine(String rightAnswer) {
        var name = askName();
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

    public static String askName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = scanner.next();

        System.out.println("Hello " + name + "!");
        return name;
    }
}

