package com.zipcodewilmington.scientificcalculator;
import java.util.Arrays;
/*
enum trigUnits {
    RADIANS, DEGREES;
}
enum displayModes {
    BINARY, OCTAL, DECIMAL, HEXADECIMAL;
}*/
public class Extended {
/*
    public displayModes currentDisplayMode = displayModes.DECIMAL;

    public trigUnits currentTrigUnits = trigUnits.DEGREES;
    */
//    private Character[] displayModesChar = {'b', 'o', 'd', 'h'};
    private String[] displayModeNames = {"binary","octal","decimal","hexadecimal"};

//    private Character[] trigUnitsChar = {'r','d'};
    private String[] trigUnitNames = {"radians","degrees"};

//    public Character currentTrigUnits = trigUnitsChar[0];
    private Integer curTrigUnitsIndex=0;

//    public Character currentDisplayMode = displayModesChar[2];
    private Integer curDisplayModeIndex=2;

    private double memory=0;

    public static void main(String[] args) {

    }

    public String convertOutput (double output){
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

    public String[] getDisplayModeOptions(){
     //   return Arrays.copyOf(displayModeNames,displayModeNames.length);
        String[] returnArray=new String[displayModeNames.length];
        System.arraycopy(displayModeNames,0,returnArray,0,displayModeNames.length);
        return returnArray;
    }

    public String[] getTrigModeOptions(){
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
/*
    private double convertDegreesToRadians (double degrees){
        return degrees*Math.PI/180;
    }
    */
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

    public String getCurTrigUnitsName(){
        return trigUnitNames[curTrigUnitsIndex];
    }

    public double log(double input){
        return Math.log10(input);
    }

    public double invLog(double input){
        return Math.pow(10,input);
    }

    public double ln(double input){
        return Math.log(input);
    }

    public double invLn(double input){
        return Math.exp(input);
    }

    public double factorial(double input){
        double myResult=1;
        if(input%1==0){
            for(Integer i=(int)Math.abs(input);i>1;i++){
                myResult *= i;
            }
            if(input<0) myResult *= (-1);
            return myResult;
        }
        return 0;

    }


}
