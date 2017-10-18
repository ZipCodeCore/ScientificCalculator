package armstrong.alexandra;

import static armstrong.alexandra.DisplayMode.*;
import static armstrong.alexandra.Notation.*;
import static armstrong.alexandra.TrigUnit.*;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */

public class ScientificCalculator extends Calculator{
    private double memory;
    private DisplayMode mode;
    private TrigUnit trigUnit;
    private Notation notation;
    private String hexDisplay;

    public ScientificCalculator(){
        mode = DECIMAL;
        trigUnit = DEGREES;
        notation = STANDARD;
    }

    public String getHexDisplay(){
        return hexDisplay;
    }

    public void setHexDisplay(String hexDisplay){
        this.hexDisplay = hexDisplay;
    }

    public double getMemory(){
        return memory;
    }

    public void setMemory(double memory){
        this.memory = memory;
    }

    public void addDisplayToMemory(){
        memory = getDisplay();
    }

    public void resetMemory(){
        memory = 0.0d;
    }

    public void recallStoredValueFromMemory(){
        setDisplay(memory);
    }

    public DisplayMode getMode(){
        return mode;
    }

    public void switchDisplayMode(){
        if (mode == HEXADECIMAL){
            mode = DECIMAL;
        }
        else{
            mode = (DisplayMode.values()[mode.ordinal() + 1]);
        }
    }

    public void switchDisplayMode(DisplayMode mode){
        this.mode = mode;
    }

    public Notation getNotation(){
        return notation;
    }

    public void toggleScientificNotation(){
        if (notation == STANDARD){
            notation = SCIENTIFIC;
        }
        else {
            notation = STANDARD;
        }
    }

    public void toggleScientificNotation(Notation notation){
        this.notation = notation;
    }

    public void sine(){
        setDisplay(Math.sin(getDisplay()));
    }

    public void cosine(){
        setDisplay(Math.cos(getDisplay()));
    }

    public void tangent(){
        setDisplay(Math.tan(getDisplay()));
    }

    public void inverseSine(){
        setDisplay(1.0d/(Math.sin(getDisplay())));
    }

    public void inverseCosine(){
        setDisplay(1.0d/(Math.cos(getDisplay())));
    }

    public void inverseTangent(){
        setDisplay(1.0d/(Math.tan(getDisplay())));
    }

    public TrigUnit getTrigUnit(){
        return trigUnit;
    }

    public void switchTrigUnitsMode(){
        if (trigUnit == DEGREES){
            trigUnit = RADIANS;
        }
        else {
            trigUnit = DEGREES;
        }
    }

    public void switchTrigUnitsMode(TrigUnit trigUnit){
        this.trigUnit = trigUnit;
    }

    public void log(){
        setDisplay(Math.log10(getDisplay()));
    }

    public void inverseLog(){
        setDisplay(1d / Math.log10(getDisplay()));
    }

    public void naturalLog(){
        setDisplay(Math.log(getDisplay()));
    }

    public void inverseNaturalLog(){
        setDisplay(1d / Math.log(getDisplay()));
    }

    public void factorial(){
        int temp = 1;
        for(int i = 1; i <= getDisplay(); i++){
            temp *= i;
        }
        setDisplay(temp);
    }
}
