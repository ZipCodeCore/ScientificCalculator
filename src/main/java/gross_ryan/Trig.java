package gross_ryan;

/**
 * Created by ryangross on 1/15/17.
 */
public class Trig {
    static String trigMode = "DEGREES";


    public double displayCos(double displayedNumber) {
        if (trigMode == "DEGREES") {
            return Math.cos(displayedNumber);
        }
        return Math.cos(displayedNumber) * 0.0174533;
    }

    public double displaySin(double displayedNumber) {
        if (trigMode == "DEGREES") {
            return Math.sin(displayedNumber);
        }
        return Math.sin(displayedNumber) * 0.0174533;
    }

    public double displayTan(double displayedNumber) {
        if (trigMode == "DEGREES") {
            return Math.tan(displayedNumber);
        }
        return Math.sin(displayedNumber) * 0.0174533;
    }



}
