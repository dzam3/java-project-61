package hexlet.code;
import java.util.Scanner;
import java.util.Random;
import static hexlet.code.Engine.engine;

public class Even {
    public static void even(String name) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i = 0;
        String[] response = new String[2];

        while (i < 3) {
            int number = random.nextInt(100);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                    + "Question: " + number
                    + "\nYour answer: ");
            String answer = scanner.next();
            String rightAnswer = number % 2 == 0 ? "yes" : "no";

            response[0] = rightAnswer;
            response[1] = answer;
            i += engine(response);
            if (i == 3) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}
