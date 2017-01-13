package crawley.james.Project1Calculator;

/**
 * Created by jamescrawley on 9/10/16.
 *
 * This class performs mathematical operations.
 * It can perform basic arithmetic, trigonometric and logarithmic operations.
 */
public class MathFunctions {

    /**
     *
     * Adds two numbers together
     *
     * @param a first number added
     * @param b second number added
     * @return the value of a plus b
     */
    public double add (double a, double b) {

        return a + b;
    }

    /**
     *
     * Subtracts two numbers
     *
     * @param a the starting value from which the other value will be subtracted
     * @param b the subtracted value
     * @return the value of a minus b
     */
    public double subtract (double a, double b) {

        return  a - b;
    }

    /**
     *
     * Multiplies two numbers
     *
     * @param a the first value multiplied
     * @param b the second value multiplied
     * @return the value of a times b
     */
    public double multiply (double a, double b) {

        return a * b;
    }

    /**
     *
     * Divides two numbers
     *
     * @param a the starting value
     * @param b the divided value
     * @return the value of a divided by b
     */
    public double divide (double a, double b) {

        return a / b;
    }

    /**
     *
     * Squares a number
     *
     * @param a the number to be squared
     * @return the value of a squared
     */
    public double square (double a) {

        return a * a;
    }

    /**
     *
     * Finds the square root of a number
     *
     * @param a the number for which the square root will be found
     * @return the square root of a
     */
    public double squareRoot (double a) {

        return Math.sqrt(a);
    }

    /**
     *
     * Cubes a number
     *
     * @param a the number to be cubed
     * @return the value of a cubed
     */
    public double cube (double a) {

        return a * a * a;
    }

    /**
     *
     * Finds the cube root of a number
     *
     * @param a the number for which the cube root will be found
     * @return
     */
    public double cubeRoot (double a) {

        return Math.cbrt(a);
    }

    /**
     *
     * Raises one number to the power of another number
     *
     * @param a the number to be exponentiated
     * @param b the exponent
     * @return the value of a raised to the power of b
     */
    public double exponent (double a, double b) {

        return Math.pow(a, b);
    }

    /**
     *
     * Inverts a number
     *
     * @param a the number to be inverted
     * @return the value of 1 divided by a
     */
    public double inverse (double a) {

        return divide (1, a);
    }

    /**
     *
     * Switches the sign of a number
     *
     * @param a the number to have its sign switched
     * @return the value of a with the opposite sign
     */
    public double switchSign (double a) {

        return a * -1;
    }

    /**
     *
     * Finds the sine of an angle
     *
     * @param a the angle
     * @return the value of sine of angle a
     */
    public double sine (double a) {

        return Math.sin(a);
    }

    /**
     *
     * Finds the cosine of an angle
     *
     * @param a the angle
     * @return the value of cosine of angle a
     */
    public double cosine (double a) {

        return Math.cos(a);
    }

    /**
     *
     * Finds the tangent of an angle
     *
     * @param a the angle
     * @return the value of tangent of the angle a
     */
    public double tangent (double a) {

        return Math.tan(a);
    }

    /**
     *
     * Finds the inverse sine of an angle
     *
     * @param a the angle
     * @return the value of inverse sine of the angle a
     */
    public double inverseSine (double a) {

        return Math.asin(a);
    }

    /**
     *
     * Finds the inverse cosine of an angle
     *
     * @param a the angle
     * @return the value of inverse cosine of the angle a
     */
    public double inverseCosine (double a) {

        return Math.acos(a);
    }

    /**
     *
     *  Finds the inverse tangent of an angle
     *
     * @param a the angle
     * @return the value of inverse tangent of the angle a
     */
    public double inverseTangent (double a) {

        return Math.atan(a);
    }

    /**
     *
     * Finds the factorial of a number
     *
     * @param a the number for which the factorial will be found
     * @return the value of a factorial
     */
    public long factorial (long a) {

        long sign = 1;
        long result = 1;

        if (a < 0) {
            sign = -1;
            a *= sign;
        }

        for (long i = 2; i <= a; i++) {
            result *= i;
        }

        if (a % 2 == 0) {
            sign *= -1;
        }

        return result * sign;
    }

    /**
     *
     * Finds the logarithm of a number
     *
     * @param a the number for which the log will be found
     * @return the value of the log of a
     */
    public double logarithm (double a) {

        return Math.log10(a);
    }

    /**
     *
     * Finds the natural logarithm of a number
     *
     * @param a the number for which the ln will be found
     * @return the value of the ln of a
     */
    public double naturalLogarithm (double a) {

        return Math.log(a);
    }

    /**
     *
     * Finds the inverse logarithm of a number
     *
     * @param a the exponent of 10
     * @return 10 raised to the power of a
     */
    public double inverseLogarithm (double a) {

        return Math.pow(10, a);
    }

    /**
     *
     *Finds the inverse natural logarithm of a number
     *
     * @param a the exponent of e
     * @return e raised to the power of a
     */
    public double inverseNaturalLogarithm (double a) {

        return Math.pow(Math.E, a);
    }
}
