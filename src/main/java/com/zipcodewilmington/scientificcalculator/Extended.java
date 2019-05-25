package com.zipcodewilmington.scientificcalculator;
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
    private Character[] displayModes = {'b', 'o', 'd', 'h'};

    private Character[] trigUnits = {'r','d'};

    public Character currentTrigUnits = trigUnits[0];

    public Character currentDisplayMode = displayModes[2];

    public double memory=0;


    public static void main(String[] args) {

    }

    public String convertOutput (double output){
        String converted="";
        switch (currentDisplayMode) {
            case 'b': {
                converted = Long.toBinaryString(Double.doubleToRawLongBits(output));
                break;
            }
            case 'o': {
                converted = Long.toOctalString(Double.doubleToRawLongBits(output));
                break;
            }
            case 'h': {
                converted = Double.toHexString(output);
                break;
            }
            default: {
                converted = String.format("%d", output);
                break;
            }
        }
        return converted;
    }

    public void switchDisplayMode() {
        switch (currentDisplayMode) {
            case 'b': {
                currentDisplayMode=displayModes[1];
                break;
            }
            case 'd': {
                currentDisplayMode = displayModes[3];
                break;
            }
            case 'h': {
                currentDisplayMode = displayModes[0];
                break;
            }
            default: {
                currentDisplayMode = displayModes[2];
                break;
            }
        }
    }

    public void switchDisplayMode(String mode){
        if(mode.equals("binary")) currentDisplayMode = displayModes[0];
        else if(mode.equals("octal")) currentDisplayMode = displayModes[1];
        else if(mode.equals("hexadecimal")) currentDisplayMode = displayModes[3];
        else currentDisplayMode = displayModes[2];
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
    public double convertDegreesToRadians (double degrees){
        return degrees*Math.PI/180;
    }
    */
    public double cosine(double input){
        if(currentTrigUnits=='d') input = Math.toRadians(input);
        return Math.cos(input);
    }

    public double tangent(double input){
        if(currentTrigUnits=='d') input = Math.toRadians(input);
        return Math.tan(input);
    }

    public double invSine(double input){
        if(currentTrigUnits=='d') input = Math.toRadians(input);
        return Math.asin(input);
    }

    public double invCosine(double input){
        if(currentTrigUnits=='d') input = Math.toRadians(input);
        return Math.acos(input);
    }

    public double invTan(double input){
        if(currentTrigUnits=='d') input = Math.toRadians(input);
        return Math.atan(input);
    }

    public void switchUnitsMode(){
        if(currentTrigUnits==trigUnits[0])currentTrigUnits=trigUnits[1];
        else currentTrigUnits = trigUnits[0];
    }

    public void switchUnitsMode(String mode){
        if(mode.equals("degrees")) currentTrigUnits=trigUnits[1];
        else currentTrigUnits = trigUnits[0];
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
            for(int i=Math.abs(input);i>1){
                myResult *= i;
            }
            if(input<0) myResult *= (-1);
            return myResult;
        }
        return 0;
    }


}
