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

        myCalc.drawScreen(Double.toString(y));

        while(true) {

            String op = Console.getStringInput("Please enter the operation you would like to perform:");
            if (op.equalsIgnoreCase("clear")) {
                ans = 0;
                myCalc.drawScreen(Double.toString(ans));
            } else if (op.equalsIgnoreCase("add") || op.equalsIgnoreCase("subtract") || op.equalsIgnoreCase("multiply") || op.equalsIgnoreCase("exponential")) {
                double secondNum = Console.getDoubleInput("Please enter your second number or enter \"Memory\" for your stored value");
                ans = myCalc.performOperation(op, y, secondNum);
                myCalc.drawScreen(Double.toString(ans));
            } else if  (op.equalsIgnoreCase("divide")){
                double secondNum = Console.getDoubleInput("Please enter your second number or enter \"Memory\" for your stored value");
                if (secondNum == 0) {
                    String error = "Can't divide by zero";
                    myCalc.drawScreen(error);
                }
                else {
                    ans = myCalc.performOperation(op, y, secondNum);
                    myCalc.drawScreen(Double.toString(ans));
                }
            }
            else {
                ans = myCalc.performOperation(op, y);
                myCalc.drawScreen(Double.toString(ans));
            }

        }




        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a d", d);
        //Console.println("The user input %s as a integer", i);

    }
}