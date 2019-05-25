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

    public double cosine(double input){
        return 0;
    }

    public double tangent(double input){
        return 0;
    }

    public double invSine(double input){
        return 0;
    }

    public double invCosine(double input){
        return 0;
    }

    public double invTan(double input){
        return 0;
    }

    public void switchUnitsMode(){

    }

    public void switchUnitsMode(String mode){

    }

    public double log(double input){
        return 0;
    }

    public double invLog(double input){
        return 0;
    }

    public double ln(double input){
        return 0;
    }

    public double invLn(double input){
        return 0;
    }

    public double factorial(double input){
        return 0;
    }


}
