/**
 * Created by danzygmund-felt on 4/28/17.
 */
public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            return Double.NaN;
        }

        return x / y;
    }

    public double square(double x) {
        return x * x;
    }

    public double squareRoot(double x) {
        if (x < 0) {
            return Double.NaN;
        }

        return Math.sqrt(x);
    }

    public double exponent(double x, double y) {
        return Math.pow(x, y);
    }

    public double inverse(double x) {
        return divide(1.0, x);
    }

    public double opposite(double x) {
        return -x;
    }

}
