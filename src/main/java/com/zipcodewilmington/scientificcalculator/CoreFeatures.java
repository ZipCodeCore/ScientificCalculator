package com.zipcodewilmington.scientificcalculator;

public class CoreFeatures {
    // INSTANCE VARIABLES

    private double x;
    private double y;

    /*
      *   3 CONSTRUCTORS
       *      X & Y
      *       X
     */
    public CoreFeatures(){

    }
    public CoreFeatures(double x, double y){
        this.x = x;
        this.y = y;
    }
    public CoreFeatures(double x){
        this.x = x;
    }

    /*
     * Core methods
     *   addition    subtraction     multiplication      division   exponential
     *   square      squareRoot      inverse
     * */

    public double addition (double x, double y) {
        double result = 0;

        result = (x + y);

        return result;
    }

    public double subtraction (double x, double y) {
        double result = 0;

        result = (x - y);

        return result;
    }

    public double multiplication (double x, double y) {
        double result = 0;

        result = (x * y);

        return result;
    }

    public double division (double x, double y) {
        double result = 0;

        result = (x / y);

        return result;
    }

    public double exponentiation(double x, double y){
        double result = 0;

        result = Math.pow(x, y);

        return result;
    }

    public double square(double x){
        double result = 0;

        result = Math.pow(x, 2);

        return result;
    }

    public double squareRoot(double x){
        double result = 0;

        result = Math.sqrt(x);

        return result;
    }

    public double inverse(double x){
        double result = 0;

        result = (1/x);

        return result;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
