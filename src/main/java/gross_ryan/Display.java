package gross_ryan;

/**
 * Created by ryangross on 1/13/17.
 */
public class Display {
    String displayedNumber = "0";

    public void clearDisplay() {
        displayedNumber = "0";
    }

    public void setDisplay(double aNumber) {
        displayedNumber = String.valueOf(aNumber);
    }


}
