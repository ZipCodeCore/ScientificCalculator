package com.zipcodewilmington.scientificcalculator;


public class OtherFunctions {

   Double x;

    public OtherFunctions() {

        x = 0.0;
    }

    public static Double Fact(Double x){

        if (x<0)
            return 0.0;

        if (x == 0 || x == 1)
            return 1.0;

        return x*Fact(x-1);
    }

    public static Double Fibon(Double x) {

        if (x<0)
            return 0.0;

        if (0<=x && x<=1)
            return x;

            return Fibon(x-1) + Fibon(x-2);


    }

}




