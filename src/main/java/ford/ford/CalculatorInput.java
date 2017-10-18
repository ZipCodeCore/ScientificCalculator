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
    public String userInputValidator(String userOperator) {
       double x = userInputValue;
       double y = userInputValue;

        if (userOperator.equals("+")) {
            BasicMath.add(x, y);

        } else if (userOperator.equals("/")) {
            BasicMath.divide(x, y);

        } else if (userOperator.equals("-")) {
            BasicMath.subtract(x, y);

        } else if (userOperator.equals("*")) {
            BasicMath.multiply(x, y);

        } else if (userOperator.equals("sq")) {
            BasicMath.findSquare(x);

        } else if (userOperator.equals("sqrt")) {
            BasicMath.findSquareRoot(x);
        } else {
            acceptUserOperator();
        }

        return userOperator;
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

    /*  Operation output: accept value 1, value 2, and operator
        switch statement to choose
    */
    public double mathEquationOutput(double x, double y, String z){
        return 0;
    }

}
