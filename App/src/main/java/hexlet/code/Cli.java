package hexlet.code;
import java.util.Scanner;


public class Cli {
    public static String askName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("May I have your name?");
        String name = scanner.next();

        System.out.println("Hello " + name + "!");
        return name;
    }

    public static int gamePicker() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit\n" +
                "Your choice:");
        int answer = scanner.nextInt();
        return answer;
    }
}
