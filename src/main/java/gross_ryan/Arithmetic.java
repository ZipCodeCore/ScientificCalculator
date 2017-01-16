package gross_ryan;

/**
 * Created by ryangross on 1/15/17.
 */
public class Arithmetic {

    public double addNumbers(double displayedNumber, double numberToAddTo) {
        return displayedNumber + numberToAddTo;
    }

    public double subtractNumbers(double displayedNumber, double numberToSubtract) {
        return displayedNumber - numberToSubtract;
    }

    public double multiplyNumbers(double displayedNumber, double numberToMultiply) {
        return displayedNumber * numberToMultiply;
    }

    // Look at revising this..
    // Displays an error if divided by zero...
    public double divideNumbers(double displayedNumber, double numberToDivide) {
        if (numberToDivide != 0) {
            return displayedNumber / numberToDivide;
        }
        return displayedNumber;
    }



    public double toThePowerOf(double displayedNumber, double powerOf) {
        return Math.pow(displayedNumber, powerOf);
    }


}
