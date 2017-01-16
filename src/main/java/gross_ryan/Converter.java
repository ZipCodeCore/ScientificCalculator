package gross_ryan;

import java.util.Arrays;

/**
 * Created by ryangross on 1/15/17.
 */
public class Converter {



    // Revise & Test this!!
    // Does this belong in UserInterface?
    /*
    public String setModes(String aString) {
       aString = arrayOfModes[Arrays.asList(arrayOfModes).indexOf("aString") + 1;
       return aString;
    }
*/


    public String convertToBinary(double displayedNumber) {
        return Integer.toBinaryString((int) displayedNumber);
    }

    public String convertToHex(double displayedNumber) {
        return Integer.toHexString( (int) displayedNumber);
    }

    public String convertToOctal(double displayedNumber) {
        return Integer.toOctalString( (int) displayedNumber);
    }




}
