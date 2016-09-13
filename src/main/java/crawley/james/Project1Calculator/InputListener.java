package crawley.james.Project1Calculator;

import java.util.Scanner;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class InputListener {

    private Scanner scanner = new Scanner(System.in);
    private MathFunctions mathFunc = new MathFunctions();
    private CalculatorMemory calculatorMemory;
    private boolean isOn = true;
    private boolean isErr = false;
    private boolean isFirst = true;

    /**
     *
     * Sets the default counting base and trig units
     *
     * @param trigUnits the index of the trig units 0: degrees 1: radians
     * @param countingBase the index of the counting base 0: binary 1: octal 2: decimal 3: hexadecimal
     */
    public InputListener(int trigUnits, int countingBase) {

        calculatorMemory = new CalculatorMemory(trigUnits, countingBase);

    }

    /**
     *
     * Gets command from user
     *
     * @return command input by user
     */
    private String getCommand () {

        System.out.println("Input a command: ");
        return scanner.next();
    }

    /**
     *
     * Gets a number value from the user
     *
     * @return the value of the number input from the user
     */
    private double getNumberInput () {

        System.out.println("Input a number: ");

        return scanner.nextDouble();
    }

    /**
     *
     * Returns boolean representing if the calculator is running
     *
     * @return a boolean determing if the calculator is running
     */
    public boolean isRunning () {

        return isOn;
    }

    /**
     *
     * Uses user input to perform a calculation or change the calculator settings
     *
     */
    public void executeCommand() {

       double currentDisplayState;

        if (isFirst) {

            currentDisplayState =getNumberInput();
            isFirst = false;

        } else {
            currentDisplayState = calculatorMemory.getState();
        }

        String command = getCommand().toLowerCase();


        restrictCommands(command);

        switch (command) {
            case "add":
                updateDisplay(mathFunc.add(currentDisplayState, getNumberInput()));
                break;

            case "subtract":
                updateDisplay(mathFunc.subtract(currentDisplayState, getNumberInput()));
                break;

            case "multiply":
                updateDisplay(mathFunc.multiply(currentDisplayState, getNumberInput()));
                break;

            case "divide":

                currentDisplayState = mathFunc.divide(currentDisplayState, getNumberInput());
                currentDisplayState = checkError(currentDisplayState);

                updateDisplay(currentDisplayState);

                break;

            case "square":
                updateDisplay(mathFunc.square(currentDisplayState));
                break;

            case "square_root":

                currentDisplayState = mathFunc.squareRoot(currentDisplayState);
                currentDisplayState = checkError(currentDisplayState);

                updateDisplay(currentDisplayState);
                break;

            case "cube":
                updateDisplay(mathFunc.cube(currentDisplayState));
                break;

            case "cube_root":
                updateDisplay(mathFunc.cubeRoot(currentDisplayState));
                break;

            case "exponent":
                updateDisplay(mathFunc.exponent(currentDisplayState, getNumberInput()));
                break;

            case "inverse":

                currentDisplayState = mathFunc.inverse(currentDisplayState);
                currentDisplayState = checkError(currentDisplayState);

                updateDisplay(currentDisplayState);

                break;

            case "switch_sign":
                updateDisplay(mathFunc.switchSign(currentDisplayState));
                break;

            case "sine":

                if (calculatorMemory.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(calculatorMemory.getState());
                }
                updateDisplay(mathFunc.sine(currentDisplayState));
                break;

            case "cosine":

                if (calculatorMemory.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(calculatorMemory.getState());
                }
                updateDisplay(mathFunc.cosine(currentDisplayState));
                break;

            case "tangent":


                if (calculatorMemory.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(calculatorMemory.getState());
                }

                currentDisplayState = mathFunc.tangent(currentDisplayState);
                currentDisplayState = checkError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "inverse_sine":

                if (calculatorMemory.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(calculatorMemory.getState());
                }

                currentDisplayState = mathFunc.inverseSine(currentDisplayState);
                currentDisplayState = checkError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;


            case "inverse_cosine":

                if (calculatorMemory.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(calculatorMemory.getState());
                }

                currentDisplayState = mathFunc.inverseCosine(currentDisplayState);
                currentDisplayState = checkError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "inverse_tangent":

                if (calculatorMemory.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(calculatorMemory.getState());
                }

                currentDisplayState = mathFunc.inverseTangent(currentDisplayState);
                currentDisplayState = checkError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;


            case "factorial":
                currentDisplayState = checkOverflow((long) currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "logarithm":
                currentDisplayState = mathFunc.logarithm(currentDisplayState);
                currentDisplayState = checkError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "natural_logarithm":
                currentDisplayState = mathFunc.naturalLogarithm(currentDisplayState);
                currentDisplayState = checkError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "inverse_logarithm":
                updateDisplay(mathFunc.inverseLogarithm(currentDisplayState));
                break;

            case "inverse_natural_logarithm":
                updateDisplay(mathFunc.inverseNaturalLogarithm(currentDisplayState));
                break;

            case "binary":
                calculatorMemory.setCountingBase(CountingBase.BINARY);
                break;

            case "octal":
                calculatorMemory.setCountingBase(CountingBase.OCTAL);
                break;

            case "decimal":
                calculatorMemory.setCountingBase(CountingBase.DECIMAL);
                break;

            case "hexadecimal":
                calculatorMemory.setCountingBase(CountingBase.HEXADECIMAL);
                break;

            case "change_base":
                calculatorMemory.setCountingBase();
                break;

            case "radians":
                calculatorMemory.setTrigUnits(TrigUnits.RADIANS);
                break;

            case "degrees":
                calculatorMemory.setTrigUnits(TrigUnits.DEGREES);
                break;

            case "change_units":
                calculatorMemory.setTrigUnits();
                break;

            case "quit":
                System.out.println("Turning off.");
                isOn = false;
                break;

            case "clear":
                isErr = false;
                isFirst = true;
                updateDisplay(0);
                break;

            case "store":
                calculatorMemory.setMemory(calculatorMemory.getState());
                break;

            case "recall":
                updateDisplay(calculatorMemory.getMemory());
                break;

            case "clear_memory":
                calculatorMemory.setMemory(0);
                break;

            case "help":
                System.out.println("Commands: ");
                System.out.println("add");
                System.out.println("subtract");
                System.out.println("multiply");
                System.out.println("divide");
                System.out.println("square");
                System.out.println("square_root");
                System.out.println("cube_root");
                System.out.println("exponent");
                System.out.println("inverse");
                System.out.println("switch_sign");
                System.out.println("sine");
                System.out.println("cosine");
                System.out.println("tangent");
                System.out.println("inverse_sine");
                System.out.println("inverse_cosine");
                System.out.println("inverse_tangent");
                System.out.println("factorial");
                System.out.println("logarithm");
                System.out.println("inverse_logarithm");
                System.out.println("natural_logarithm");
                System.out.println("inverse_natural_logarithm");
                System.out.println("binary");
                System.out.println("octal");
                System.out.println("decimal");
                System.out.println("hexadecimal");
                System.out.println("change_base");
                System.out.println("degrees");
                System.out.println("radians");
                System.out.println("change_units");
                System.out.println("clear");
                System.out.println("store");
                System.out.println("recall");
                System.out.println("clear_memory");
                break;

            default:
                System.out.println("Please input a valid command.");
        }
    }


    /**
     *
     * Updates the display with the given value in the proper counting base. Prints Err if in error cycle.
     *
     * @param result the result of the executed command
     */
    private void updateDisplay (double result) {

        if (isErr) {

            System.out.println("Err");

        } else {
            calculatorMemory.setState(result);
            double newState = calculatorMemory.getState();

            switch (calculatorMemory.getCountingBase()) {


                case BINARY:

                    System.out.println("The result is: " + Integer.toBinaryString((int) newState)); //from stack checkOverflow
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

    /**
     *
     * Prevents user from executing commands other than "clear" and "quit" if the screen displays "Err"
     *
     * @param command the command the user is trying to execute
     */
    private void restrictCommands(String command) {

        if (isErr) {

            switch (command) {

                case "clear":
                    isErr = false;
                    isFirst = true;
                    break;
                case "quit" :
                    isErr = false;
                    break;
                default:
                    System.out.println("Please clear the display.");
                    System.out.println("Err");
                    executeCommand();

            }

        }
    }

    /**
     *
     * Checks if the result of a calculation is an illegal value and produces an error if so
     *
     * @param result the result of the calculation
     * @return
     */
    private double checkError(double result) {
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY || Double.isNaN(result)) {
            //isNaN and Infinity constants from Stack Overflow
            isErr = true;
            result = 0;
        }

        return result;
    }

    /**
     *
     * Produces an error if the factorial function overflows
     *
     * @param val the number on which factorial will be performed
     * @return returns the value of the factorial if there are no errors
     */
    private long checkOverflow(long val) {
        if (Math.abs(val) > 21) {
            isErr = true;
            val = 0;
        } else {
            val = mathFunc.factorial(val);
        }

        return val;
    }

}
