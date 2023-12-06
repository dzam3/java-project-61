package hexlet.code.games;
import java.util.Random;
import static hexlet.code.Engine.engine;

public class Even {
    public static void even() {
        Random random = new Random();
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number = random.nextInt(100);
            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        engine(rules, rounds);
    }
}
