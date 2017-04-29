package banuelos.aurora;

import java.util.Scanner;

/**
 * Created by aurorabanuelos on 4/29/17.
 */
public class UserInput {


    Scanner in = new Scanner(System.in);

    public void print() {

        System.out.println("Enter first number: ");
        double firstOperand = in.nextDouble();
        System.out.println("Operators available are add, subtract, multiply, divide");
        System.out.println("Enter operator: ");
        String OpCode = in.next();
        System.out.println("Enter second number: ");
        double secondOperand = in.nextDouble();
    }

}
