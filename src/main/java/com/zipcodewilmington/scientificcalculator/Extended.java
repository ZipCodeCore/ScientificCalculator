package com.zipcodewilmington.scientificcalculator;
import java.text.DecimalFormat;
import java.util.Arrays;
//import java.lang.StringBuilder;
/*
enum trigUnits {
    RADIANS, DEGREES;
}
enum displayModes {
    BINARY, OCTAL, DECIMAL, HEXADECIMAL;
}*/
public class Extended{
/*
    public displayModes currentDisplayMode = displayModes.DECIMAL;

    public trigUnits currentTrigUnits = trigUnits.DEGREES;
    */
//    private Character[] displayModesChar = {'b', 'o', 'd', 'h'};
    private static String[] displayModeNames = {"binary","octal","decimal","hexadecimal"};

//    private Character[] trigUnitsChar = {'r','d'};
    private static String[] trigUnitNames = {"radians","degrees"};

//    public Character currentTrigUnits = trigUnitsChar[0];
    private Integer curTrigUnitsIndex;

//    public Character currentDisplayMode = displayModesChar[2];
    private Integer curDisplayModeIndex;

    private double memory;

    private DecimalFormat decFormat;

    public Extended() {
        curTrigUnitsIndex = 0;
        curDisplayModeIndex = 2;
        memory = 0;
        decFormat = new DecimalFormat("#.##########");
    }
<<<<<<< HEAD


    public String convertOutput (double output){
=======
/*
    private static String doubleToBinaryString (double given, int sigDigits){
        long integerPart = (long)given;
        double fractional = given-integerPart;
        StringBuilder myBuilder=new StringBuilder("");
        while (myBuilder.length()<sigDigits && fractional>0){
            double curDigit = 2*fractional;
            if (curDigit>0){
                given=curDigit-1;
                myBuilder.append(1);
            }
            else {
                given=curDigit;
                myBuilder.append(1);
            }
        }
        String output = Long.toBinaryString(integerPart)+'.'+myBuilder.toString();
        return output;
    }
*/
    public static String convertOutput (double output){
        if(output%1!=0 && curDisplayModeIndex!=2) return "Invalid input.";
        long asLong = (long) output;
>>>>>>> a7433155b0cc3aa68d4221adcdff5644c49189f8
        String converted;
        switch (curDisplayModeIndex) {
            case 0: {
                converted = Long.toBinaryString(asLong);
                break;
            }
            case 1: {
                converted = Long.toOctalString(asLong);
                break;
            }
            case 3: {
                converted = Long.toHexString(asLong);
                break;
            }
            default: {
                converted = decFormat.format(output);
                break;
            }
        }
        return converted;
    }

    public void switchDisplayMode() {
        if (curDisplayModeIndex > 2) curDisplayModeIndex=0;
        else curDisplayModeIndex++;
    }

    public void switchDisplayMode(String mode){
        if(mode.equals(displayModeNames[0])) curDisplayModeIndex=0;
        else if(mode.equals(displayModeNames[1])) curDisplayModeIndex=1;
        else if(mode.equals(displayModeNames[2])) curDisplayModeIndex=2;
        else if(mode.equals(displayModeNames[3])) curDisplayModeIndex=3;
    }

    public String getCurDisplayModeName(){
        return displayModeNames[curDisplayModeIndex];
    }

    public static String[] getDisplayModeOptions(){
     //   return Arrays.copyOf(displayModeNames,displayModeNames.length);
        String[] returnArray=new String[displayModeNames.length];
        System.arraycopy(displayModeNames,0,returnArray,0,displayModeNames.length);
        return returnArray;
    }

    public String getCurTrigUnitsName(){
        return trigUnitNames[curTrigUnitsIndex];
    }


    public static String[] getTrigModeOptions(){
        //   return Arrays.copyOf(displayModeNames,displayModeNames.length);
        String[] returnArray=new String[trigUnitNames.length];
        System.arraycopy(trigUnitNames,0,returnArray,0,trigUnitNames.length);
        return returnArray;
    }

    public void memClear(){
        memory=0;
    }

    public void memPlus(double input){
        memory+=input;
    }

    public double memRecal(){
        return memory;
    }

    public double sine(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.sin(input);
    }

    public double cosine(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.cos(input);
    }

    public double tangent(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.tan(input);
    }

    public double invSine(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.asin(input);
    }

    public double invCosine(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.acos(input);
    }

    public double invTan(double input){
        if(curTrigUnitsIndex==1) input = Math.toRadians(input);
        return Math.atan(input);
    }

    public void switchUnitsMode(){
        if(curTrigUnitsIndex==0)curTrigUnitsIndex++;
        else curTrigUnitsIndex=0;
    }

    public void switchUnitsMode(String mode){
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

    public String fib(Double num1, Double num2){
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
