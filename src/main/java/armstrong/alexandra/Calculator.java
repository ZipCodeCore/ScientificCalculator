package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */

public class Calculator {
    private double display;

    private String errorDisplay;

    public Calculator(){}

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
            errorDisplay();
        } else {
            display = getDisplay() / divide;
        }
    }

    public void percent(){
        divide(100d);
    }

    public void square(){
        display = getDisplay() * getDisplay();
    }

    public void squareRoot(){
        display = Math.pow(getDisplay(), 0.5d);
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

    public String getError(){
        return errorDisplay;
    }

    public void errorDisplay(){
        errorDisplay = "Err";
    }

    public void clearError(){
        errorDisplay = null;
    }
}
