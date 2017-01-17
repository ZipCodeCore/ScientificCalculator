package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */

public class Calculator {
    private double display;

    private String errorDisplay;

    public Calculator(){
        errorDisplay = "nope";
    }

    public double getDisplay(){
        return display;
    }

    public void setDisplay(double display){
        this.display = display;
    }

    public void clearDisplay(){
        display = 0.0d;
    }

    public void add(double add){
        display = getDisplay() + add;
    }

    public void subtract(double subtract){
        display = getDisplay() - subtract;
    }

    public void multiply(double multiply){
        display = getDisplay() * multiply;
    }

    public void divide(double divide){
        if (divide == 0){
            setErrorDisplay();
        } else {
            display = getDisplay() / divide;
        }
    }

    public void percent(){
        divide(100d);
    }

    public void square(){
        exponent(2d);
    }

    public void squareRoot(){
        exponent(0.5d);
    }

    public void exponent(double exponent){
        display = Math.pow(getDisplay(), exponent);
    }

    public void inverse(){
        display = (1.0d / getDisplay());
    }

    public void invertSignOfDisplay(){
        multiply(-1d);
    }

    public String getErrorDisplay(){
        return errorDisplay;
    }

    public void setErrorDisplay(){
        errorDisplay = "Err";
    }

    public void clearErrorDisplay(){
        errorDisplay = null;
    }
}
