package com.zipcodewilmington.scientificcalculator;

public class ErrorMessages {

    public static String errorMessage(Double d, Double d2, String s1) {

        if(d2 == 0 && s1.equalsIgnoreCase("divide")) {
            Console.println("You cannot divide by 0. \n");
            Intro.intro();

        } else if (d <0 && s1.equalsIgnoreCase("4")) {
            Console.println("You cannot find the square root of a negative number.");

        }
        return null;
    }

    public static void invalidSelection() {
        Console.println("Invalid option. Please try again.");
    }

    public static String noInverseZero(Double a)
    {
        if (a == 0)
        {
           Console.println("You cannot divide by 0. \n");
            Intro.intro();
        }
    }

}
