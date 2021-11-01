package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class scientificFunctions {
    public static Double functions(Double value) {
        String choice;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter what functions you want to use: trig, logarithmic, factorials, or memory: ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("trig")) {
                System.out.println(trigFunctions(value));
            } else if (choice.equalsIgnoreCase("logarithmic")) {
                System.out.println(logarithmicFunction(value));
            } else if (choice.equalsIgnoreCase("factorials")) {
                System.out.println(factorialFunction(value));
            } else if (choice.equalsIgnoreCase("memory")) {
                System.out.println(memoryFunction(value));
            } else {
                System.out.println("Not one of the given functions.");
            }

        } while (!choice.equalsIgnoreCase("trig") && !choice.equalsIgnoreCase("logarithmic") &&
                !choice.equalsIgnoreCase("factorials") && !choice.equalsIgnoreCase("memory"));

        return null;
    }

    public static String switchDisplayMode() {
        String choice = "";

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the type of display you would like: binary, octal, decimal, or hexadecimal: ");
            choice = scanner.nextLine();

        } while (!choice.equalsIgnoreCase("binary") && !choice.equalsIgnoreCase("octal") &&
                !choice.equalsIgnoreCase("decimal") && !choice.equalsIgnoreCase("hexadecimal"));

        return choice;
    }

    public static String switchDisplayMode(String mode) {
        return mode;
    }

    public static Double memoryFunction(Double value) {
        double memory = 0.0;
        String choice;
        double memoryValue = value;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter either M+(Store in memory), MC(Clear memory), or MRC(Recall current memory): ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("M+")) {
                memory = memoryValue;
            } else if (choice.equalsIgnoreCase("MC")) {
                memory = 0.0;
            } else if (choice.equalsIgnoreCase("MRC")) {
                return memory;
            } else {
                System.out.println("You may only enter M+, MC, or MRC.");
            }

        } while (choice.equalsIgnoreCase("M+") || choice.equalsIgnoreCase("MC") ||
                choice.equalsIgnoreCase("MRC"));

        return null;
    }

    public static String switchUnitsMode(String mode) {
        do {

            if (mode.equalsIgnoreCase("degrees")) {
                mode = "degree";
            } else if (mode.equalsIgnoreCase("radians")) {
                mode = "radian";
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose Degrees or Radians: ");
                mode = scanner.nextLine();
            }

        } while (!mode.equals("degree") && !mode.equals("radian"));

        return mode;
    }

    public static Double switchUnitsMode(Double value) {
        double degOrRad = 0.0;
        String choice;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Switch to Degrees or Radians: ");
        choice = scanner.nextLine();

        if (switchUnitsMode(choice).equals("degree")) {
            degOrRad = Math.toDegrees(value);
        } else {
            degOrRad = Math.toRadians(value);
        }

        return degOrRad;
    }

    public static Double trigFunctions(Double value) {
        double degOrReg = switchUnitsMode(value);
        double trigValue = 0.0;
        String choice;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter which function you want to use: sine, cosine, tangent, inverse sine, inverse cosine, or inverse tangent: ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("sine")) {
                trigValue = Math.sin(degOrReg);
            } else if (choice.equalsIgnoreCase("cosine")) {
                trigValue = Math.cos(degOrReg);
            } else if (choice.equalsIgnoreCase("tangent")) {
                trigValue = Math.tan(degOrReg);
            } else if (choice.equalsIgnoreCase("inverse sine")) {
                trigValue = Math.asin(degOrReg);
            } else if (choice.equalsIgnoreCase("inverse cosine")) {
                trigValue = Math.acos(degOrReg);
            } else if (choice.equalsIgnoreCase("inverse tangent")) {
                trigValue = Math.atan(degOrReg);
            } else {
                System.out.println("Please enter one of the given choices.");
            }

        } while (!choice.equalsIgnoreCase("sine") && !choice.equalsIgnoreCase("cosine") &&
                !choice.equalsIgnoreCase("tangent") && !choice.equalsIgnoreCase("inverse sine")
                && !choice.equalsIgnoreCase("inverse cosine") && !choice.equalsIgnoreCase("inverse tangent"));

        return trigValue;
    }

    public static Double logarithmicFunction(double value) {
        double logValue = 0.0;
        String choice;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter which function you want to use: log, inverse logarithm, natural logarithm, inverse natural logarithm: ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("log")) {
                logValue = Math.log10(value);
            } else if (choice.equalsIgnoreCase("inverse logarithm")) {
                logValue = Math.pow(10, value);
            } else if (choice.equalsIgnoreCase("natural logarithm")) {
                logValue = Math.log(value);
            } else if (choice.equalsIgnoreCase("inverse natural logarithm")) {
                logValue = Math.exp(value);
            } else {
                System.out.println("Please enter one of the given choices.");
            }

        } while (!choice.equalsIgnoreCase("log") && !choice.equalsIgnoreCase("inverse logarithm")
                && !choice.equalsIgnoreCase("natural logarithm") && !choice.equalsIgnoreCase("inverse natural logarithm"));

        return logValue;
    }

    public static Double factorialFunction (Double value) {
        double factorial = 1.0;

        if (value > 0) {
            for (double i = value; i > 0; i--) {
                factorial *= i;
            }
        } else if(value < 0) {
            for (double i = value; i < 0; i++) {
                factorial *= i;
            }
        } else {
            factorial = 0.0;
        }

        return factorial;
    }
}
