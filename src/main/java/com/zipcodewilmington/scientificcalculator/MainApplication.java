package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        boolean runCheck = true;
    while(runCheck) {
        Double firstNum = Console.getDoubleInput("Enter first number");
        String operator = Console.getStringInput("Enter operator");
        Double secondNum = Console.getDoubleInput("Enter Second number");
        System.out.println(Operator.getOperator(operator, firstNum, secondNum));

        String statusCheck = Console.getStringInput("Press q to quit or the any key to continue");
        if(statusCheck.equals("q")){
            System.out.println("Goodbye");
            runCheck = false;
        }else{
            continue;
        }
    }




    }
}
