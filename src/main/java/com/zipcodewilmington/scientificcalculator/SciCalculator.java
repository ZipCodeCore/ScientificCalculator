package com.zipcodewilmington.scientificcalculator;

public class SciCalculator {
    public static String sine(double x){
        return String.valueOf(Math.sin(x));
    }
    public static String cosine(double x){
        return String.valueOf(Math.cos(x));
    }
    public static String tangent(double x){
        return String.valueOf(Math.tan(x));
    }
    public static String csc(double x){
        return String.valueOf(Math.asin(x));
    }
    public static String sec(double x){
        return String.valueOf(Math.acos(x));
    }
    public static String cotan(double x){
        return String.valueOf(Math.atan(x));
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
            mode = "hexidecimal";
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
        int num = Integer.valueOf(number);
        String convertedNum = "";
        if (mode.equals("binary")) {
            convertedNum = Integer.toBinaryString(num);
        }
        else if (mode.equals("octal")) {
            convertedNum = Integer.toOctalString(num);
        }
        else if (mode.equals("decimal")) {
            convertedNum = String.valueOf(num);
        }
        else if (mode.equals("hexadecimal")) {
            convertedNum = Integer.toHexString(num);
        }
        return convertedNum;
    }
// if input contains disp:
    // if input is disp bin
    // if input is disp oct
    // if input is disp dec
    // if input is disp hex
    // else disp = next disp
}
