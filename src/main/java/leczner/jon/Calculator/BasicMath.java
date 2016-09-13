package leczner.jon.Calculator;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class BasicMath {
    private double state;

    public BasicMath() {
        state = 0;
    }

    public double getState() {
        return state;
    }

    public double add(double input) {
        state += input;
        return state;
    }

    public double subtract(double input) {
        state -= input;
        return state;
    }

    public double multiply(double input) {
        state *= input;
        return state;
    }

    public double divide(double input) {
        state /= input;
        return state;
    }

    public double square() {
        state *= state;
        return state;
    }

    public double squareRoot() {
        return Math.sqrt(state);
    }

    public double exponent(double power) {
        return Math.pow(state, power);
    }

    public double inverse() {
        return 1/state;
    }

    public double switchSign() {
        return state * -1;
    }

    public double factorial() {
        for (int i = 1; i < state; i++) {
            state *= i;
        }
        return state;
    }
}
