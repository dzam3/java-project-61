package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

import static hexlet.code.Engine.askName;

public class App {
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
            case 1:
                askName();
                break;
            case 2:
                Even.even();
                break;
            case 3:
                Calc.calc();
                break;
            case 4:
                Gcd.gcd();
                break;
            case 5:
                Progression.progression();
                break;
            case 6:
                Prime.prime();
                break;
            default:
                break;
        }
    }
}
