package hexlet.code.games;
import java.util.Random;
import static hexlet.code.Engine.engine;

public class Even {
    public static void even(String name) {
        Random random = new Random();
        int i = 0;

        while (i < 3) {
            int number = random.nextInt(100);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                    + "Question: " + number
                    + "\nYour answer: ");
            String rightAnswer = number % 2 == 0 ? "yes" : "no";
            i += engine(rightAnswer, name);
            if (i == 3) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}
