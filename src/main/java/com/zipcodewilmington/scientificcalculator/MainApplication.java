package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");

        Double firstNum = Console.getDoubleInput("Please enter your first number or enter \"Memory\" for your stored value");

        Calculator myCalc = new Calculator();
        myCalc.drawScreen(firstNum);

        String op = Console.getStringInput("Please enter the operation you would like to perform:");
        double ans = myCalc.performOperation(op,firstNum);
        myCalc.drawScreen(ans);




        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a d", d);
        //Console.println("The user input %s as a integer", i);

    }
}
