package gross_ryan;

/**
 * Created by ryangross on 1/15/17.
 */
public class UserInterface {
    Arithmetic anArithmetic;
    Exponential anExponential;


    public double doArithmetic( String aCommand, String displayedNumber, double numberToDoArithmeticOn) {
        double result = 0;
        switch(aCommand) {
            case "+":
                result = anArithmetic.addNumbers(displayedNumber,numberToDoArithmeticOn);
                break;
            case "-":
                result = anArithmetic.subtractNumbers(displayedNumber, numberToDoArithmeticOn);
                break;
            case "*":
                result = anArithmetic.multiplyNumbers(displayedNumber, numberToDoArithmeticOn);
                break;
            case "/":
                result = anArithmetic.divideNumbers(displayedNumber, numberToDoArithmeticOn);
                break;
            case "^":
                result = anArithmetic.toThePowerOf(displayedNumber, numberToDoArithmeticOn);
        }
        return result;
    }

    public double exponentialFunction(String aCommand, String displayedNumber) {
        double result = 0;
        switch (aCommand) {
            case "^2":
                result = anExponential.squareNumber(displayedNumber);
                break;
            case "√":
                result = anExponential.squaredRoot(displayedNumber);
                break;
            case "1/X":
                result = anExponential.inverseOfNumber(displayedNumber);
                break;
        }
        return result;
    }

}
