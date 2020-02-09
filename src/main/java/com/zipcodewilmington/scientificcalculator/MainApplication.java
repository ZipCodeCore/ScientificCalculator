package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        Features f = new Features();
        SciFeatures sf = new SciFeatures();

        Console.println("Welcome to my calculator!");

        String s = Console.getStringInput("Please enter your name?");

        int display = 0;
        int r = 1;
        do {
            try {
                Double calcString = Console.getDoubleInput("Press 1 for base calculator and 2 for scientific calculator. ");

                if (calcString == 1) {
                    Console.println("Current number is :" + display);

                    Double i = Console.getDoubleInput("Please enter another number if you want:");

                    boolean check = true;
                    while (check) {
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
                        } else if (op.equals("/")) {
                            Double i1 = Console.getDoubleInput("Please next number:");
                            if (i1 == 0) {
                                Console.println("Err");
                            } else {
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
                        } else if (op.equals("end")) {
                            check = false;
                        } else {
                            Console.println("Err");
                        }
                    }
                } else if (calcString.equals(2)) {
                    //scientific calculator
                }
            } catch (Exception e) {
                Console.println("Wrong input");
            }
        } while (r == 1) ;



    }
}
