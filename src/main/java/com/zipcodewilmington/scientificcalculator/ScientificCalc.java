package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.math.BigInteger;


public class ScientificCalc {
    Double memory = 0.0;


    public Double MathOperation(String s, Double d) {

        Double returnValue = 0.0;
        switch (s) {
            case "binary":
                returnValue = Double.valueOf(Integer.toBinaryString(d.intValue()));
                break;
            case "octal":
                returnValue = Double.valueOf(Integer.toOctalString(d.intValue()));
                break;

            case "hexadecimal":
                returnValue = Double.valueOf(Integer.toHexString(d.intValue()));
                break;
            case "decimal":
                returnValue = Double.valueOf(Integer.toBinaryString(d.intValue()));
                break;

            case "sin":
                String ui = Console.getStringInput("Enter Degrees or Radians");
                returnValue = ui.equalsIgnoreCase("degrees") ? Math.sin(Math.toRadians(d)) : Math.sin(d);
                break;
            case "cos":
                ui = Console.getStringInput("Enter Degrees or Radians");
                returnValue = ui.equalsIgnoreCase("degrees") ? Math.cos(Math.toRadians(d)) : Math.cos(d);
                break;
            case "tan":
                ui = Console.getStringInput("Enter Degrees or Radians");
                returnValue = ui.equalsIgnoreCase("degrees") ? Math.tan(Math.toRadians(d)) : Math.tan(d);
                break;
            case "inverse sine":
                ui = Console.getStringInput("Enter Degrees or Radians");
                returnValue = ui.equalsIgnoreCase("degrees") ? Math.asin(Math.toRadians(d)) : Math.asin(d);
                break;
            case "inverse cosine":
                ui = Console.getStringInput("Enter Degrees or Radians");
                returnValue = ui.equalsIgnoreCase("degrees") ? Math.sin(Math.toRadians(d)) : Math.sin(d);
                break;
            case "inverse tan":
                ui = Console.getStringInput("Enter Degrees or Radians");
                returnValue = ui.equalsIgnoreCase("degrees") ? Math.atan(Math.toRadians(d)) : Math.atan(d);
                break;
            case "log":
                returnValue = Math.log(d);
                break;
            case "log10":
                returnValue = Math.log10(d);
                break;
            case "inverse natural log":
                returnValue = Math.pow(Math.E, d);
                break;
            case "inverse log":
                returnValue = Math.pow(10, d);
                break;
            case "factorial":
                returnValue= (factorial(Integer.valueOf((int)d.doubleValue()))).doubleValue();
                break;
            case "round":
                returnValue=Double.valueOf(Math.round(d));
                break;
            case "cube":
                returnValue=d*d*d;
                break;
            case "circlearea":
                returnValue=Math.PI*d*d;
                break;
           case "m+":
                returnValue = memory + d;
                break;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        memory = returnValue;
        return returnValue;
    }

    public Double MathOperation(String s) {
        switch (s) {
            case "mrc":
                break;
            case "mc":
                this.memory = 0.0;
                break;
        }
        return memory;
    }
    public BigInteger factorial(Integer i) {

        BigInteger f = new BigInteger("1");

        for (int j = 1; j <= i; j++) {
            f = f.multiply(BigInteger.valueOf(j));
        }
        memory = f.doubleValue();
        return f;
    }
}







