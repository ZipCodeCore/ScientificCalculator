/**
 * Created by danzygmund-felt on 4/30/17.
 */
import java.util.*;

public class InputReader {

    //from http://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
    private static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        ScientificCalculator calc = new ScientificCalculator();
        Display display = new Display();
        OperatorChecker checker = new OperatorChecker();
        Scanner scan = new Scanner(System.in);
        String input;
        double nextOperand;

        while (true) {
            input = scan.nextLine();
            if (checker.isUnaryOperation(input)) {
                switch (input) {
                    case "sq":
                        display.setDisplay(calc.square(display.getDisplay()));
                        break;
                    case "sqrt":
                        display.setDisplay(calc.squareRoot(display.getDisplay()));
                        break;
                    case "inv":
                        display.setDisplay(calc.inverse(display.getDisplay()));
                        break;
                    case "opp":
                        display.setDisplay(calc.opposite(display.getDisplay()));
                        break;
                    case "sin":
                        display.setDisplay(calc.sin(display.getDisplay()));
                        break;
                    case "cos":
                        display.setDisplay(calc.cos(display.getDisplay()));
                        break;
                    case "tan":
                        display.setDisplay(calc.tan(display.getDisplay()));
                        break;
                    case "asin":
                        display.setDisplay(calc.asin(display.getDisplay()));
                        break;
                    case "acos":
                        display.setDisplay(calc.acos(display.getDisplay()));
                        break;
                    case "atan":
                        display.setDisplay(calc.atan(display.getDisplay()));
                        break;
                    case "log10":
                        display.setDisplay(calc.log10(display.getDisplay()));
                        break;
                    case "tenpower":
                        display.setDisplay(calc.tenPower(display.getDisplay()));
                        break;
                    case "log":
                        display.setDisplay(calc.log(display.getDisplay()));
                        break;
                    case "epower":
                        display.setDisplay(calc.ePower(display.getDisplay()));
                        break;
                    case "factorial":
                        display.setDisplay(calc.factorial(display.getDisplay()));
                        break;
                    default:
                        display.setDisplay(Double.NaN);
                        break;
                }
            } else if (checker.isBinaryOperation(input)) {
                nextOperand = Double.parseDouble(scan.nextLine());
                switch (input) {
                    case "+":
                        display.setDisplay(calc.add(display.getDisplay(), nextOperand));
                        break;
                    case "-":
                        display.setDisplay(calc.subtract(display.getDisplay(), nextOperand));
                        break;
                    case "*":
                        display.setDisplay(calc.multiply(display.getDisplay(), nextOperand));
                        break;
                    case "/":
                        display.setDisplay(calc.divide(display.getDisplay(), nextOperand));
                        break;
                    case "^":
                        display.setDisplay(calc.exponent(display.getDisplay(), nextOperand));
                        break;
                    default:
                        display.setDisplay(Double.NaN);
                        break;
                }
            } else if (isNumeric(input)) {
                display.setDisplay(Double.parseDouble(input));
            } else if (input.equals("quit")) {
                break;
            } else if (input.equals("clear")) {
                display.clearDisplay();
            } else {
                display.setDisplay(Double.NaN);
                do {
                    input = scan.nextLine();
                    if (isNumeric(input)) {
                        display.setDisplay(Double.parseDouble(input));
                    }
                } while (!isNumeric(input));
            }
        }
    }
}