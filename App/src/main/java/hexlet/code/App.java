package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

public class App {
    public static void main(String[] args) {
        int answer = Cli.gamePicker();

        if (answer == 1) {
            Cli.askName();
        } else if (answer == 2) {
            String name = Cli.askName();
            Even.even(name);
        } else if (answer == 3) {
            String name = Cli.askName();
            Calc.calc(name);
        } else if (answer == 4) {
            String name = Cli.askName();
            Gcd.gcd(name);
        }
    }
}
