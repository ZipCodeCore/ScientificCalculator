/**
 * Created by danzygmund-felt on 4/28/17.
 */

public class Display {

    private double display;
    private CalculatorDisplayMode calculatorDisplayMode = new CalculatorDisplayMode();

    Display() {
        this.display = 0.0;
    }

    public void setDisplay(double x) {
        if(Double.isNaN(x)) {
            System.out.println("Err");
            return;
        }
        this.display = x;
        System.out.println(calculatorDisplayMode.toDisplayMode(x));
    }

    public void clearDisplay() {
        this.setDisplay(0.0);
    }

    public double getDisplay() {
        return this.display;
    }

}