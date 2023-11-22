package hexlet.code;

import static hexlet.code.Even.even;
import static hexlet.code.Cli.gamePicker;

public class App {
    public static void main(String[] args) {
        int answer = gamePicker();

        if (answer == 2) {
            String name = Cli.askName();
            int counter = 0;

            while (counter < 3) {
                if (even() == 1) {
                    counter++;
                } else {
                    counter = 0;
                }
            }
            System.out.println("Congratulations, " + name + "!");
        } else if (answer == 1) {
            Cli.askName();
        }

    }
}
