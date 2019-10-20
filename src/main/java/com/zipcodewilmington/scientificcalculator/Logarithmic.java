package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;

public class Logarithmic {

    public static Double naturalLog (Double a)
    {
        Double output= Math.log(a);
        Console.println( "\n" + output);
        return output;
    }

    public static Double logBaseTen (Double a)
    {
        Double output = Math.log10(a);
        Console.println( "\n" + output);
        return output;

    }


}
