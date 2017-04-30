import java.util.Scanner;

/**
 * Created by cameronsima on 4/29/17.
 */
public class Calculator {

    private String currentOperator;

    public Calculator() {
        currentOperator = "";
    }

    private void setCurrentOperator(String operator) {
        currentOperator = operator;
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

    private double handleSecondNumber(double number, double number2) {

        if (currentOperator == "+") {
            return add(number, number2);
        } else if (currentOperator == "-") {
            return subtract(number, number2);
        } else if (currentOperator == "*") {
            return multiply(number, number2);
        } else if (currentOperator == "/") {
            return divide(number, number2);
        } else {
            return 0.0;
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

    private void mainLoop() {
        Display display = new Display();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(display.getCurrentValue());
            double currentVal = convertToDouble(display.getCurrentValue());
            String input = scanner.nextLine();

            if (input == "quit" || input == "q") {
                break;
            }

            if (currentOperator.equals("")) {
                handleGetOperator(input);
                continue;
            } else {
                display.setCurrentValue(input);
            }


            double result = handleSecondNumber(currentVal, convertToDouble(input));
            display.setCurrentValue(Double.toString(result));


        }

    }

    private double convertToDouble(String input) {
        return Double.parseDouble(input);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.mainLoop();

    }
}
