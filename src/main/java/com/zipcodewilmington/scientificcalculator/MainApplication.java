package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        double y;
        double ans;

        Console.println("Welcome to my calculator!");

        y = Console.getDoubleInput("Please enter your first number or enter \"Memory\" for your stored value");

        Calculator myCalc = new Calculator();

        myCalc.drawScreen(y);

        while(true) {

            String op = Console.getStringInput("Please enter the operation you would like to perform:");
            if (op.equalsIgnoreCase("clear")) {
                ans = 0;
            } else if (op.equalsIgnoreCase("add") || op.equalsIgnoreCase("subtract") || op.equalsIgnoreCase("multiply") || op.equalsIgnoreCase("divide") || op.equalsIgnoreCase("exponential")) {
                double secondNum = Console.getDoubleInput("Please enter your second number or enter \"Memory\" for your stored value");
                ans = myCalc.performOperation(op, y, secondNum);
            } else {
                ans = myCalc.performOperation(op, y);
            }

            myCalc.drawScreen(ans);
            y = ans;

        }




        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a d", d);
        //Console.println("The user input %s as a integer", i);

    }
}
