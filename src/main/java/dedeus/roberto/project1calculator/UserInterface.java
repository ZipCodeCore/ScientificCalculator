package dedeus.roberto.project1calculator;

import java.util.Scanner;

/**
 * Created by robertodedeus on 9/11/16.
 */
public class UserInterface {

    Scanner sc = new Scanner(System.in);

    public void output(String msg){
        System.out.println(msg);
    }

    public int drawMainMenu(){
        output("Main menu.");
        output("Choose an operation:");
        output("1. Addition");
        output("2. Subtraction");
        output("3. Multiplication");
        output("4 Division");
        return sc.nextInt();
    }

    public double promptOperand(){
        output("Enter operand: ");
        return sc.nextDouble();
    }
}
