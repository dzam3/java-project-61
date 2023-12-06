package hexlet.code.games;
import java.util.Random;
import static hexlet.code.Engine.engine;

public class Even {
    private static final int ROUNDS_QTY = 3;
    private static final int ROUNDS_SLOTS = 2;
    public static void even() {
        Random random = new Random();
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[ROUNDS_QTY][ROUNDS_SLOTS];

        for (var i = 0; i < 3; i++) {
            int number = random.nextInt(100);
            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        engine(rules, rounds);
    }
}
