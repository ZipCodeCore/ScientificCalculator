package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {


        //New User
        Calculator user = new Calculator(0, 0, 0, 0);
        Console.println("Simple Calculator!");

        /////Print Starting Display
        Console.println("Your current total is %.2f", user.getDisplayVal());

        //Start Program 1st Round
        while (true) {

            //Stores Operation
            String operator = "";

            //Get first value and set to display value
            user.setFirstVal("Enter a starting value");
            Console.println("Your current total is %.2f", user.getDisplayVal());

            //Start program operations loop
            while (true) {
                //Ask for operation and print to console
                String nextOperator;
                nextOperator = AskNumber.getOperation();

                if (nextOperator.equalsIgnoreCase("Add")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.add(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Subtract")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.subtract(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Multiply")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.multiplication(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Divide")) {
                    user.secondVal = AskNumber.askDouble();
                    if (user.secondVal == 0) {
                        Console.println("ERROR!");
                        user.displayVal = 0;
                        Console.println("Your current total is %.2f", user.getDisplayVal());
                        user.setFirstVal("Enter a starting value");
                    } else
                    user.displayVal = MathMethods.division(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Remainder")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.remainder(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Square")) {
                    user.displayVal = MathMethods.square(user.displayVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("SquareRoot")) {
                    user.displayVal = MathMethods.squareRoot(user.displayVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("VariableExpo")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.variExpo(user.displayVal,user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Clear")) {
                    user.clearDisplayVal();
                    break;
                }
            }
        }
    }
}
