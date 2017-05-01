/**
 * Created by danzygmund-felt on 4/30/17.
 */

public class CustomScientificCalculator extends ScientificCalculator{
    public double logbx(double b, double x) {
        if(Math.round(b) != b) {
            return Double.NaN;
        } else if(b < 1) {
            return  Double.NaN;
        } else if(x <= 0) {
            return Double.NaN;
        }

        return log(x) / log(b);
    }

    public double modulus(double x, double y) {
        if(Math.round(x) != x) {
            return Double.NaN;
        } else if(Math.round(y) != y) {
            return Double.NaN;
        }

        return x % y;
    }
}
