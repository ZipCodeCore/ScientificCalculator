package com.zipcodewilmington.scientificcalculator;

public class Intro {

    public static String intro() {

        Console.println("\nWelcome to my calculator! \n");

        String s = Console.getStringInput(
                "What would you like to do? \n" +
                        "1. Arithmetic \n" +
                        "2. Trigonometry \n" +
                        "3. Exponents \n" +
                        "4. Exit \n");

        if (s.equalsIgnoreCase("1")) {
            String s1 = Console.getStringInput(
                    "Enter an operation \n" +
                            "1. Add \n" +
                            "2. Subtract \n" +
                            "3. Multiply \n" +
                            "4. Divide \n");

            if (s1.equalsIgnoreCase("1")) {
                Double d = Console.getDoubleInput("Enter a double.");
                Double d2 = Console.getDoubleInput("Enter another double.");
                Arithmetic.addition(d, d2);
                Intro.intro();

            } else if (s1.equalsIgnoreCase("2")) {
                Double d = Console.getDoubleInput("Enter a double.");
                Double d2 = Console.getDoubleInput("Enter another double.");
                Arithmetic.subtraction(d, d2);
                Intro.intro();

            } else if (s1.equalsIgnoreCase("3")) {
                Double d = Console.getDoubleInput("Enter a double.");
                Double d2 = Console.getDoubleInput("Enter another double.");
                Arithmetic.multiplication(d, d2);
                Intro.intro();

            } else if (s1.equalsIgnoreCase("4")) {
                Double d = Console.getDoubleInput("Enter a double.");
                Double d2 = Console.getDoubleInput("Enter another double.");
                //ErrorMessages.errorMessage(d2, s1);
                Arithmetic.division(d, d2);
                Intro.intro();

            }
        } else if (s.equalsIgnoreCase("2")) {
            String s1 = Console.getStringInput(
                    "Enter an operation \n" +
                            "1. Tangent \n");
            if (s1.equalsIgnoreCase("1")) {
                Double d = Console.getDoubleInput("Enter a double.");
                Trigonometry.tangent(d);
                Intro.intro();
            }
        } else if (s.equalsIgnoreCase("3")) {
            String s1 = Console.getStringInput(
                    "Enter an operation \n" +
                            "1. Square \n" +
                            "2. Square Root \n" +
                            "3. Exponent \n");

            if (s1.equalsIgnoreCase("1")) {
                Double d = Console.getDoubleInput("Enter a double.");
                Double d2 = Console.getDoubleInput("Enter another double.");
                Exponents.square(d);
                Intro.intro();

            } else if (s1.equalsIgnoreCase("2")) {
                Double d = Console.getDoubleInput("Enter a double.");
                Double d2 = Console.getDoubleInput("Enter another double.");
                Exponents.sqrt(d);
                Intro.intro();
            } else if (s1.equalsIgnoreCase("3")) {
                Double d = Console.getDoubleInput("Enter a double.");
                Double d2 = Console.getDoubleInput("Enter another double.");
                Exponents.variableExponent(d, d2);
                Intro.intro();
            }
        } else if (s.equalsIgnoreCase("4")) {
            System.exit(0);

        } else {
            ErrorMessages.invalidSelection();
            Intro.intro();

            } return null;
        }
    }
