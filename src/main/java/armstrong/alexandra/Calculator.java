package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */

public class Calculator {
    private double [] display = new double[2];
    //private String errorDisplay;

    public Calculator(){}

    public double getDisplay(){
        return display[0];
    }

    public void setDisplay(double display){
        this.display[0] = display;
    }

    public void clearDisplay(){
        display[0] = 0.0d;
    }

    public void add(double add){
        display[0] = getDisplay() + add;
    }

    public void subtract(double subtract){
        display[0] = getDisplay() - subtract;
    }

    public void multiply(double multiply){
        display[0] = getDisplay() * multiply;
    }

    public void divide(double divide){
        if (divide == 0){
            display[1] = -1.0d;
        }
            display[0] = getDisplay() / divide;
    }

    //public void percent(){}

    public void square(){
        display[0] = getDisplay() * getDisplay();
    }

    public void squareRoot(){
        display[0] = Math.pow(getDisplay(), 0.5d);
    }

    //public void exponent(double exponent){}

    public void inverse(){
        display[0] = (1.0d / getDisplay());
    }

    //public void invertSignOfDisplay(){}

    public double getError(){
        return display[1];
    }

    public void errorDisplay(){
        display[1] = -1.0d;
    }

    public void clearError(){
        display[1] = 0;
    }
}
