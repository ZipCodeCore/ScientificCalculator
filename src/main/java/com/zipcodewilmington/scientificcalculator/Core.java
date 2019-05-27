package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

public class Core {

    private String display;
    private double curNum;

    public Core() {
        display = "0";
        curNum = 0;
    }
//    public Core(double firstVal, double secondVal, double result) {
//        firstVal = 0;
//        secondVal = 0;
//        result = 0;
//    }

    public static double add(double firstVal, double secondVal) {
        return firstVal + secondVal;
    }

    public static double subtract(double firstVal, double secondVal) {
        return firstVal - secondVal;
    }

    public static double multiply(double firstVal, double secondVal) {
        return firstVal * secondVal;
    }

    public static double divide(double firstVal, double secondVal) {
        if (secondVal == 0)
            return Double.NaN;
        else
            return firstVal / secondVal;
    }

    public static double square(double firstVal) {
        return firstVal * firstVal;
    }

    public static double squareRoot(double firstVal) {
        return Math.sqrt(firstVal);
    }

    public static double exponent(double firstVal, double secondVal) {
        return Math.pow(firstVal, secondVal);
    }

    public static double inverse(double firstVal) {
        if (firstVal == 0)
            return Double.NaN;
        else
            return (1 / firstVal);
    }

    public static double invertSign(double firstVal) {
        if (firstVal == 0)
            return 0;
        else
            return -firstVal;
    }

    public void clear() {
        setCurNum(0);
    }

    public void setCurNum(double newNum) {
        curNum = newNum;
    }

    public double getCurNum() {
        return curNum;
    }

    public void setDisplay(String input) {
        display = input;
    }

    public void setDisplayErr(String message) {
        display = "Err: " + message;
    }

    public String getDisplay() {
        return display;
    }
    public void availableOptions() {
        System.out.println("============ DISPLAY ============");
        System.out.println("\"SWITCHDR\" ----- switch between trig units (radians or degrees)");
        System.out.println("\"SWITCHDR DEGREES\" ----- switch to degrees)");
        System.out.println("\"SWITCHDR RADIANS\" ----- switch to radians)");
        System.out.println("\"SWITCHDISP\" ----- switch between numeral systems (binary/octal/decimal/hexadecimal)");
        System.out.println("\"SWITCHDISP BIN\" ----- switch to binary numeral system");
        System.out.println("\"SWITCHDISP OCT\" ----- switch to octal numeral system");
        System.out.println("\"SWITCHDISP DECIMAL\" ----- switch to decimal numeral system");
        System.out.println("\"SWITCHDISP HEX\" ----- switch to binary hexadecimal system");
        System.out.println("\"C\" ----- Clear display\n");
        System.out.println("============ MEMORY ============");
        System.out.println("\"M+\" ----- Add to memory");
        System.out.println("\"MC\" ----- Clear memory");
        System.out.println("\"MCR\" ----- Recall from memory\n");
        System.out.println("============ SCIENTIFIC ============");
        System.out.println("\"SIN\" ----- take sine");
        System.out.println("\"COS\" ----- take cosine");
        System.out.println("\"TAN\" ----- take tangent");
        System.out.println("\"ATAN\" ----- take arc tangent");
        System.out.println("\"ASIN\" ----- take arc sine");
        System.out.println("\"ACOS\" ----- take arc cosine");
        System.out.println("\"LOG\" ----- take logarithm");
        System.out.println("\"LN\" ----- take natural logarithm");
        System.out.println("\"E^X\" ----- take inverse natural logarithm");
        System.out.println("\"10^X\" ----- take inverse logarithm");
        System.out.println("\"!\" ----- take factorial");
        System.out.println("\"INV\" ----- take inverse of the number (1/x)");
        System.out.println("\"INVSIGN\" ----- inverse sign\n");
        System.out.println("============ EXTRA ============");
        System.out.println("\"FIBTO\" ----- a classic sequence with variations");
//        System.out.println("\"ZCW\" ----- ???");
    }
    public void showMePuppy() {
        System.out.println("   __");
        System.out.println("o-''|\\\\_____/)");
        System.out.println("\\\\_/|_)     )");
        System.out.println("   \\\\  __  /");
        System.out.println("    (_/ (_/    ZCW ROCKS");
    }
}

