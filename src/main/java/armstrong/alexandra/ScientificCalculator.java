package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */

public class ScientificCalculator extends Calculator{
    private double memory;

    public ScientificCalculator(){}

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

    //public void switchDisplayMode(){}

    //public void switchDisplayMode(String mode){}

    //public void toggleScientificNotation(){}

    //public void sine(){}

    //public void cosine(){}

    //public void tangent(){}

    //public void inverseSine(){}

    //public void inverseCosine(){}

    //public void inverseTangent(){}

    //public void switchUnitsMode(){}

    //public void switchUnitsMode(String mode){}

}
