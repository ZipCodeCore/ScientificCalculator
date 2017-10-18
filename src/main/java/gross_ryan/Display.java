package gross_ryan;

import java.util.Arrays;

/**
 * Created by ryangross on 1/13/17.
 */
public class Display {
    double displayedNumber = 0;
    String displayedNumberAsString;
    String displayMode = "decimalL";

    public void clearDisplay() {
        displayedNumber = 0;
        displayedNumberAsString = "";
        displayMode = "decimal";
    }

    public void setDisplay(double aNumber) {
        displayedNumber = aNumber;
    }

    public String convertToBinary(double displayedNumber) {
        return Integer.toBinaryString( (int) displayedNumber);
    }

    public String convertToHex(double displayedNumber) {
        return Integer.toHexString( (int) displayedNumber);
    }

    public String convertToOctal(double displayedNumber) {
        return Integer.toOctalString( (int) displayedNumber);
    }

    public String convertToDecimal(double displayedNumber) {
        return String.valueOf(displayedNumber);
    }

    public String convertDisplayedNumberString(double displayedNumber) {
        String result = "";
        switch(displayMode) {
            case "binary":
                result = convertToBinary(displayedNumber);
                break;
            case "hex":
                result = convertToHex(displayedNumber);
                break;
            case "octal":
                result = convertToOctal(displayedNumber);
                break;
            case "decimal":
                result = convertToDecimal(displayedNumber);
        }
        return result;
    }


    public void setEntireDisplay(double aNumber) {
        setDisplay(aNumber);
        displayedNumberAsString = convertDisplayedNumberString(aNumber);
    }

}
