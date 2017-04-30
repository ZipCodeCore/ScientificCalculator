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
    public void getUserInput() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            String input = scanner.nextLine();
            handleInput(input);

        }
    }


    private void handleInput(String input, double currentValue) {
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
            case ()
            default:
                return input;
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
        String currentVal = display.getCurrentValue();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(currentVal);
            String input = scanner.nextLine();


            handleInput(input, convertToDouble(currentVal));

        }

    }

    private double convertToDouble(String input) {
        return Double.parseDouble(input);
    }

    public static void main(String[] args) {





    }
}
