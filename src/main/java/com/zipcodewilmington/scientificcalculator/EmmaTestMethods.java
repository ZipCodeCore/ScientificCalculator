package com.zipcodewilmington.scientificcalculator;


import java.util.stream.IntStream;

public class EmmaTestMethods {
    public int a;
    public int b;
    public String result;

    public static String Addition(String x) {
        int[] intArray = stringArrayToIntArray(x);
        int sum = IntStream.of(intArray).sum();
        String result = String.valueOf(sum);
        return result;
    }



    public static int[] stringArrayToIntArray(String intString) {
        String[] intStringSplit = intString.split(" "); //Split by spaces
        int[] result = new int[intStringSplit.length]; //Used to store our ints

        for (int i = 0; i < intStringSplit.length; i++) {
            //parse and store each value into int[] to be returned
            result[i] = Integer.parseInt(intStringSplit[i]);
        }
        return result;
    }
    }


