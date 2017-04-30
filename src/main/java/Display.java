/**
 * Created by danzygmund-felt on 4/28/17.
 */

public class Display {

    DisplayMode displayMode;
    private double display;

    Display() {
        this.setDisplay(0.0);
    }

    public void setDisplay(double x) {
        if(Double.isNaN(x)) {
            System.out.println("Err");
        }
        this.display = x;
        System.out.println(displayMode.toDisplayMode(x));
    }

    public void clearDisplay() {
        this.setDisplay(0.0);
    }

    public double getDisplay() {
        return this.display;
    }

}