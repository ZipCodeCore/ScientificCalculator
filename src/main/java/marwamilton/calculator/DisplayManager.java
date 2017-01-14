package marwamilton.calculator;

import java.util.Scanner;

/**
 * Created by mkulima on 1/13/17.
 */
public class DisplayManager {
    String displayedString;
    Boolean displayOn = false;


    public void newCalculatorStartMessage(){
        System.out.println();
        System.out.println("Calculator is running.");
        System.out.println("Please type desired operation: ");
        System.out.println("____________________________________________________________________");
        System.out.println();
    }

    public void CalculatorMessage(String previousDisplayContents){
        System.out.println("____________________________________________________________________");
        System.out.println("Calculator is running");
        System.out.println("The previous operation was: " + previousDisplayContents);
        System.out.println("Please type desired operation: ");
        System.out.println("____________________________________________________________________");
        System.out.println();
    }

    public String getUserInput(){
        Scanner scan = new Scanner(System.in);
        String desiredOperation = scan.nextLine();
        return desiredOperation;
    }

}
