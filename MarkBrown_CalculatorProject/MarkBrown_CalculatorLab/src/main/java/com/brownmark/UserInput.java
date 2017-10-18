package com.brownmark;
import java.util.Scanner;



public class UserInput {



    public UserInput() {}



    public String getOperandInput() {
        Scanner operandInput = new Scanner(System.in);
        return operandInput.nextLine();
    }



    public String getOperator() {
        Scanner operandInput = new Scanner(System.in);
        return operandInput.nextLine();
    }



}
