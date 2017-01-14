package squier.john.calculatorProject;

import java.util.Scanner;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorInput {

    private Scanner scanner;

    public CalculatorInput() {
        scanner = new Scanner(System.in);
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

}
