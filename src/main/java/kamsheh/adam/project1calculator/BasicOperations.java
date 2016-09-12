package kamsheh.adam.project1calculator;

/**
 * Created by adam on 9/12/16.
 */
public class BasicOperations {
    public static double add(double state, double value) {
        return state + value;
    }

    public static double subtract(double state, double value) {
        return state - value;
    }

    public static double multiply(double state, double value) {
        return state * value;
    }

    public  static double divide(double state, double value) {
        return state / value;
    }

    public static double square(double state) {
        return Math.pow(state, 2);
    }

    public static double squareRoot(double state) {
        return Math.sqrt(state);

    }

    public static double cubedRoot(double state) {
        return Math.cbrt(state);
    }

    public static double cubed(double state) {
        return Math.pow(state, 3);
    }

    public static double toThePower(double state, double value) {
        return Math.pow(state, value);
    }

    public static double inverse(double state) {
        return 1 / state;
    }

    public static double changeSign(double state) {
        return state *= -1;
    }

    public static double factorial(double state) {
        double factorial = 1;
        for(int i=1; i<=state; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
