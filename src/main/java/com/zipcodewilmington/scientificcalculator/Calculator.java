package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;

public class Calculator {

    public Calculator() {
    }

    public static Double add (Double a, Double b){
        return a + b;
    }

    public Double subtract (Double a, Double b){
        return a - b;
    }

    public Double multiply(Double a, Double b){
        return a * b;
    }

    public Double sqrt(Double a){
        return Math.sqrt(a);
    }

    public Double sq(Double a){
        return Math.pow(a, (double)2);
    }

    public Double exp(Double a, Double b){
        return Math.pow(a, b);
    }

    //inverse
    public Double inv(Double a){
        return 1 / a;
    }

    //if positive return neg / if neg return pos
    public Double negate(Double a){
        Double answer = 0.0;
        if(a > 0.0)
            answer = a * -1;
        else if(a < 0.0)
            answer = Math.abs(a);

        return answer;
    }

}
