package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //welcome the user
        System.out.println("Hey! Welcome to the calculator!\nWould you care for a drink?\n");

        //ask the user for a value
        System.out.println("Enter your value");
        String userValueAsString = scanner.nextLine();
        Double userValue1 = Double.parseDouble(userValueAsString);

        //ask the user for a operator
        //should eventually test to see if they've entered a proper input
        //should also eventually System.out.println a list for them to choose from
        System.out.println("Choose your Operator");
        String userOperator = scanner.nextLine();


        //create an array of each operation that requires two values
        String[] need2Values = {"add", "subtract", "multiply", "divided", "exponent"};
        //turn that array into a string
        List<String> need2ValuesList = Arrays.asList(need2Values);

        //test the array to see if the userOperator is included
        if (need2ValuesList.contains(userOperator)) {
            //ask for a second value
            System.out.println("Enter your second value");
            String userValue2AsString = scanner.nextLine();;
            Double  userValue2 = Double.parseDouble(userValue2AsString);

            //run the need2value operators INSIDE the if statement
            switch (userOperator) {
                case "add":
                    Addition add = new Addition ();
                    double sum = add.add(userValue1, userValue2);
                    System.out.println(userValue1 + " + " + userValue2 + " = " + sum);
                    break;
                case "subtract":
                    Subtraction subtract = new Subtraction();
                    double difference = subtract.subtract(userValue1, userValue2);
                    System.out.println(userValue1 + " - " + userValue2 + " = " + difference);
                    break;
            }
        }
    }
}

