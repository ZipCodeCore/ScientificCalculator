package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/14/17.
 */
public class CalculatorWithTwoNumbers {

    static public double calculateAddition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    static public double calculateSubtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    static public double calculateMultiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    static public double calculateDivision(double firstNumber, double secondNumber) {
        if (secondNumber == 0.0) {
            Display.displayErrorMessage();
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }

    static public double calculateExponentiation(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }
}
