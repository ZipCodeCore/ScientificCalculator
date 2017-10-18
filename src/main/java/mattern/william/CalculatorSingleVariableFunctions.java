package mattern.william;

/**
 * Created by williammattern on 1/16/17.
 */
public class CalculatorSingleVariableFunctions {

    static public double calculateSquare(double firstNumber){
        return firstNumber * firstNumber;
    }

    static public double calculateSquareRoot(double firstNumber){
        return java.lang.Math.sqrt(firstNumber);
    }

    static public double calculateInverse(double firstNumber){
        if (firstNumber == 0){
            Display.sendErrorMessage();
            return 0;
        } else {
            return (1 / firstNumber);
        }
    }

    static public double calculateSignInversion(double firstNumber){
        if (firstNumber == 0){
            Display.clearDisplay();
            return 0;
        } else {
            return firstNumber * (-1);
        }
    }

    static public double calculateFactorial(double firstNumber){
        int calculatedFactorialValue = 1;
        for (int i = 1; i <= firstNumber; i++){
            calculatedFactorialValue *= i;
        }
        return calculatedFactorialValue;
    }

    static public double calculateSine(double firstNumber){
        return java.lang.Math.sin(firstNumber);
    }

    static public double calculateCosine(double firstNumber){
        return java.lang.Math.cos(firstNumber);
    }

    static public double calculateTangent(double firstNumber){
        return java.lang.Math.tan(firstNumber);
    }

    static public double calculateArcSine(double firstNumber){
        return java.lang.Math.asin(firstNumber);
    }

    static public double calculateArcosine(double firstNumber){
        return java.lang.Math.acos(firstNumber);
    }

    static public double calculateArcTangent(double firstNumber){
        return java.lang.Math.atan(firstNumber);
    }

    static public double convertToDegrees(double firstNumber){
        return java.lang.Math.toDegrees(firstNumber);
    }

    static public double convertToRadians(double firstNumber){
        return java.lang.Math.toRadians(firstNumber);
    }
}
