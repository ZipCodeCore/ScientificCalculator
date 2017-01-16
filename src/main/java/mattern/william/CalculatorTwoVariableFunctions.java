package mattern.william;

/**
 * Created by williammattern on 1/14/17.
 */
public class CalculatorTwoVariableFunctions {

    static public double calculateAddition(double firstNumber, double secondNumber){
        return  firstNumber + secondNumber;
    }

    static public double calculateSubtraction(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    static public double calculateMultiplication(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    static public double calculateDivision(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            Display.sendErrorMessage();
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }

    static public double calculateToThePowerOf(double firstNumber, double secondNumber){
        return java.lang.Math.pow(firstNumber, secondNumber);
    }


}
