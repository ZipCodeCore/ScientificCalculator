package io.matthewbelongia;

import java.util.Scanner;

/**
 * Created by matthewb on 4/29/16.
 */
public class Calculator {

    //double defaultValue = 0.0;
    //boolean erronOn = false;

    public static Boolean powerOn(){return true;}

    public double tanFunction(double inputValue){
        inputValue = Math.toRadians(inputValue);
        inputValue = Math.round (Math.tan(inputValue) * 10000.0) / 10000.0;
        return inputValue;
    }
    public double invTanFunction(double inputValue){
        inputValue = Math.round (Math.toDegrees(Math.atan(inputValue)) * 10000.0) / 10000.0;
        return inputValue;
    }
    public double cosFunction(double inputValue){
        inputValue = Math.toRadians(inputValue);
        inputValue = Math.round (Math.cos(inputValue) * 10000.0) / 10000.0;
        return inputValue;
    }
    public double invCosFunction(double inputValue){
        inputValue = Math.round (Math.toDegrees(Math.acos(inputValue)) * 10000.0) / 10000.0;
        return inputValue;
    }
    public double sinFunction(double inputValue){
        inputValue = Math.toRadians(inputValue);
        inputValue = Math.round (Math.sin(inputValue) * 10000.0) / 10000.0;
        return inputValue;
    }
    public double invSinFunction(double inputValue){
        inputValue = Math.round (Math.toDegrees(Math.asin(inputValue)) * 10000.0) / 10000.0;
        return inputValue;
    }

    public double squareFunction(double inputValue){
        return Math.round (Math.pow(inputValue,2.0) * 10000.0) / 10000.0;
    }
    public double squareRootFunction(double inputValue){
        return Math.round (Math.sqrt(inputValue) * 10000.0) / 10000.0;
    }

    public double powerFunction(double inputValue){
        double powerinput = stringToDoubleCalc();
        return Math.round (Math.pow(inputValue,powerinput) * 10000.0) / 10000.0;
    }

    public double divideFunction(double inputValue){
        double outputValue = stringToDoubleCalc();

        return Math.round ((inputValue/outputValue * 10000.0)) / 10000.0;
    }

    public double addFunction(double inputValue){
        double outputValue = stringToDoubleCalc();

        return Math.round(((inputValue + outputValue) * 10000.0))/ 10000.0;
    }

    public double minusFunction(double inputValue){
        double outputValue = stringToDoubleCalc();

        return Math.round(((inputValue - outputValue) * 10000.0)) / 10000.0;
    }

    public double multFunction(double inputValue){
        double outputValue = stringToDoubleCalc();

        return Math.round((inputValue * outputValue) * 10000.0) / 10000.0;
    }
    public double natLogFunction(double inputValue){

        return Math.round((Math.log(inputValue)) * 10000.0) / 10000.0;
    }
    public double invNatLogFunction(double inputValue){

        return Math.round((Math.exp(inputValue)) * 10000.0) / 10000.0;
    }
    public double logFunction(double inputValue){

        return Math.round((Math.log10(inputValue)) * 10000.0) / 10000.0;
    }
    public double invLogFunction(double inputValue){

        return Math.round((Math.pow(10,inputValue)) * 10000.0) / 10000.0;
    }

    public double factFunction(double inputValue){
        inputValue = Math.floor(inputValue);
        int tempVal = (int)inputValue;
        inputValue = factorial(tempVal);
        return Math.round((inputValue) * 10000.0) / 10000.0;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public double stringToDoubleCalc(){
        double result = 0.0;
        while(true) {

            //System.out.println("Enter a Int or Double");
            Scanner inputDouble = new Scanner(System.in);
            String input = inputDouble.next();
            String pattern = "\\d+(\\.\\d{1,4})?|\\.\\d{1,4}";

            if (input.matches(pattern)) {
                if (input.length() > 10) {
                    //System.out.println("Smaller Numbers please!");
                    continue;
                }
                else {
                    result = Double.parseDouble(input);
                    return result;
                }
            } else {
                //System.out.println("Please Type a Int or Double");
                continue;
            }

        }

    }

}
