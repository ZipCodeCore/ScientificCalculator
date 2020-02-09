package com.zipcodewilmington.scientificcalculator;


public class OtherFunctions {

   Double x;

    public OtherFunctions() {

        x = 0.0;
    }

    public static int Fact(int x){

        if (x<0)
            return 0;

        if (x == 0 || x == 1)
            return 1;

        return x*Fact(x-1);
    }

    public static int Fibon(int x) {

        if (x<0)
            return 0;

        if (0<=x && x<=1)
            return x;

            return Fibon(x-1) + Fibon(x-2);


    }

}




