package crawley.james.Project1Calculator;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class MathFunctions {

    public MathFunctions() {

    }

    public double add (double a, double b) {

        return a + b;
    }

    public double subtract (double a, double b) {

        return  a - b;
    }

    public double multiply (double a, double b) {

        return a * b;
    }

    public double divide (double a, double b) {

        return a / b;
    }

    public double square (double a) {

        return a * a;
    }

    public double squareRoot (double a) {

        return Math.sqrt(a);
    }

    public double cube (double a) {

        return a * a * a;
    }

    public double cubeRoot (double a) {

        return Math.cbrt(a);
    }

    public double exponent (double a, double b) {

        return Math.pow(a, b);
    }

    public double inverse (double a) {

        return divide (1, a);
    }

    public double switchSign (double a) {

        return a * -1;
    }

    public double sine (double a) {

        return Math.sin(a);
    }

    public double cosine (double a) {

        return Math.cos(a);
    }

    public double tangent (double a) {

        return Math.tan(a);
    }

    public double inverseSine (double a) {

        return inverse(sine(a));
    }

    public double inverseCosine (double a) {

        return inverse(cosine(a));
    }

    public double inverseTangent (double a) {

        return inverse(tangent(a));
    }

    public long factorial (long a) {

        long sign = 1;
        long factorial = 1;

        if (a < 0) {
            sign = 1;
            a *= sign;
        }

        for (long i = 2; i <= a; i++) {
            factorial *= i;
        }

        return factorial * sign;
    }

    public double logarithm (double a) {

        return Math.log10(a);
    }

    public double naturalLogarithm (double a) {

        return Math.log(a);
    }

    public double inverseLogarithm (double a) {

        return Math.pow(10, a);
    }

    public double inverseNaturalLogarithm (double a) {

        return Math.pow(Math.E, a);
    }
}
