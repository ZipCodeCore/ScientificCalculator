package marwamilton.calculator;

import java.text.DecimalFormat;
import java.text.Format;
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

    public String getUserInput(){
        Scanner scan = new Scanner(in);
        String desiredOperation = scan.nextLine();
        //scan.close();
        return desiredOperation;
    }

    public void displayOperationResult(String[] nums, String operator, double operationResult, String format){
        /* This method takes in 4 inputs:
        * 1: a string array containing the user numbers
        * 2: the user operator, in string format
        * 3: the operation result, in double format
        * 4: a string called format that is a flag for the format to be applied*/
        if(format.equals("double"))
        out.println(nums[0] + " " + operator + " " + nums[1]+ " = " + operationResult);
        if(format.equals("D2"))
            out.println(String.format("%1$.2f " + operator + " %2$.2f = %3$.2f ", Double.parseDouble(nums[0]),Double.parseDouble(nums[1]), operationResult));
        if(format.equals("E2")){
            Format dFormat = new DecimalFormat("0.0E0");
            out.print(dFormat.format(Double.parseDouble(nums[0])));
            out.print(" " + operator + " ");
            out.print(dFormat.format(Double.parseDouble(nums[1])));
            out.print(" = ");
            out.print(dFormat.format(operationResult));
            System.out.println();
        }
    }

}
