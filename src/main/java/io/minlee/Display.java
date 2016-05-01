package io.minlee;

/**
 * Created by minlee on 4/30/16.
 */
public class Display {


    public enum DisplayType {
        BINARY, OCTAL, DECIMAL, HEXADECIMAL
    }

    DisplayType displayType;

    public Display(DisplayType displayType) {
        this.displayType = displayType;
    }

    public void switchDisplayMode(){
        switch (displayType) {
            case BINARY:
                displayType = DisplayType.OCTAL;
                break;
            case OCTAL:
                displayType = DisplayType.DECIMAL;
                break;
            case DECIMAL:
                displayType = DisplayType.HEXADECIMAL;
                break;
            case HEXADECIMAL:
                displayType = DisplayType.BINARY;
                break;
        }
    }
    public void switchDisplayMode(String newDisplayType){
        if(newDisplayType.equals("BINARY")){
            displayType = DisplayType.BINARY;
        }
        else if(newDisplayType.equals("OCTAL")){
            displayType = DisplayType.OCTAL;
        }
        else if(newDisplayType.equals("DECIMAL")){
            displayType = DisplayType.DECIMAL;
        }
        else if(newDisplayType.equals("HEXADECIMAL")){
            displayType = DisplayType.HEXADECIMAL;
        }
        else{
            System.out.println("Did not enter a correct type, staying with current mode");
        }
    }
    public String getDisplayMode(){
        return displayType.toString();
    }




    public String getCorrectDisplay(double displayValue) {
        String displayString = "";
        int intDisplayValue;
        ScientificCalculator calc = new ScientificCalculator();
        intDisplayValue = calc.calculateRoundToNearestInteger(displayValue);
        Integer converter = new Integer(1);
        switch (displayType) {
            case BINARY:
                displayString = converter.toBinaryString(intDisplayValue);
                break;
            case OCTAL:
                displayString = converter.toOctalString(intDisplayValue);
                break;
            case DECIMAL:
                displayString = Double.toString(displayValue);
                break;
            case HEXADECIMAL:
                displayString = converter.toHexString(intDisplayValue);
                break;
        }
        return displayString;
    }
}
