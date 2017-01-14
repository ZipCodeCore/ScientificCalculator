package mattern.william;

/**
 * Created by williammattern on 1/14/17.
 */
public class CalculatorBasicFunctions {

    static public double calculateAddition(double firstNumber, double secondNumber){
        return Display.calculatedValue =  firstNumber + secondNumber;
    }

    static public double calculateSubtraction(double firstNumber, double secondNumber){
        return Display.calculatedValue = firstNumber - secondNumber;
    }

    static public double calculateMultiplication(double firstNumber, double secondNumber){
        return Display.calculatedValue = firstNumber * secondNumber;
    }

    static public double calculateDivision(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            Display.sendErrorMessage();
            return 0;
        } else {
            return Display.calculatedValue = firstNumber / secondNumber;
        }
    }
}
