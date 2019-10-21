package com.zipcodewilmington.scientificcalculator;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextLine();
    }

    public static Integer getIntegerInput(String prompt) {
        return getDoubleInput(prompt).intValue();
    }

    public static Double getDoubleInput(String prompt) {
        return Double.parseDouble(getStringInput(prompt));
    }

    Double add(double value1, double value2) {
        return value1 + value2;
    }

    Double subtract(double value1, double value2) {
        return value1 - value2;
    }

    Double multiply(double value1, double value2) {
        return value1 * value2;
    }

    Double divide(double value1, double value2) {
        if (value2 == 0) {
            System.out.println("ERROR: Cannot divide by 0.");
            return null;
        } else {
            return value1 / value2;
        }
    }

    Double exponent(double value1, double value2) {
        return Math.pow(value1, value2);
    }

    Double cosine(double value) {
        if (value < 0) {
            return Math.cos(-value);
        } else {
            return Math.cos(value);
        }
    }

    Double factorial(Double value1) {
        double facto = 1;
        for (int i = 1; i <= value1; i++) {
            facto = facto * i;
        }
        return facto;
    }

    Double inverse(Double value) {
        if (value == 0) {
            System.out.println("ERROR: Cannot have an inverse of 0.");
            return null;
        } else {
            return 1 / value;
        }
    }

    Double inverseCosine(double value) {
        if (value <= 1 && value >= -1) {
            return Math.acos(value);
        } else {
            System.out.println("ERROR: Please enter a number between -1 and 1.");
            return null;
        }
    }

    Double inverseLogarithm(double value) {
        if (value <= 0) {
            System.out.println("ERROR: Please enter a number larger than 0.");
            return null;
        } else {
            return Math.pow(10, value);
        }
    }

    Double inverseNaturalLogarithm(double value) {
        return Math.exp(value);
    }

    Double inverseSine(double value) {
        if (value <= 1 && value >= -1) {
            return Math.asin(value);
        } else {
            System.out.println("ERROR: Please enter a number between -1 and 1.");
            return null;
        }
    }

    Double inverseTangent(double value) {
        return Math.atan(value);
    }

    Double invert(double value1) {
        return value1 * -1;
    }

    Double logarithm(double value) {
        if (value <= 0) {
            System.out.println("ERROR: Please enter a number larger than 0.");
            return null;
        } else {
            return Math.log(value);
        }
    }

    Double sine(double value) {
        if (value < 0) {
            return Math.sin(-value);
        } else {
            return Math.sin(value);
        }
    }

    Double sqrt(double value) {
        if (value <= 0) {
            System.out.println("ERROR: Please enter a positive number.");
            return null;
        } else {
            return Math.sqrt(value);
        }
    }

    Double squared(double value1) {
        return value1 * value1;
    }

    Double tangent(double value) {
        if (value < 0) {
            return Math.tan(-value);
        } else {
            return Math.tan(value);
        }
    }
/*
    Double naturalLogarithm(double value) {
        if (value <= 0) {
            System.out.println("ERROR: Please enter a number larger than 0.");
            return null;
        } else {
            return (-Math.log(1 - value)) / value;
        }
    }*/

    static String degreesRadians(){
        System.out.println("Would you like you answer in Radians or Degrees?");
        System.out.println("\"1\" - Radians");
        System.out.println("\"2\" - Degrees");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        while(true)
            switch (userInput){
                case "1":
                    return "Radians";
                case "2":
                    return "Degrees";
                default:
                    System.out.println("ERROR: Please enter \"1\" for Radians or \"2\" for Degrees.");
                    scanner = new Scanner(System.in);
                    userInput = scanner.nextLine();
            }
    }
}




