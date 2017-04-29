import java.util.Scanner;


public class CalculatorApp {

    public static void main(String[] args) {

        double leftOperand;
        double rightOperand;
        double result = 0;
        char operator;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        leftOperand = userInput.nextDouble();
        System.out.print("Choose an operator + , - , / , * , ^ : ");
        operator = userInput.next().charAt(0);
        System.out.print("Enter a number: ");
        rightOperand = userInput.nextDouble();

        BasicMath execute = new BasicMath();

        switch (operator) {
            case '+':
                result = execute.add(leftOperand, rightOperand);
                System.out.print(leftOperand + " + " + rightOperand + " = " + result);
                break;
            case '-':
                result = execute.subtract(leftOperand, rightOperand);
                System.out.print(leftOperand + " - " + rightOperand + " = " + result);
                break;
            case '/':
                if (rightOperand != 0) {
                    result = execute.divide(leftOperand, rightOperand);
                    System.out.print(leftOperand + " / " + rightOperand + " = " + result);
                } else {
                    System.out.println("ERR - Divide by zero");
                    break;
                }
                break;
            case '*':
                result = execute.multiply(leftOperand, rightOperand);
                System.out.print(leftOperand + " * " + rightOperand + " = " + result);
                break;
            case '^':
                result = execute.exponential(leftOperand,rightOperand);
                System.out.print(leftOperand + "^" + rightOperand + " = " + result);
                break;
            default:
                System.out.println("Invalid operation");

        }


    }
}


