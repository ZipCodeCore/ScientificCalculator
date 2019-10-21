package com.zipcodewilmington.scientificcalculator;

public class SciCalculator {
    public static String sine(double x){ return String.valueOf(Math.sin(x)); }
    public static String cosine(double x){ return String.valueOf(Math.cos(x)); }
    public static String tangent(double x){ return String.valueOf(Math.tan(x)); }
    public static String csc(double x){ return String.valueOf(Math.asin(x)); }
    public static String sec(double x){ return String.valueOf(Math.acos(x)); }
    public static String cotan(double x){ return String.valueOf(Math.atan(x)); }
    public static String log(double x){ return String.valueOf(Math.log(x)); }//**Fix these
    public static String log10(double x){ return String.valueOf(Math.log10(x)); } //**Fix these
    public static String log1p(double x){ return String.valueOf(Math.log1p(x)); }//** Fix these
    public static String factorial(double x){ //Fix for negative input
        double total = x;
        if(x <0){
            total = 0;
        }
        else if (x ==0){
            total = 1;
        }else {
            for (int i = 1; i < x; i++) {
                total *= i;
            }
        }
        return String.valueOf(total);
        }

    public static String switchDisplayMode(String currentMode, String operation) {
        String mode = "";
        String[] modes = {"binary", "octal", "decimal", "hexadecimal"};
        if (operation.equals("disp bin")) {
            mode = "binary";
        }
        else if (operation.equals("disp oct")) {
            mode = "octal";
        }
        else if (operation.equals("disp dec")) {
            mode = "decimal";
        }
        else if (operation.equals("disp hex")) {
            mode = "hexadecimal";
        }
        else {
            for (int i = 0; i < modes.length; i++) {
                if (currentMode.matches(modes[i])) {
                    int idx = i + 1;
                    if (idx >= modes.length) {
                        idx = 0;
                    }
                    mode = modes[idx];
                    break;
                }
            }
        }
        return mode;
    }

    public static String convertNumberToMode(String number, String mode) {
        String convertedNum = "";
        int num;
        if (mode.equals("binary")) {
            num = Integer.valueOf(number);
            convertedNum = Integer.toBinaryString(num);
        }
        else if (mode.equals("octal")) {
            num = Integer.valueOf(number);
            convertedNum = Integer.toOctalString(num);
        }
        else if (mode.equals("decimal")) {
            convertedNum = number;
        }
        else if (mode.equals("hexadecimal")) {
            num = Integer.valueOf(number);
            convertedNum = Integer.toHexString(num);
        }
        return convertedNum;
    }

    //Method to Convert degrees to radians and vice-versa
    public static String switchUnits(String number, String mode) {
        Double num = Double.valueOf(number);
        String convertedUnit = "";
        if (mode.equals("degrees")) {
            convertedUnit = String.valueOf(Math.toRadians(num));
        }
        else if (mode.equals("radian")) {
            convertedUnit = String.valueOf(Math.toDegrees(num));
        }
    return convertedUnit;
    }
// if input contains disp:
    // if input is disp bin
    // if input is disp oct
    // if input is disp dec
    // if input is disp hex
    // else disp = next disp
}
