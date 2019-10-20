package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        String[] need2Values = new String[5];
        need2Values[] = {"add", "sub", "multi", "div", "exp"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey welcome to the calculator");

        System.out.println("Enter your name");
        String userName = scanner.nextLine();

        System.out.println("Enter your age");
        String userAgeAsString =  scanner.nextLine();
        Integer userAge = Integer.parseInt(userAgeAsString);
        
        System.out.println("Enter your value");
        String userValueAsString =  scanner.nextLine();
        Integer userValue = Integer.parseInt(userValueAsString);

        System.out.println("Choose your Operator");
        String userOperator =  scanner.nextLine();

        if(need2Values[].includes(userOperator)){
            System.out.println("Enter your second value");
            String userValue2AsString =  scanner.nextLine();
            Integer userValue2 = Integer.parseInt(userValue2AsString);
        }



        System.out.println("Enter your operator");
     //   String userOperator = scanner.nextLine();

     //   if(n2V[].inlcludes(userOperator))



    }
    public static void main1(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a double", d);
    }
}

