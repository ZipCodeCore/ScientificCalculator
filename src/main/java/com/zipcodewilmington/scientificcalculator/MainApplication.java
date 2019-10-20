package com.zipcodewilmington.scientificcalculator;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);


        boolean isOn = true;
        double number1;
        double number2;


        while (isOn) {

            Console.println("Welcome to my calculator!\n ");

            String operation = Console.getStringInput("What would you like to do today ? \n \n" +
                    "hit + for addition \n" +
                    "hit - for sub \n" +
                    "hit * for multiplication \n" +
                    "hit / for division \n" +
                    "hit Sq for Square root \n" +
                    "hit S for square \n" +
                    "hit C for cube Root \n" +
                    "hit E for exponent \n" +
                    "hit L for log10 \n" +
                    "hit # to exit");

            switch (operation) {

                case "+":
                    number1 = Console.getDoubleInput(" Enter first number");
                    number2 = Console.getDoubleInput(" Enter second number");
                    Console.print("Your answer for " + number1 + " + " + number2 + " = ");
                    System.out.println(Arithmetic.addition(number1, number2));
//                    Console.getStringInput("");
                    break;

                case "-":
                    number1 = Console.getDoubleInput(" Enter first number");
                    number2 = Console.getDoubleInput(" Enter second number");
                    Console.print("Your answer for " + number1 + " - " + number2 + " is: ");
                    System.out.println(Arithmetic.sub(number1, number2));
                    //Console.getStringInput( "");
                    break;

                case "*":
                    number1 = Console.getDoubleInput(" Enter first number");
                    number2 = Console.getDoubleInput(" Enter second number");
                    Console.print("Your answer for " + number1 + " * " + number2 + " is: ");
                    System.out.println(Arithmetic.multiplication(number1, number2));
//                    Console.getStringInput("");
                    break;

                case "/":
                    number1 = Console.getDoubleInput(" Enter first number");
                    number2 = Console.getDoubleInput(" Enter second number");
                    Console.print("Your answer for " + number1 + " / " + number2 + " is: ");
                    System.out.println(Arithmetic.division(number1, number2));
//                    Console.getStringInput("");
                    break;


                case "sq":
                    number1 = Console.getDoubleInput(" Enter first number");
                    Console.print("Your answer for " + number1 + " Square root is: ");
                    System.out.println(Arithmetic.sqrt(number1));
//                    Console.getStringInput("");
                    break;

                case "s":
                    number1 = Console.getDoubleInput(" Enter first number");
                    Console.print("Your answer for " + number1 + " Square  is: ");
                    System.out.println(Arithmetic.square(number1));
//                    Console.getStringInput("");
                    break;

                case "c":
                    number1 = Console.getDoubleInput(" Enter number");
                    Console.print("Your answer for " + number1 + " Cube root is: ");
                    System.out.println(Arithmetic.cbrt(number1));
//                    Console.getStringInput("");
                    break;

                case "e":
                    number1 = Console.getDoubleInput(" Enter first number");
                    number2 = Console.getDoubleInput(" Enter second number");
                    Console.print("Your answer for " + number1 + " Exponent is: ");
                    System.out.println(Arithmetic.exponent(number1, number2));
//                    Console.getStringInput("");
                    break;

                case "l":
                    number1 = Console.getDoubleInput(" Enter first number");
                    Console.print("Your answer for " + number1 + " log10 is: ");
                    System.out.println(Arithmetic.log10(number1));
//                    Console.getStringInput("");
                    break;

                case "#":
                    System.exit(0);
                    break;

                default:
                    System.out.println(" Enter valid input ");
                    break;

            }

        }

    }

}
