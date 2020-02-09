package com.zipcodewilmington.scientificcalculator;

public class Logarithm {

    Double x;

    public Logarithm() {

        x =0.0;

    }

    public static Double Log(Double x) {

        if (x<=0)
           return 0.0;

        return Math.log10(x);

    }

    public static Double InvLog(Double x) {

        return Math.pow(10,x);

    }

    public static Double NLog(Double x) {

        if (x<=0)
            return 0.0;

        return Math.log(x);

    }

    public static Double InvNLog(Double x) {

        return (Math.pow(Math.exp(1.0), x));

    }


}




