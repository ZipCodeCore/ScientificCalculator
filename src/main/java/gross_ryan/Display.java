package gross_ryan;

/**
 * Created by ryangross on 1/13/17.
 */
public class Display {
    double displayedNumber = 0;
    String displayedNumberAsString;
    String displayMode = "DECIMAL";

    public void clearDisplay() {
        displayedNumber = 0;
    }

    public void setDisplay(double aNumber) {
        displayedNumber = aNumber;
    }

}
