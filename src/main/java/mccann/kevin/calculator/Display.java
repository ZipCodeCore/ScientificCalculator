package mccann.kevin.calculator;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class Display {

    double currentvalue = 0;

    public void print(Object o) {
        System.out.println(o);
    }

    public double getCurrentValue() {
        return this.currentvalue;
    }

    public void setCurrentValue(double value) {
        this.currentvalue = value;
    }

    public void clearCurrentValue() {
        currentvalue = 0;
    }

    public void errorDisplay() {
        System.out.println("Err");
    }

    public double switchSign(double x) {
        return -x;
    }

    public void switchDisplayMode() {
        setCurrentValue(Integer.toString(currentvalue, 2));
    }
}