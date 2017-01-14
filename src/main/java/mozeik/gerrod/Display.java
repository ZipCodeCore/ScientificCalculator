package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Display {
    Scanner scanner = new Scanner(System.in);

    public void getInitialValue() {
        System.out.println("Enter a number.");
        CalculatorEngine.initialValue = scanner.nextDouble();
    }

    public Display() {
        this.clearDisplay();
    }

    public void clearDisplay() {
        System.out.println("0");
    }

    public Double getCurrentValue() {
        System.out.println("Enter another number.");
        return CalculatorEngine.currentValue = scanner.nextDouble();
    }

    public void sendErrorMessage() {
        System.out.println("ERR");
    }

    public String getOperatorCode() {
        System.out.println("add/subtract/divide/multiply/end?");
        return CalculatorEngine.operatorCode = scanner.next();
    }

    public void showOutputValue(double outputValue) {
        System.out.println(outputValue);
    }

}
