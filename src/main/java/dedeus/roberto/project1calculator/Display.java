package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/11/16.
 */
public class Display {

    public enum DisplayMode {BINARY, OCTAL, DECIMAL, HEXADECIMAL}

    double displayValue;
    DisplayMode displayMode;

    Display(){
        this.displayValue = 0.0;
        this.displayMode = DisplayMode.DECIMAL;
    }

    public double getDisplayValue(){
        return this.displayValue;
    }

    public void setDisplayValue(double displayValue){
        this.displayValue = displayValue;
    }

    public void clearDisplayValue(){
        this.displayValue = 0;
    }

    public void switchDisplayMode(DisplayMode displayMode){
        this.displayMode = displayMode;
    }

    public String error(String msg){
        return msg;
    }

}
