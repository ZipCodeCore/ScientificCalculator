import java.util.Scanner;

/**
 * Created by cameronsima on 4/29/17.
 */
public class Calculator {

    private String currentOperator;

    public Calculator() {
        currentOperator = "";
    }

    public void setCurrentOperator(String operator) {
        currentOperator = operator;
    }

    public String getCurrentOperator() {
        return currentOperator;
    }


    private void handleGetOperator(String input) {
        switch(input) {
            case "+":
                setCurrentOperator(input);
                break;
            case "-":
                setCurrentOperator(input);
                break;
            case "/":
                setCurrentOperator(input);
                break;
            case "*":
                setCurrentOperator(input);
                break;
            default:
                break;
        }
    }

    private double handleSecondNumber(double number, double number2) throws Exception{

        if (currentOperator == "+") {
            return add(number, number2);
        } else if (currentOperator == "-") {
            return subtract(number, number2);
        } else if (currentOperator == "*") {
            return multiply(number, number2);
        } else if (currentOperator == "/") {
            return divide(number, number2);
        } else {
            Exception e = new Exception();
            throw e;

        }
    }

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    public void clearOperator() {
        currentOperator = "";
    }

    // I can't seem to quite figure out this implementation...
    private void mainLoop() {
        Display display = new Display();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(display.getCurrentValue());
            String input = scanner.nextLine();

            if (input == "quit" || input == "q") {
                break;
            }

            if (input == "clear" || input == "c") {
                display.clear();
                continue;
            }

            if (display.validateDouble(input)) {
                try {
                    double result = handleSecondNumber(convertToDouble(display.getCurrentValue()), convertToDouble(input));
                    display.setCurrentValue(Double.toString(result));
                } catch (Exception e) {
                    display.setCurrentValue(input);
                }
            } else {
                try {
                    handleGetOperator(input);
                } catch (Exception e) {
                    display.sendErr();
                }
            }

        }

    }

    private double convertToDouble(String input) {
        System.out.println(input);
        return Double.parseDouble(input);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.mainLoop();

    }
}
