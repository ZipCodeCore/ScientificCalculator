package gross_ryan;

/**
 * Created by ryangross on 1/15/17.
 */
public class Exponential {

    public double squareNumber(String displayedNumber) {
        return Math.pow(Double.parseDouble(displayedNumber), 2);
    }

    public double squaredRoot(String displayedNumber) {
        return Math.sqrt(Double.parseDouble(displayedNumber));
    }

    public double inverseOfNumber(String displayedNumber) {
        return 1 / Double.parseDouble(displayedNumber);
    }

}
