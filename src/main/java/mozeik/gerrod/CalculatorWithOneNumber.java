package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/16/17.
 */
public class CalculatorWithOneNumber {

    static public double calculateInvert(double firstNumber) {
        return 1 / firstNumber;
    }

    static public double calculateSquare(double firstNumber) {
        return firstNumber * firstNumber;
    }

    static public double calculateSquareRoot(double firstNumber) {
        return java.lang.Math.sqrt(firstNumber);
    }

    static public double signInvert(double firstNumber) {
        return firstNumber * -1;
    }

    static public double calculateFactorial(double firstNumber) {
        int calculatedFactorialValue = 1;
        for (int i = 1; i <= firstNumber; i++) {
            calculatedFactorialValue *= i;
        }
        return calculatedFactorialValue;
    }
}
