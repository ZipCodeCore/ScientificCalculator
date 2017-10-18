package squier.john.calculatorProject;

import static java.lang.Double.NaN;

/**
 * Created by johnsquier on 1/13/17.
 */
public class Operations {

    public double performCalculation(String operation, double currentValue,
                                     double inputValue,
                                     TrigModes trigMode) {

        switch( operation.toLowerCase() ) {
            case "+":
                return currentValue + inputValue;
            case "-":
                return currentValue - inputValue;
            case "*":
                return currentValue * inputValue;
            case "/":
            case "\\":
                if (inputValue == 0) {
                    return NaN;
                } else {
                    return currentValue / inputValue;
                }
            case "square":
                return currentValue * currentValue;
            case "sqrt":
            case "squareroot":
                return Math.sqrt(currentValue);
            case "inv":
            case "inverse":
                if (currentValue == 0) {
                    return NaN;
                } else {
                    return 1 / currentValue;
                }
            case "exp":
                return Math.pow(currentValue, inputValue);
            case "neg":
                return -currentValue;
            // need to determine if input is in rad or deg for these
            case "sin":
                if (trigMode.equals(TrigModes.RADIANS)) {
                    return Math.sin(currentValue);
                } else {
                    // sin is expecting radians
                    return Math.sin(Math.toRadians(currentValue));
                }
            case "asin":
                // recall asin 1 = 90degrees but asin returns rads
                if (trigMode.equals(TrigModes.RADIANS)) {
                    return Math.asin(currentValue);
                } else {
                    return Math.toDegrees(Math.asin(currentValue));
                }
            case "cos":
                if (trigMode.equals(TrigModes.RADIANS)) {
                    return Math.cos(currentValue);
                }
                else {
                    return Math.cos(Math.toRadians(currentValue));
                }
            case "acos":
                if ( trigMode.equals(TrigModes.RADIANS) ) {
                    return Math.acos(currentValue);
                }
                else {
                    return Math.toDegrees(Math.acos(currentValue));
                }
            case "tan":
                if ( trigMode.equals(TrigModes.RADIANS) ) {
                    return Math.tan(currentValue);
                }
                else {
                    return Math.tan(Math.toRadians(currentValue));
                }
            case "atan":
                if ( trigMode.equals(TrigModes.RADIANS) ) {
                    return Math.atan(currentValue);
                }
                else {
                    return Math.toDegrees(Math.atan(currentValue));
                }
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
            case "pi":
                return Math.PI;
            case "e":
                return Math.E;
            case "c":
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
}
