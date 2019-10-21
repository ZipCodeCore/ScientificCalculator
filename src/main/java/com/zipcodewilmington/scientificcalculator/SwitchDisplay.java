package com.zipcodewilmington.scientificcalculator;

public class SwitchDisplay {

    public Boolean binary;
    public Boolean octal;
    public Boolean hex;

    public String toBinary(int num1){
        return Integer.toBinaryString(num1);
    }

    public String toOctal(int num1){
        return Integer.toOctalString(num1);
    }

    public String toHex(int num1){
        return Integer.toHexString(num1);
    }

    public String toDisplay(double num1) {

        int num2 = (int) Math.round(num1);
        if (binary = false) {
            return toBinary(num2);
        } else if (octal = false) {
            return toOctal(num2);
        } else if (hex = false) {
            return toHex(num2);
        } else {
            return String.valueOf(num1);
        }
    }
}


