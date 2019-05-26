package com.zcw.calculator;

public class ArithmeticOperations {
    public String Sum(double a, double b)
    {
        double result = a + b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
    public String Diff(double a, double b)
    {
        double result = a - b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
    public String Multi(double a, double b)
    {
        double result = a * b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
    public String Modulus(double a, double b)
    {
        double result = a % b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
    public String Div(double a, double b)
    {
        double result = a / b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
}
