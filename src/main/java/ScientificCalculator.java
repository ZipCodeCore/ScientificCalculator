/**
 * Created by danzygmund-felt on 4/29/17.
 */
public class ScientificCalculator extends Calculator {

    public double sin(double x) { return Math.sin(x); }

    public double cos(double x) {
        return Math.cos(x);
    }

    public double tan(double x) {
        return Math.tan(x);
    }

    public double asin(double x) {
        return Math.asin(x);
    }

    public double acos(double x) {
        return Math.acos(x);
    }

    public double atan(double x) {
        return Math.atan(x);
    }

    public double log10(double x) {
        return Math.log10(x);
    }

    public double tenPower(double x) {
        return this.exponent(10.0, x);
    }

    public double log(double x) {
        return Math.log(x);
    }

    public double ePower(double x) {
        return this.exponent(Math.E, x);
    }

    public double factorial(double x) {
        if(x - Math.round(x) != 0 || x < 0) {
            return Double.NaN;
        }
        if (x == 0.0 || x ==1.0) {
            return 1;
        }
        return x * factorial(x - 1.0);
    }
}
