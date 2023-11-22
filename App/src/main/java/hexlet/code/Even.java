package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static int even() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                "Question: " + number +
                "\nYour answer: ");
        String answer = scanner.next();
        String rightAnswer = number % 2 == 0 ? "yes" : "no";

        if (answer.equals(rightAnswer)) {
            System.out.println("Correct!");
            return 1;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
            return 0;
        }
    }
}
