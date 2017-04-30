package com.brownmark;
import java.util.Scanner;


public class UserInput {


    public UserInput() {}


    public String getOperandInput() {
        System.out.println("Input a number operand. Or \"c\" to clear or \"e\" to exit");
        Scanner operandInput = new Scanner(System.in);
        return operandInput.nextLine();
    }


    public String getOperator() {
        System.out.println("Input an operator. Or \"c\" to clear or \"e\" to exit");
        Scanner operandInput = new Scanner(System.in);
        return operandInput.nextLine();
    }


}
