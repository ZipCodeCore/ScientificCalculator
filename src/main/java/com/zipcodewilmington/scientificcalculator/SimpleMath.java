package com.zipcodewilmington.scientificcalculator;

import static java.lang.Math.sqrt;

public class SimpleMath {

    /*Double num1;
    Double num2;

    //Get first number from main class and set to the variables in this class
    public void getNum1(double num1){
        this.num1 = num1;
    }
    public double setNum1() {
        return this.num1;
    }


    public void getNum2(double num2){
        this.num2 = num2;
    }
    public double setNum2() {
        return this.num2;
    }*/


    //Simple Operations
    public Double add(double num1, double num2) {
        return num1 + num2;
    }
    public Double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public Double multiplication(double num1, double num2){
        return num1 * num2;
    }
    public Double division(double num1, double num2){
        return num1 / num2;
    }

    public Double square(double num1){
        return num1 * num1;
    }

    public Double squareRoot(double num1){
        return Math.sqrt(num1);
    }

    public Double expo(double num1, double num2){
        return Math.pow(num1, num2);
    }

    public Double inverse(double num1){
        return 1 / num1;
    }

    public Double invertSign(double num1){
        return num1 * -1;
    }




}