/**
 * Created by andrewwong on 4/28/17.
 */
public class BasicMath {

    public static CalculationResult add(double firstNumber, double secondNumber) {

        boolean error = false;
        double resultValue = firstNumber + secondNumber;
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult subtract(double firstNumber, double secondNumber) {

        boolean error = false;
        double resultValue = firstNumber - secondNumber;
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult multiply(double firstNumber, double secondNumber) {
        boolean error = false;
        double resultValue = firstNumber * secondNumber;
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult divide(double firstNumber, double secondNumber) {
        boolean error = false;
        double resultValue = 0;
        if(secondNumber == 0) {
            error = true;
            return new CalculationResult(error, resultValue);
        }
        resultValue = firstNumber / secondNumber;
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult calculateSqr(double secondNumber){
        boolean error = false;
        double resultValue = Math.pow(secondNumber, 2);
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult calculateSqrRoot(double secondNumber){
        boolean error = false;
        double resultValue = 0;
        if(secondNumber < 0) {
            error = true;
            return new CalculationResult(error, resultValue);
        }
        resultValue = Math.pow(secondNumber, .5);
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult variableExponentation(double firstNumber, double secondNumber){
        boolean error = false;
        double resultValue = Math.pow(firstNumber, secondNumber);
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult calculateInverse(double secondNumber){
        boolean error = false;
        double resultValue = 1/secondNumber;
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult invertSign(double secondNumber){
        boolean error = false;
        double resultValue = - secondNumber;
        return new CalculationResult(error, resultValue);
    }
}
