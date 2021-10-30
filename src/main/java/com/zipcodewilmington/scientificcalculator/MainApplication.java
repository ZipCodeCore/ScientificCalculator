package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

       /* Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d)*/
        Scanner scan = new Scanner(System.in);

        System.out.println("select\n 1) add \n 2) subtract\n 3) multiply \n 4) divison\n");
        Integer choice = scan.nextInt();






        System.out.println("Enter first number");
        Double input1 = scan.nextDouble();

        System.out.println("Enter second number");
        Double input2 = scan.nextDouble();


        BasicCalculator calc = new BasicCalculator();

        switch (choice){
            case 1:
                System.out.println(calc.add(input1, input2));
            break;
            case 2:
                System.out.println(calc.subtract(input1, input2));
            break;
            case 3:
                System.out.println(calc.multiply(input1, input2));
            break;
            case 4:
                System.out.println(calc.divide(input1, input2));

        }





    }
}
