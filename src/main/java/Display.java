

public class Display {

    private double display;
    private CalculatorDisplayMode calculatorDisplayMode = new CalculatorDisplayMode();

    Display() {
        this.display = 0.0;
    }

    public void switchDisplayMode() {
        calculatorDisplayMode.setMode();
    }

    public void switchDisplayMode(int x) {
        calculatorDisplayMode.setMode(x);
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