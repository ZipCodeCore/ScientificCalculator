package crawley.james.Project1Calculator;

import sun.tools.tree.DivideExpression;

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

        double divide = 0;

        try {

            divide = a / b;

        } catch (ArithmeticException e) {

        }

        return divide;
    }

    public double square (double a) {

        return a * a;
    }

    public double squareRoot (double a) {

        return Math.sqrt(a);
    }

    public double exponent (double a, double b) {

        return Math.pow(a, b);
    }

    public double inverse (double a) {
        try {

            a = 1 / a;

        } catch (ArithmeticException e) {

            System.out.println("Err");
        }

        return a;
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

    public int factorial (int a) {

        int factorial = 1;

        for (int i = 2; i <= a; i++) {
            factorial *= i;
        }

        return factorial;
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
