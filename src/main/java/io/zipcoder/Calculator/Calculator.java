package io.zipcoder.Calculator;

/**
 * Created by mollyarant on 4/28/17.
 */
import static java.lang.Math.*;
public class Calculator {
    Display display;

    public Calculator(){
        display = new Display();
    }

    public int add(int a, int b){
        int result=0;
        result=a+b;
        display.print("Final answer \n" + result);
        return result;
    }

    public int subtract(int a, int b){
        int result=0;
        result=a-b;
        display.print("Final answer \n" + result);
        return result;
    }

    public int multiply(int a, int b){
        int result=0;
        result=a*b;
        display.print("Final answer \n" + result);
        return result;
    }
    public double divide(double a, double b){
        double result=0;
        if (b==0){
            display.print("Err");
            return Double.NaN;
        }
        result=a/b;
        display.print("Final answer \n" + result);
        return result;
    }
    public double calculateSquareRoot(double a){
        double result=0;
        result=Math.sqrt(a);
        display.print("Final answer \n" + result);
        return result;
    }
    public double calculateSquareNumber(double a){
        double result=0;
        result= a*a;
        display.print("Final answer \n" + result);
        return result;
    }
    public double calculateVariableExponentiation(double a, double b){
        double result=0;
        result= Math.pow(a,b);
        display.print("Final answer \n" + result);
        return result;
    }
    public double calculateInverse(double a){
        double result=0;
        if (a==0){
            display.print("Err");
            return Double.NaN;
        }
        result= Math.pow(a, -1);
        display.print("Final answer \n" + result);
        return result;
    }
    public int calculateAdditiveInverse(int a){
        int result=0;
        result=a*-1;
        display.print("Final answer \n" + result);
        return result;
    }







}
