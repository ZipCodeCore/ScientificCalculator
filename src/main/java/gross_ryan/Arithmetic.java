package gross_ryan;

/**
 * Created by ryangross on 1/15/17.
 */
public class Arithmetic {

    public double addNumbers(String displayedNumber, double numberToAddTo) {
        return Double.parseDouble(displayedNumber) + numberToAddTo;
    }

    public double subtractNumbers(String displayedNumber, double numberToSubtract) {
        return Double.parseDouble(displayedNumber) - numberToSubtract;
    }

    public double multiplyNumbers(String displayedNumber, double numberToMultiply) {
        return Double.parseDouble(displayedNumber) * numberToMultiply;
    }

    // Displays an error if divided by zero...
    public double divideNumbers(String displayedNumber, double numberToDivide) {
        return Double.parseDouble(displayedNumber) / numberToDivide;
    }


    public double toThePowerOf(String displayedNumber, double powerOf) {
        double result = 0;
        for(int i = 0; i < powerOf; i++) {
            result *= Double.parseDouble(displayedNumber);
        }
        return result;
    }


}
