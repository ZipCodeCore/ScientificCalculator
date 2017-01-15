package marwamilton.calculator;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by mkulima on 1/13/17.
 */
public class DisplayManager {
    String displayedString;
    Boolean displayOn = false;


    public void newCalculatorStartMessage(){
        out.println();
        out.println("Calculator is running.");
        out.println("Please type desired operation: ");
        out.println("____________________________________________________________________");
        out.println();
    }

    public void CalculatorMessage(String previousDisplayContents){
        out.println("____________________________________________________________________");
        out.println("Calculator is running");
        out.println("The previous operation was: " + previousDisplayContents);
        out.println("Please type desired operation: ");
        out.println("____________________________________________________________________");
        out.println();
    }

    public String getUserInput(){
        Scanner scan = new Scanner(in);
        String desiredOperation = scan.nextLine();
        //scan.close();
        return desiredOperation;
    }

    public void displayOperationResult(String[] nums, String operator, double operationResult){
        out.println(nums[0] + " " + operator + " " + nums[1]+ " = " + operationResult);
    }

}
