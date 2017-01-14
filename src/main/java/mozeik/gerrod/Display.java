package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Display {

    Double currentValue;
    char operatorCode;
    Scanner scanner = new Scanner(System.in);

    public Display() {
        this.clearDisplay();
    }

    public void clearDisplay() {
        System.out.println("0");
    }

    public Double getCurrentValue() {
        currentValue = scanner.nextDouble();
        return currentValue;
    }

    public void sendErrorMessage() {
        System.out.println("ERR");
    }

    public char getOperatorCode() {
        operatorCode = scanner.next().charAt(0);
        return operatorCode;
    }

    public void showOutputValue(double outputValue) {
        System.out.println(outputValue);
    }

}
