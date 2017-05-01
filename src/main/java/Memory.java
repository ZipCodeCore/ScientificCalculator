/**
 * Created by andrewwong on 4/28/17.
 */
public class Memory {
    private double displayValue;
    private double memoryValue;
    private boolean error;

    public Memory() {
        displayValue = 0;
        memoryValue = 0;
        error = false;
    }


    public double getDisplayValue(){
        return displayValue;
    }

    public void setDisplayValue(double displayValue){
        this.displayValue = displayValue;
    }

    public double getMemoryValue(){
        return memoryValue;
    }

    public void setMemoryValue(double memoryValue){
        this.memoryValue = memoryValue;
    }

    //shouldn't this be in display? or getDisplayValueInString?
    public String printDisplayValueInString(){
        return Double.toString(displayValue);
    }

    public void addDisplayValueToMemoryValue(){
        memoryValue += displayValue;
    }

    public void resetMemoryValue(){
        memoryValue = 0;
    }

    public void setDisplayValuetoMemoryValue(){
        displayValue = memoryValue;
    }

    public void clearDisplay(){
        displayValue = 0;
    }

    public void setError(boolean error){
        this.error = error;

    }

    public boolean hasError(){
        return error;
    }
}
