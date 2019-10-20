package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class Arithmetic {
    public static Double addition(Double num1, Double num2){
        return num1 + num2;
    }

    public static Double sub(Double num1, Double num2){
        return  num1 - num2;
    }

    public static Double multiplication(Double num1, Double num2){
        return num1 * num2;
    }

    public static Double division(Double num1, Double num2){
        return num1 / num2;
    }

    public static Double sqrt(Double num1){
        return Math.sqrt(num1);
    }
    public static Double cbrt(Double num1){
        return Math.cbrt(num1);
    }
    public static Double exponent(Double num1, Double num2){
        return Math.pow(num1,num2);
    }
    public static Double log10(Double num1){
        return Math.log10(num1);
    }
    public static Double square(Double num1){
        return num1 * num1;
    }


}
