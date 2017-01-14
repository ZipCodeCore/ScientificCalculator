package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/14/17.
 */
public class CalculatorBasicFunctions {

    static double initialValue;
    static double currentValue;
    static double calculatedValue;
    static String operatorCode;

    static public double calculateAddition(double firstNumber, double secondNumber) {
        return calculatedValue = firstNumber + secondNumber;
    }

    static public double calculateSubtraction(double firstNumber, double secondNumber) {
        return calculatedValue = firstNumber - secondNumber;
    }

    static public double calculateMultiplication(double firstNumber, double secondNumber) {
        return calculatedValue = firstNumber * secondNumber;
    }

    static public double calculateDivision(double firstNumber, double secondNumber) {
        if (secondNumber == 0.0) {
            Display.displayErrorMessage();
            return 0;
        } else {
            return calculatedValue = firstNumber / secondNumber;
        }
    }
}
