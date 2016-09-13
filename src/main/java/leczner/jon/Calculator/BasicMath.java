package leczner.jon.Calculator;

import java.math.BigDecimal;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class BasicMath {
    private double state;
    private boolean errorFlag;

    public BasicMath() {
        state = 0;
        errorFlag = false;
    }

    public String getState() {
        if (errorFlag) { // might have to fix this block...
            state = 0;
            errorFlag = !errorFlag;
            return "Err";
        } else {
            String stringState = String.valueOf(state);
            BigDecimal stateProper = new BigDecimal(stringState);
//            stateProper.setScale(15, BigDecimal.ROUND_HALF_UP); // 15 is an arbitrary thing;
            stateProper = stateProper.stripTrailingZeros();
            return stateProper.toPlainString();
        }
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
        if (Double.isNaN(state))
            errorFlag = !errorFlag;
        return state;
    }

    public double square() {
        state *= state;
        return state;
    }

    public double squareRoot() {
        if (state >= 0)
            state = Math.sqrt(state);
        else
            errorFlag = !errorFlag;
        return state;
    }

    public double exponent(double power) {
        if (state == 0 && power == 0)
            errorFlag = !errorFlag;
        state = Math.pow(state, power);
        return state;
    }

    public double inverse() {
        state = 1 / state;
        if (Double.isInfinite(state))
            errorFlag = !errorFlag;
        return state;
    }

    public double switchSign() {
        if (state != 0)
            state = state * -1;
        return state;
    }

    public double factorial() {
        double startNum = Math.abs(state); // abs for negatives
        for (int i = 1; i < startNum; i++) {
            state *= i;
        }
        return state;
    }
}
