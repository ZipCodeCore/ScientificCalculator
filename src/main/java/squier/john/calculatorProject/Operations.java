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
            // need to determine if input is in rad or deg for these
            case "sin":
                // sin is expecting radians
                return Math.sin(Math.toRadians(currentValue));
            case "asin":
                // recall asin 1 = 90degrees but asin returns rads
                return Math.toDegrees(Math.asin(currentValue));
            case "cos":
                return Math.cos(Math.toRadians(currentValue));
            case "acos":
                return Math.toDegrees(Math.acos(currentValue));
            case "tan":
                return Math.tan(Math.toRadians(currentValue));
            case "atan":
                return Math.toDegrees(Math.atan(currentValue));
            case "log":
                if ( currentValue <= 0.0 ) {
                    return NaN;
                }
                else {
                    return Math.log10(currentValue);
                }
            case "10^x":
                return Math.pow(10.0, currentValue);
            case "ln":
                if ( currentValue <= 0.0 ) {
                    return NaN;
                }
                else {
                    return Math.log(currentValue);
                }
            case "e^x":
                return Math.pow(Math.E, currentValue);
            case "!":
                return factorial(Math.floor(currentValue));
            case "clear":
                return 0.0;
            default:
                return NaN;
        }
    }

    public double factorial(double aNumber) {

        double factorial = 1;

        if ( aNumber > 0 ) {

            for ( int i = 1; i <= aNumber; i++ ) {
                factorial *= i;
            }

            return factorial;

        }
        else {
            return 0;
        }
    }

    // REFACTOR: change this to an array of strings, not a string,
    // let the display class do the output formatting
    public String getAvailableOperations() {
        return "ADD: +    SUBTRACT: -    MULTIPLY: *    DIVIDE: /\n" +
                "SQUARE: square    SQUARE ROOT: sqrt    INVERSE: inv\n" +
                "EXP: exp\tNEGATE: neg\tFACTORIAL: !\n" +
                "SWITCH DISPLAY MODE: sdm\tSWITCH TRIG UNITS: stu\n" +
                "SINE: sin\tSINE INV: asin\tCOSINE: cos\tCOSINE INV: acos\n" +
                "TANGENT: tan\tTANGENT INV: atan\n" +
                "LOG: log\t INVERSE LOG: 10^x\n" +
                "NATURAL LOG: ln\tINVERSE NATUAL LOG: e^x\n" +
                "STORE IN MEMORY: M+\tCLEAR MEMORY: MC\tRECALL FROM MEMORY: MRC\n" +
                "EXIT: exit\tCLEAR: clear\n";
    }
}
