package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

import static hexlet.code.Engine.askName;

public class App {
    private static final int GREETING = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:""");
        var answer = scanner.nextInt();

        switch (answer) {
            case GREETING:
                askName();
                break;
            case EVEN:
                Even.even();
                break;
            case CALC:
                Calc.calc();
                break;
            case GCD:
                Gcd.gcd();
                break;
            case PROGRESSION:
                Progression.progression();
                break;
            case PRIME:
                Prime.prime();
                break;
            default:
                break;
        }
    }
}
