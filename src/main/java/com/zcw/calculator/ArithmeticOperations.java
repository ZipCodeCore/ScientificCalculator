package com.zcw.calculator;

public class ArithmeticOperations {
    public String sum(double a, double b)
    {
        double result = a + b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
    public String diff(double a, double b)
    {
        double result = a - b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
    public String multi(double a, double b)
    {
        double result = a * b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
    public String modulus(double a, double b)
    {
        double result = a % b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
    public String div(double a, double b)
    {
        double result = a / b;
        if(result == (long)result)
        {
            return String.format("%d", (long)result);
        }
        return String.format("%s",result);
    }
}
