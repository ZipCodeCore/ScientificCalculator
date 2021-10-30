package com.zipcodewilmington.scientificcalculator;

public class Fibonacci {
    Double c=0.0,
            i=0.0,
            j=1.0,
            next;
    public Fibonacci(){

    }
    public void fib(Double num1)
    {


        if(num1>0)
        {
            if(c<=1)
                next=c;
            else
            {
                next=i+j;
                i=j;
                j=next;
            }

            System.out.print(Math.round(next)+" ");
            c++;
            fib(--num1);
        }
    }
}
