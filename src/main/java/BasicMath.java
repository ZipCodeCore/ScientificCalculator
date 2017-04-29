/**
 * Created by andrewwong on 4/28/17.
 */
public class BasicMath {

    public CalculationResult add(double firstNumber, double secondNumber) {

        boolean error = false;
        double resultValue = firstNumber + secondNumber;
        return new CalculationResult(error, resultValue);
    }

    public CalculationResult subtract(double firstNumber, double secondNumber) {

        boolean error = false;
        double resultValue = firstNumber - secondNumber;
        return new CalculationResult(error, resultValue);
    }

    public CalculationResult multiply(double firstNumber, double secondNumber) {
        boolean error = false;
        double resultValue = firstNumber * secondNumber;
        return new CalculationResult(error, resultValue);
    }

    public CalculationResult divide(double firstNumber, double secondNumber) {
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
