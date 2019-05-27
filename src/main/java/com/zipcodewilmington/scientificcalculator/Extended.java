package com.zipcodewilmington.scientificcalculator;
import java.util.Arrays;
//import java.lang.StringBuilder;
/*
enum trigUnits {
    RADIANS, DEGREES;
}
enum displayModes {
    BINARY, OCTAL, DECIMAL, HEXADECIMAL;
}*/
public class Extended extends Core{
/*
    public displayModes currentDisplayMode = displayModes.DECIMAL;

    public trigUnits currentTrigUnits = trigUnits.DEGREES;
    */
//    private Character[] displayModesChar = {'b', 'o', 'd', 'h'};
    private static String[] displayModeNames = {"binary","octal","decimal","hexadecimal"};

//    private Character[] trigUnitsChar = {'r','d'};
    private static String[] trigUnitNames = {"radians","degrees"};

//    public Character currentTrigUnits = trigUnitsChar[0];
    private static Integer curTrigUnitsIndex=0;

//    public Character currentDisplayMode = displayModesChar[2];
    private static Integer curDisplayModeIndex=2;

    private static double memory=0;

    public static void main(String[] args) {

    }

    public static String convertOutput (double output){
        String converted;
        switch (curDisplayModeIndex) {
            case 0: {
                converted = Long.toBinaryString(Double.doubleToRawLongBits(output));
                break;
            }
            case 1: {
                converted = Long.toOctalString(Double.doubleToRawLongBits(output));
                break;
            }
            case 3: {
                converted = Double.toHexString(output);
                break;
            }
            default: {
                converted = String.format("%1.10f", output);
                break;
            }
        }
        return converted;
    }

    public static void switchDisplayMode() {
        if (curDisplayModeIndex > 2) curDisplayModeIndex=0;
        else curDisplayModeIndex++;
    }

    public static void switchDisplayMode(String mode){
        if(mode.equals(displayModeNames[0])) curDisplayModeIndex=0;
        else if(mode.equals(displayModeNames[1])) curDisplayModeIndex=1;
        else if(mode.equals(displayModeNames[2])) curDisplayModeIndex=2;
        else if(mode.equals(displayModeNames[3])) curDisplayModeIndex=3;
    }

    public static String getCurDisplayModeName(){
        return displayModeNames[curDisplayModeIndex];
    }

    public static String[] getDisplayModeOptions(){
     //   return Arrays.copyOf(displayModeNames,displayModeNames.length);
        String[] returnArray=new String[displayModeNames.length];
        System.arraycopy(displayModeNames,0,returnArray,0,displayModeNames.length);
        return returnArray;
    }

    public static String getCurTrigUnitsName(){
        return trigUnitNames[curTrigUnitsIndex];
    }


    public static String[] getTrigModeOptions(){
        //   return Arrays.copyOf(displayModeNames,displayModeNames.length);
        String[] returnArray=new String[trigUnitNames.length];
        System.arraycopy(trigUnitNames,0,returnArray,0,trigUnitNames.length);
        return returnArray;
    }

    public static void memClear(){
        memory=0;
    }

    public static void memPlus(double input){
        memory+=input;
    }

    public static double memRecal(){
        return memory;
    }
/*
    private double convertDegreesToRadians (double degrees){
        return degrees*Math.PI/180;
    }
    */
public static double sine(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.sin(input);
    }

    public static double cosine(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.cos(input);
    }

    public static double tangent(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.tan(input);
    }

    public static double invSine(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.asin(input);
    }

    public static double invCosine(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.acos(input);
    }

    public static double invTan(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.atan(input);
    }

    public static void switchUnitsMode(){
        if(curTrigUnitsIndex==0)curTrigUnitsIndex++;
        else curTrigUnitsIndex=0;
    }

    public static void switchUnitsMode(String mode){
        if(mode.equals(trigUnitNames[0])) curTrigUnitsIndex=0;
        else if(mode.equals(trigUnitNames[1]))curTrigUnitsIndex = 1;
    }

    public static double log(double input){
        return Math.log10(input);
    }

    public static double invLog(double input){
        return Math.pow(10,input);
    }

    public static double ln(double input){
        return Math.log(input);
    }

    public static double invLn(double input){
        return Math.exp(input);
    }

    public static double factorial(double input){
        double myResult=1;
        if(input%1==0){
            for(Integer i=(int)Math.abs(input);i>1;i--){
                myResult *= i;
            }
            if(input<0) myResult *= (-1);
            return myResult;
        }
        return 0;

    }

    public static String fib(Double num1, Double num2){
    double prev=0;
    StringBuilder myBuilder = new StringBuilder(Double.toString(prev));
    for (int i=1;i<num2;i++){
            if(i%2==1) {
                myBuilder.append(", " + convertOutput(num1));
                prev+=num1;
            }
            else{
                myBuilder.append(", " + convertOutput(prev));
                num1+=prev;
            }

        }
    return myBuilder.toString();
    }


}
