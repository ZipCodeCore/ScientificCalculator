package io.robertcarroll;

public class Display {
    private String shownNumber = "0";
    private double storedDecimalNumber;
    private ViewModes displayMode = ViewModes.DECIMAL;

    public double getStoredDecimalNumber() {
        return storedDecimalNumber;
    }

    public void setStoredDecimalNumber(double storedDecimalNumber) {
        this.storedDecimalNumber = storedDecimalNumber;
    }

    public String getShownNumber(){
        return shownNumber;
    }

    public void setShownNumber(double newNumber) {
        switch(displayMode){
            case BINARY:
                if(checkError()){
                    this.shownNumber = "Err";
                }else{
                    this.shownNumber = convertToBinary(newNumber);
                }
                break;
            case OCTAL:
                if(checkError()){
                    this.shownNumber = "Err";
                }else{
                    this.shownNumber = convertToOctal(newNumber);
                }
                break;
            case DECIMAL:
                if(checkError()){
                    this.shownNumber = "Err";
                }else{
                    this.shownNumber = convertToDecimal(newNumber);
                }
                break;
            case HEXADECIMAL:
                if(checkError()){
                    this.shownNumber = "Err";
                }else{
                    this.shownNumber = convertToHexadecimal(newNumber);
                }
                break;
        }
        System.out.println("DISPLAY: " + this.shownNumber);
    }

    public void clearDisplay() {
        setShownNumber(0);
        setStoredDecimalNumber(0);
    }

    public void switchMode(){

        switch(displayMode){
            case BINARY:
                displayMode = ViewModes.OCTAL;
                setShownNumber(storedDecimalNumber);
                break;
            case OCTAL:
                displayMode = ViewModes.DECIMAL;
                setShownNumber(storedDecimalNumber);
                break;
            case DECIMAL:
                displayMode = ViewModes.HEXADECIMAL;
                setShownNumber(storedDecimalNumber);
                break;
            case HEXADECIMAL:
                displayMode = ViewModes.BINARY;
                setShownNumber(storedDecimalNumber);
                break;
        }
    }

    public void switchMode(int mode){
        switch(mode){
            case 1:
                displayMode = ViewModes.BINARY;
                setShownNumber(storedDecimalNumber);
                break;
            case 2:
                displayMode = ViewModes.OCTAL;
                setShownNumber(storedDecimalNumber);
                break;
            case 3:
                displayMode = ViewModes.DECIMAL;
                setShownNumber(storedDecimalNumber);
                break;
            case 4:
                displayMode = ViewModes.HEXADECIMAL;
                setShownNumber(storedDecimalNumber);
                break;
        }
    }

    public String convertToBinary(double number) {
        String numberString = String.valueOf(number);
        String parsedValue = "";
        String[] splitDouble = numberString.split("\\.");

        int beforeDecimal = Integer.parseInt(splitDouble[0]);
        int afterDecimal = Integer.parseInt(splitDouble[1]);

        String beforeDecimalBinary = Integer.toBinaryString(beforeDecimal);
        String afterDecimalBinary = Integer.toBinaryString(afterDecimal);

        parsedValue = parsedValue.concat(beforeDecimalBinary);
        //parsedValue = parsedValue.concat(" 00101110 ");
        parsedValue = parsedValue.concat(".");
        parsedValue = parsedValue.concat(afterDecimalBinary);

        return parsedValue;
    }

    public String convertToOctal(double number) {
        String numberString = String.valueOf(number);
        String parsedValue = "";
        String[] splitDouble = numberString.split("\\.");

        int beforeDecimal = Integer.parseInt(splitDouble[0]);
        int afterDecimal = Integer.parseInt(splitDouble[1]);

        String beforeDecimalOctal = Integer.toOctalString(beforeDecimal);
        String afterDecimalOctal = Integer.toOctalString(afterDecimal);

        parsedValue = parsedValue.concat(beforeDecimalOctal);
        parsedValue = parsedValue.concat(".");
        parsedValue = parsedValue.concat(afterDecimalOctal);

        return parsedValue;
    }

    public String convertToDecimal(double number) {
        String value = String.valueOf(number);
        return value;
    }

    public String convertToHexadecimal(double number) {
        String numberString = String.valueOf(number);
        String parsedValue = "";
        String[] splitDouble = numberString.split("\\.");

        int beforeDecimal = Integer.parseInt(splitDouble[0]);
        int afterDecimal = Integer.parseInt(splitDouble[1]);

        String beforeDecimalOctal = Integer.toHexString(beforeDecimal);
        String afterDecimalOctal = Integer.toHexString(afterDecimal);

        parsedValue = parsedValue.concat(beforeDecimalOctal);
        parsedValue = parsedValue.concat(".");
        parsedValue = parsedValue.concat(afterDecimalOctal);

        return parsedValue;
    }

    public boolean checkError(){
        return Double.isNaN(storedDecimalNumber) || Double.isInfinite(storedDecimalNumber);
    }
}