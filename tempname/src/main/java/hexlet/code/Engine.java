package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String rules, String[][] rounds) {
        var name = askName();
        System.out.println(rules);

        for (var i = 0; i < 3; i++) {
            var question = rounds[i][0];
            var rightAnswer = rounds[i][1];

            System.out.print("Question: " + question
                    + "\nAnswer: ");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next();

            if (response.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + response + "'" + " is wrong answer ;(. Correct answer was '" + rightAnswer + "'"
                        + "\nLet's try again, " + name + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }
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

