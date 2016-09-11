package crawley.james.Project1Calculator;

import java.util.Scanner;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class Core {

    Scanner scanner = new Scanner(System.in);
    MathFunctions mathFunc = new MathFunctions();
    CalculatorSettings settings = new CalculatorSettings();
    private boolean isOn = true;
    private boolean isErr = false;

    public Core() {

    }

    public void receiveCommand () {

        System.out.println("Input a command: ");
        executeCommand(scanner.next());
    }

    public double getNumberInput () {

        System.out.println("Input a number: ");
        return scanner.nextDouble();
    }

    public boolean isRunning () {

        return isOn;
    }

    public void executeCommand (String command) {

        double result;

        clearError(command);

        switch (command) {
            case "add":
                updateDisplay(mathFunc.add(settings.getState(), getNumberInput()));
                break;
            case "subtract":
                updateDisplay(mathFunc.subtract(settings.getState(), getNumberInput()));
                break;
            case "multiply":
                updateDisplay(mathFunc.multiply(settings.getState(), getNumberInput()));
                break;
            case "divide":

                result = mathFunc.divide(settings.getState(), getNumberInput());
                result = generateError(result);

                updateDisplay(result);

                break;
            case "inverse":

                result = mathFunc.inverse(settings.getState());
                result = generateError(result);

                updateDisplay(result);

                break;
            case "square_root":

                result = mathFunc.squareRoot(settings.getState());
                result = generateError(result);

                updateDisplay(result);
                break;

            case "binary":
                settings.setCountingBase(CountingBase.BINARY);
                break;
            case "octal":
                settings.setCountingBase(CountingBase.OCTAL);
                break;
            case "decimal":
                settings.setCountingBase(CountingBase.DECIMAL);
                break;
            case "hexadecimal":
                settings.setCountingBase(CountingBase.HEXADECIMAL);
                break;
            case "change_base":
                settings.setCountingBase();
                break;
            case "quit":
                System.out.println("Turning off.");
                isOn = false;
                break;
            case "clear":
                isErr = false;
                updateDisplay(0);
                break;
            default:
                System.out.println("Please input a valid command.");
        }
    }


    public void updateDisplay (double val) {

        if (isErr) {

            System.out.println("Err");

        } else {
            settings.setState(val);
            double newState = settings.getState();

            switch (settings.getCountingBase()) {


                case BINARY:

                    System.out.println("The result is: " + Integer.toBinaryString((int) newState)); //from stack overflow
                    break;

                case OCTAL:

                    System.out.println("The result is: " + Integer.toOctalString((int) newState));
                    break;

                case DECIMAL:
                    System.out.println("The result is: " + newState);
                    break;

                case HEXADECIMAL:

                    System.out.println("The result is: " + Integer.toHexString((int) newState));
                    break;

                default:
                    System.out.println("Something has gone horribly wrong.");


            }
        }
    }

    public void clearError (String command) {

        if (isErr) {

            switch (command) {

                case "clear":
                    isErr = false;
                    break;
                case "quit" :
                    isErr = false;
                    break;
                default:
                    System.out.println("Please clear the display.");
                    System.out.println("Err");
                    receiveCommand();

            }

        }
    }

    public double generateError (double result) {
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY || Double.isNaN(result)) {
            //isNaN and Infinity constants from Stack Overflow
            isErr = true;
            result = 0;
        }
        return result;
    }
}
