package ford.ford;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created by rahmirford on 4/29/17.
 */

public class CalculatorInput {
    public String userOperator;

    public String acceptUserOperator() {
        System.out.print("choose an operator (*, +, -, /, sq, sqrt) ");
        Scanner sc = new Scanner(in);
        userOperator = sc.nextLine();
        return userOperator;
    }

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

            // Come back to add square root and square handling
//        } else if (userOperator.equals("sq")) {
//        unicodeValue = 47.0;
//        return unicodeValue;
//
//        } else if (userOperator.equals("sqrt")) {
//        unicodeValue = 47.0;
//        return unicodeValue;

        } else {
            return 0;
        }


//    public char userOperator(char x){
//        return 0;
//    }
    }
}
