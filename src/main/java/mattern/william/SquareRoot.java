package mattern.william;

import static java.lang.Math.sqrt;

/**
 * Created by williammattern on 1/13/17.
 */
public class SquareRoot extends CalculatorOperation {

    public Double getSquareRoot(Double inputValue){
        outputValue = sqrt(inputValue);
        Display display = new Display();
        display.showOutputValue(outputValue);
        return outputValue;
    }
}
