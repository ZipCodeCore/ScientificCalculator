package com.zcw.calculator;

public class ArithmeticOperations {
    public String sum(double a, double b) {
        double result = a + b;
        if(result == (long)result) {
            return String.format("%d",(long)result);

        }
        return String.format("%s",result);
    }
}
