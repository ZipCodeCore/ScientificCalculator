package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string").toLowerCase();
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as an integer", i);
        Console.println("The user input %s as a d", d);

        ScientificCalc sci = new ScientificCalc();
        if (s.equalsIgnoreCase("FACTORIAL")) {
            System.out.println(sci.factorial(i));
        }
        if (s.equalsIgnoreCase("sin") || s.equalsIgnoreCase("cos") || s.equalsIgnoreCase("tan") || s.equalsIgnoreCase("Inverse sine") || s.equalsIgnoreCase("Inverse cosine") || s.equalsIgnoreCase("Inverse tan")) {
           // System.out.println("Enter Degree or Radians");
            String dr=Console.getStringInput("Enter Degrees or Radians");
            if(dr.equalsIgnoreCase("radians"))
            System.out.println(sci.trig(s,d));
            else if(dr.equalsIgnoreCase("degrees"))
                System.out.println(sci.trigdeg(s,d));
        }
        if (s.equals("BINARY")||s.equals("OCTAL")||s.equals("HEXADECIMAL")||s.equals("DECIMAL")) {
            System.out.println(sci.switchDisplayMode(s,i));
        }
        if(s.equalsIgnoreCase("log")||s.equalsIgnoreCase("log10")||s.equalsIgnoreCase("inverse log")||s.equalsIgnoreCase("Inverse natural log")) {
            System.out.println(sci.logfns(s,d));
        }
        }
    }


