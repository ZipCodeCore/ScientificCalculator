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
        Console.println("Your current total is %.2f", user.displayVal);

        //Start Program 1st Round
        while (true) {
            //Stores Operation
            String operator = "";

            //Ask for operation to perform and print to console
            operator = AskNumber.getOperation();
            Console.println("You selected " + operator);

//            //Asks for first value and stores it in user totalVal
//            user.firstVal = AskNumber.askDouble();
//
//            //Push first value to display and print display
//            user.displayVal = user.firstVal;
//            Console.println("Your current total is %.2f", user.displayVal);


            if (operator.equalsIgnoreCase("Add")) {
                user.firstVal = AskNumber.askDouble();
                user.secondVal = AskNumber.askDouble();
                user.displayVal = MathMethods.add(user.firstVal, user.secondVal);
                Console.println("Your current total is %.2f", user.displayVal);
            } else if (operator.equalsIgnoreCase("Subtract")) {
                user.firstVal = AskNumber.askDouble();
                user.secondVal = AskNumber.askDouble();
                user.displayVal = MathMethods.subtract(user.firstVal, user.secondVal);
                Console.println("Your current total is %.2f", user.displayVal);
            } else if (operator.equalsIgnoreCase("Multiply")) {
                user.firstVal = AskNumber.askDouble();
                user.secondVal = AskNumber.askDouble();
                user.displayVal = MathMethods.multiplication(user.firstVal, user.secondVal);
                Console.println("Your current total is %.2f", user.displayVal);
            } else if (operator.equalsIgnoreCase("Divide")) {
                user.firstVal = AskNumber.askDouble();
                user.secondVal = AskNumber.askDouble();
                while (user.secondVal == 0) {
                    Console.println("Your result will produce an Error! Please provide a new number");
                    user.secondVal = AskNumber.askDouble();
                }
                user.displayVal = MathMethods.division(user.firstVal, user.secondVal);
                Console.println("Your current total is %.2f", user.displayVal);
            } else if (operator.equalsIgnoreCase("Remainder")) {
                user.firstVal = AskNumber.askDouble();
                user.secondVal = AskNumber.askDouble();
                user.displayVal = MathMethods.remainder(user.firstVal, user.secondVal);
                Console.println("Your current total is %.2f", user.displayVal);
            } else if (operator.equalsIgnoreCase("Clear")) {
                user.displayVal = 0;
                Console.println("Your current total is %.2f", user.displayVal);
                break;

            }

            //Start Program 1st Round
            while (true) {
                //Stores Operation and then clears operation on loop
                String nextOperator = "";

                //Ask for operation and print to console
                nextOperator = AskNumber.getOperation();
                Console.println("You selected ", nextOperator);

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
                    while (user.secondVal == 0) {
                        Console.println("Your result will produce an Error! Please provide a new number");
                        user.secondVal = AskNumber.askDouble();
                    }
                    user.displayVal = MathMethods.division(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Remainder")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.remainder(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Clear")) {
                    user.displayVal = 0;
                    Console.println("Your current total is %.2f", user.displayVal);
                    break;
                }

            }

        }

    }
}
