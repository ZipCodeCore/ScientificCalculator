package ford.ford;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created by rahmirford on 4/29/17.
 */

public class CalculatorInput {
    public String userOperator;
    public double userInputValue;

    // Prompts user to supply an operator for math equations
    public String acceptUserOperator() {
        System.out.print("choose an operator (*, +, -, /, sq, sqrt): ");
        Scanner sc = new Scanner(in);
        userOperator = sc.nextLine();
        return userOperator;
    }
    // Test to make sure user operator is valid for input
    public double userInputValidator(String userOperator) {
        double unicodeValue;
        if (userOperator.equals("+")) {
            unicodeValue = 43.0;
            return unicodeValue;

        } else if (userOperator.equals("-")) {
            unicodeValue = 45.0;
            return unicodeValue;

        } else if (userOperator.equals("*")) {
            unicodeValue = 42.0;
            return unicodeValue;

        } else if (userOperator.equals("/")) {
            unicodeValue = 47.0;
            return unicodeValue;

        } else if (userOperator.equals("sq")) {
        unicodeValue = 2.0;
        return unicodeValue;

        } else if (userOperator.equals("sqrt")) {
        unicodeValue = 1.0;
        return unicodeValue;

        } else return Float.NaN;   // need to return to user that input is invalid

    }

    // Accepts value input from user
    public double acceptUserValue(){
        System.out.print("Enter a value: ");
        Scanner sc = new Scanner(in);
        userInputValue = Double.valueOf(sc.nextLine());
        return userInputValue;
    }
    // Test to ensure user value input is valid for operations
    // If returns Float.NaN will need to handle to receive valid input
    public double userValueInputValidator(double userInputValue){
        if (userInputValue != Float.NaN) {
            return userInputValue;
        } else {
            return Float.NaN;
        }
    }


}
