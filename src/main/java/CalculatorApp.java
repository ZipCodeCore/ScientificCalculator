import java.util.Scanner;


public class CalculatorApp {

    public static void main (String[] args) {

        double leftOperand;
        double rightOperand;
        double result;
        char operator;

        Scanner userInput = new Scanner(System.in);
        BasicMath execute = new BasicMath();

        do {
            System.out.print("Enter a number: ");
            while (!userInput.hasNextDouble()) {
                userInput.next();
                System.out.print("Enter a number: ");
            }
        }   while ( !userInput.hasNextDouble() );
        leftOperand = userInput.nextDouble();

        System.out.print("Choose an operator : + , - , / , * , ^ : ");
        operator = userInput.next().charAt(0);

        do {
            System.out.print("Enter a number: ");
            while (!userInput.hasNextDouble()) {
                userInput.next();
                System.out.print("Enter a number: ");
            }
        }   while ( !userInput.hasNextDouble() );
        rightOperand = userInput.nextDouble();



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
                    System.out.println("ERR");
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
            // Can't seem to find a way to eliminate the rightOperand input ...
            /* case '√':
                result = execute.squareRoot(leftOperand);
                System.out.print("√" +leftOperand + " = " + result);
                break;
            */

            default:
                System.out.println("Invalid operation");

        }


    }
}


