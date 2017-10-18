package gross_ryan;

/**
 * Created by ryangross on 1/15/17.
 */
public class Trig {
    static String trigMode = "RADIANS";


    public double displayCos(double displayedNumber) {
        if (trigMode.equals("RADIANS")) {
            return Math.cos(displayedNumber);
        }
        return Math.cos(displayedNumber * 0.0174533);
    }

    public double displaySin(double displayedNumber) {
        if (trigMode.equals("RADIANS")) {
            return Math.sin(displayedNumber);
        } return Math.sin(displayedNumber * 0.0174533);
    }

    public double displayTan(double displayedNumber) {
        if (trigMode.equals("RADIANS")) {
            return Math.tan(displayedNumber);
        }
        return Math.tan(displayedNumber * 0.0174533);
    }

    public double inverseCos(double displayedNumber) {
       return 1 / displayCos(displayedNumber);
    }

    public double inverseSin(double displayedNumber) {
        return 1 / displaySin(displayedNumber);
    }

    public double inverseTan(double displayedNumber) {
        return 1 / displayTan(displayedNumber);
    }

    public double factorial(double displayedNumber) {
        double answer = 1;
        for (int i = 1; i <= (int) displayedNumber; i++) {
            answer *= i;
        }
        return answer;
    }

}
