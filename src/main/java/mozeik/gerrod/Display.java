package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Display {
    static Scanner scanner = new Scanner(System.in);

    static public void getInitialValue() {
        System.out.println("Enter a number.");
        CalculatorBasicFunctions.initialValue = scanner.nextDouble();
        getOperatorCode();
        getCurrentValue();
    }

    static public void clearDisplay() {
        getInitialValue();
    }

    static public void getCurrentValue() {
        System.out.println("Enter another number.");
        CalculatorBasicFunctions.currentValue = scanner.nextDouble();
        Choice.pickChoice(CalculatorBasicFunctions.operatorCode);
    }

    static public void getOperatorCode() {
        System.out.println("add/subtract/divide/multiply/clear?");
        CalculatorBasicFunctions.operatorCode = scanner.next();
        if (CalculatorBasicFunctions.operatorCode.equals("clear")) {
            getInitialValue();
        }

    }

    static public void displayAfterCalculating() {
        CalculatorBasicFunctions.initialValue = CalculatorBasicFunctions.calculatedValue;
        System.out.println(CalculatorBasicFunctions.calculatedValue);
        System.out.println("add/subtract/divide/multiply/clear?");
        CalculatorBasicFunctions.operatorCode = scanner.next();
        if (CalculatorBasicFunctions.operatorCode.equals("clear")) {
            Display.clearDisplay();
        }
    }

    public static void displayErrorMessage() {
        System.out.println("ERR");
    }

}
