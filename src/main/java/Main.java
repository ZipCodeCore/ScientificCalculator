/**
 * Created by brianmullin on 4/29/17.
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CalcEngine calc = new CalcEngine();
        //Display display = new Display();

        System.out.println("Welcome to Brian's Simple Calculator");
        System.out.println("Select an Operation to perform:");
        System.out.println("Type 1 for addition.");
        System.out.println("Type 2 for subtraction.");
        System.out.println("Type 3 for multiplication.");
        System.out.println("Type 4 for division.");
        System.out.println("Type 5 to Square.");
        System.out.println("Type 6 to find Square Root.");
        System.out.println("Enter your choice: ");

        int choice = input.nextInt();

        System.out.println("You chose " + choice + ".");

        System.out.println("Choose first number: ");
        double firstNumber = input.nextInt();

        System.out.println("Choose second number: ");
        double secondNumber = input.nextInt();



        switch(choice) {
            case 1:
                System.out.println("The result is " + calc.add(firstNumber, secondNumber) + ".");
                break;

            case 2:
                System.out.println("The result is " + calc.subtract(firstNumber, secondNumber) + ".");
                break;

            case 3:
                System.out.println("The result is " + calc.multiply(firstNumber, secondNumber) + ".");
                break;

            case 4:
                System.out.println("The result is " + calc.divide(firstNumber, secondNumber) + ".");
                break;

            case 5:
                System.out.println("The result is " + calc.square(firstNumber) + ".");
                break;

            case 6:
                System.out.println("The result is " + calc.squareRoot(firstNumber) + ".");

            default:
                System.out.println("Not a valid Operation.");
        }


    }



}
