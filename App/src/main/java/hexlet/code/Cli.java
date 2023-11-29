package hexlet.code;
import java.util.Scanner;


public class Cli {
    public static String askName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = scanner.next();

        System.out.println("Hello " + name + "!");
        return name;
    }

    public static int gamePicker() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                0 - Exit
                Your choice:""");
        return scanner.nextInt();
    }
}
