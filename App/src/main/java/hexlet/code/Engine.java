package hexlet.code;

public class Engine {
    public static int engine(String[] response) {
        if (response[0].equals(response[1])) {
            System.out.println("Correct!");
            return 1;
        } else {
            System.out.println("'" + response[1] + "'" + " is wrong answer ;(. Correct answer was '" + response[0] + "'");
            return 4;
        }
    }
}

