package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Display {
    static Scanner scanner = new Scanner(System.in);

    static public void getInitialValue() {
        System.out.println("Enter a number.");
        CalculatorEngine.initialValue = scanner.nextDouble();
        getOperatorCode();
        getCurrentValue();
    }

    static public void clearDisplay() {
        getInitialValue();
    }

    static public void getCurrentValue() {
        System.out.println("Enter another number.");
        CalculatorEngine.currentValue = scanner.nextDouble();
        Choice.pickChoice(CalculatorEngine.operatorCode);
    }

    static public void getOperatorCode() {
        System.out.println("add/subtract/divide/multiply/clear?");
        CalculatorEngine.operatorCode = scanner.next();
        if (CalculatorEngine.operatorCode.equals("clear")) {
            System.out.println("Clear Message Received");
            getInitialValue();
        }

    }

    static public void showOutputValue(double outputValue) {
        System.out.println(outputValue);
    }

    static public void displayAfterCalculating() {
        CalculatorEngine.initialValue = CalculatorEngine.calculatedValue;
        System.out.println(CalculatorEngine.calculatedValue);
        System.out.println("add/subtract/divide/multiply/clear?");
        CalculatorEngine.operatorCode = scanner.next();
        if (CalculatorEngine.operatorCode.equals("clear")) {
            getInitialValue();
        }
    }

}
