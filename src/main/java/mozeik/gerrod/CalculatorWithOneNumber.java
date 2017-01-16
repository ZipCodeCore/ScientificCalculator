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

    static public double calculateSine(double firstNumber) {
        return Math.sin(Math.toDegrees(firstNumber));
    }

    static public double calculateCosine(double firstNumber) {
        return Math.cos(firstNumber);
    }

    static public double calculateTangent(double firstNumber) {
        return Math.tan(firstNumber);
    }

    static public double calculateArcSine(double firstNumber) {
        return Math.asin(firstNumber);
    }

    static public double calculateArcCosine(double firstNumber) {
        return Math.acos(firstNumber);
    }

    static public double calculateArcTangent(double firstNumber) {
        return Math.atan(firstNumber);
    }

    static public double degreesToRadians(double firstNumber) {
        return Math.toDegrees(firstNumber);
    }

    static public double radiansToDegrees(double firstNumber) {
        return Math.toRadians(firstNumber);
    }
}
