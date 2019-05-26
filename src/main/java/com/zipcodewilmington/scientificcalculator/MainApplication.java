package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Console.println("Welcome to our calculator!");
        String s = Console.getStringInput("Enter the required mathematical operation").toLowerCase();
        ScientificCalc sci = new ScientificCalc();
        while (!s.equalsIgnoreCase("great")) {
             Integer i = Console.getIntegerInput("Enter an integer value as operand");
            Double d = Console.getDoubleInput("Enter a double value as the operand");

            Console.println("The user input %s as the required operation ", s);
            Console.println("The user input %s as an integer", i);
            Console.println("The user input %s as a input operand ", d);
                System.out.println("The computed value of the operation is " + sci.MathOperation(s, d,i));

                s = Console.getStringInput("Enter another mathematical operation or 'Great' to Exit!").toLowerCase();
            }
            System.out.println("Thank you for using our calculator, Enjoy your rest of the day");
        }
    }




