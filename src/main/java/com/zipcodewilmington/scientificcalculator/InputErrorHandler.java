package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.List;

public class InputErrorHandler {
    private static List<String> listOfValid = new ArrayList<String>();

    public InputErrorHandler()
    {
    }

    public static Boolean validOp(String op)
    {
        return listOfValid.contains(op);
    }

    public static Boolean validNumber(String in)
    {
        Boolean isANumber = true;

        try
        {
            Double num = Double.parseDouble(in);
        } catch (NumberFormatException error) {
            isANumber = false;
        }

        return isANumber;
    }

    static {
        listOfValid.add("c"); //
        listOfValid.add("m+"); //
        listOfValid.add("m"); //
        listOfValid.add("mc"); //
        listOfValid.add("inv"); //
        listOfValid.add("+");
        listOfValid.add("-");
        listOfValid.add("*");
        listOfValid.add("/");
        listOfValid.add("exp");
        listOfValid.add("sq"); //
        listOfValid.add("sqrt"); //
        listOfValid.add("mode"); //
        listOfValid.add("bin"); //
        listOfValid.add("oct"); //
        listOfValid.add("dec"); //
        listOfValid.add("hex"); //
        listOfValid.add("rad"); //
        listOfValid.add("log");
        listOfValid.add("invlog");
        listOfValid.add("nlog");
        listOfValid.add("invnlog");
        listOfValid.add("!");
        listOfValid.add("fib");
        listOfValid.add("mtf");
        listOfValid.add("ftm");
        listOfValid.add("ptk");
        listOfValid.add("ktp");
        listOfValid.add("ftc");
        listOfValid.add("ctf");
    }
}
