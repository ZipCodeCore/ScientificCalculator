package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class scientificFunctions {
    private Double logValue;

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

    public static Double sin(Double value) {
        double trigValue = Math.sin(value);

        return trigValue;
    }

    public static Double cosin(Double value) {
        double trigValue = Math.cos(value);

        return trigValue;
    }

    public static Double tangent(Double value) {
        double trigValue = Math.tan(value);

        return trigValue;
    }

    public static Double inverseSin(Double value) {
        double trigValue = Math.asin(value);

        return trigValue;
    }

    public static Double inverseCosin(Double value) {
        double trigValue = Math.acos(value);

        return trigValue;
    }

    public static Double inverseTangent(Double value) {
        double trigValue = Math.atan(value);

        return trigValue;
    }

    public static Double log(Double value) {
        double logValue = Math.log10(value);

        return  logValue;
    }

    public static Double inversLog(Double value) {
        double logValue = Math.pow(10, value);

        return  logValue;
    }

    public static Double naturalLog(Double value) {
        double logValue = Math.log(value);

        return  logValue;
    }

    public static Double inverseNaturalLog(Double value) {
        double logValue = Math.exp(value);

        return  logValue;
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
