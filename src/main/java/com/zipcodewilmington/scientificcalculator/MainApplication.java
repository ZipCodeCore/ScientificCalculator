package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        Features f = new Features();

        Console.println("Welcome to my calculator!");

        String s = Console.getStringInput(" Please enter your name?");

        int display = 0;
        Console.println("Current number is :" + display);

        Double i = Console.getDoubleInput("Please enter a number:");

        boolean check = true;
        while (check)
        {
            String op = Console.getOperationInput("Enter an operation : +, - , *, /, ^2, ^y, inverse, sqrt, invert, c, end : ");


            if (op.equals("+")) {
                Double i1 = Console.getDoubleInput("Please next number:");
                Console.println("New Value is: " + f.add(i, i1));
                i = f.add(i, i1);
            } else if (op.equals("-")) {
                Double i1 = Console.getDoubleInput("Please next number:");
                Console.println("New Value is:" + f.subtract(i, i1));
            } else if (op.equals("*")) {
                Double i1 = Console.getDoubleInput("Please next number:");
                Console.println("New Value is:" + f.multiply(i, i1));
            } else if (op.equals("/"))
            {
                Double i1 = Console.getDoubleInput("Please next number:");
                if (i1 == 0) {
                    Console.println("Err");
                }
                else {
                    Console.println("New Value is:" + f.divide(i, i1));
                }
            } else if (op.equals("^y")) {
                Double i1 = Console.getDoubleInput("Please next number:");
                Console.println("New Value is:" + f.exponent(i, i1));

            } else if (op.equals("^2")) {
                Console.println("New Value is:" + f.square(i));
            } else if (op.equals("sqrt")) {
                Console.println("New Value is:" + f.root(i));
            } else if (op.equals("inverse")) {
                Console.println("New Value is:" + f.inverse(i));
            } else if (op.equals("invert")) {
                Console.println("New Value is:" + f.invert(i));
            } else if (op.equals("c")) {
                Console.println("New Value is:" + f.clear());
            } else if (op.equals("end"))
            {
                check = false;
            }
            else {
                Console.println("Err");
            }


            //Scanner username = new Scanner(System.in);
            //String user = username.nextLine();
            //System.out.print("Hello " + user + " !");


            //Double i = Console.getDoubleInput("Enter a number");
            //Scanner number = new Scanner(System.in);
            //int


            //String s = Console.getStringInput("Enter a string");
            //Double i = Console.getDoubleInput("Enter an Double");
            //Double d = Console.getDoubleInput("Enter a double.");

            //Console.println("Hello" + s);
            //Console.println("The user input %s as a Double", i);
            //Console.println("The user input %s as a d", d);
        }
    }
}

