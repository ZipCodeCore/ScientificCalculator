package mccann.kevin.calculator;

/**
 * Created by kevinmccann on 1/13/17.
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
        return x / y;
    }

    public double square(double x) {
        return x * x;
    }

    public double squareroot(double x) {
        return Math.sqrt(x);
    }

    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    public double inverse(double x) {
        return divide(1, x);
    }

    public double sin(double x) {
        return Math.sin(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }

    public double tan(double x) {
        return Math.tan(x);
    }

    public double sininverse(double x) {
        return divide(1,sin(x));
    }

    public double cosinverse(double x) {
        return divide(1,cos(x));
    }

    public double taninverse(double x) {
        return divide(1,tan(x));
    }

    public double log(double x) {
        return Math.log10(x);
    }

    public double ln(double x) {
        return Math.log(x);
    }

    public double inverselog(double x) {
        return divide(1,log(x));
    }

    public double inversenaturallog(double x) {
        return divide(1,ln(x));
    }

    public double factorial(double x) {
        int total = 1;
        for (int i = 1; i <= x; i++) {
             total *= i;
        }
        return total;
    }
}
