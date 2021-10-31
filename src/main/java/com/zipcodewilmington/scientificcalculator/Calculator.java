package com.zipcodewilmington.scientificcalculator;

import java.security.Principal;

public class Calculator {
    public static void startCalc(Integer retries) {
        Console.println("Please enter 1 for a Basic Calculator or 2 for a Scientific Calculator.");
        String i = Console.getStringInput("Enter an integer!");
        if (i.equals("1")) {
            //return basicCalc;
            Console.println("This is where I will return a Basic Calc.");
        } else if (i.equals("2")) {
            //return scientificCalc;
            Console.println("This is where I will return a Scientific Calc.");
        } else if (retries < 5) {
            Console.println("User input %s is invalid.", i);
            retries += 1;
            startCalc(retries);
        } else {
            Console.println("User input %s is invalid.", i);
            Console.println("User has surpassed max number of retries.");
        }
    }

    public static String displayOutput() {
        return null;
    }
}
