package gross_ryan;

/**
 * Created by ryangross on 1/16/17.
 */
public class Logarithmic {

    public double naturalLog(double displayedNumber) {
        return Math.log(displayedNumber);
    }

    public double inverseNaturalLog(double displayedNumber) {
        return 1 / naturalLog(displayedNumber);
    }

    public double baseTenLog(double displayedNumber) {
        return Math.log10(displayedNumber);
    }

    public double inverseBaseTenLog(double displayedNumber) {
        return 1 / baseTenLog(displayedNumber);
    }

}
