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
}
