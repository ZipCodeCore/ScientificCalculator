package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.List;

public class ValidOperations
{
    private static List<String> listOfValid = new ArrayList<String>();

    public ValidOperations()
    {
        listOfValid.add("c");
        listOfValid.add("m+");
        listOfValid.add("m");
        listOfValid.add("mc");
        listOfValid.add("inv");
        listOfValid.add("+");
        listOfValid.add("-");
        listOfValid.add("*");
        listOfValid.add("/");
        listOfValid.add("exp");
        listOfValid.add("sq");
        listOfValid.add("sqrt");
        listOfValid.add("mode");
        listOfValid.add("bin");
        listOfValid.add("oct");
        listOfValid.add("dec");
        listOfValid.add("hex");
        listOfValid.add("rad");
        listOfValid.add("log");
        listOfValid.add("invlog");
        listOfValid.add("nlog");
        listOfValid.add("invnlog");
        listOfValid.add("sin");
        listOfValid.add("cos");
        listOfValid.add("tan");
        listOfValid.add("invsin");
        listOfValid.add("invcos");
        listOfValid.add("invtan");
        listOfValid.add("!");
        listOfValid.add("fib");
    }

    public static Boolean isValid(String op)
    {
        return listOfValid.contains(op);
    }
}
