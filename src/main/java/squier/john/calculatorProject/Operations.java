package squier.john.calculatorProject;

import static java.lang.Double.NaN;

/**
 * Created by johnsquier on 1/13/17.
 */
public class Operations {

    public double performCalculation(String operation, double currentValue, double inputValue) {

        switch( operation.toLowerCase() ) {
            case "+":
                return currentValue + inputValue;
            case "-":
                return currentValue - inputValue;
            case "*":
                return currentValue * inputValue;
            case "/":
            case "\\":
                if ( inputValue == 0 ) {
                    return NaN;
                }
                else {
                    return currentValue / inputValue;
                }
            case "square":
                return currentValue * currentValue;
            case "sqrt":
            case "squareroot":
                return Math.sqrt(currentValue);
            case "inv":
            case "inverse":
                if ( currentValue == 0 ) {
                    return NaN;
                }
                else {
                    return 1 / currentValue;
                }
            case "exp":
                return Math.pow(currentValue, inputValue);
            case "neg":
                return -currentValue;
            case "clear":
                return 0.0;
            default:
                return NaN;
        }
    }

    public String getAvailableOperations() {
        return "ADD: +    SUBTRACT: -    MULTIPLY: *    DIVIDE: /\n" +
                "SQUARE: square    SQUARE ROOT: sqrt    INVERSE: inv\n" +
                "EXP: exp    NEGATE: neg    SWITCH DISPLAY MODE: sdm\n" +
                "STORE IN MEMORY: M+\n" +
                "EXIT: exit    CLEAR: clear\n";
    }
}
