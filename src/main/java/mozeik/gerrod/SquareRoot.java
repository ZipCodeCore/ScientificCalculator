package mozeik.gerrod;

import static java.lang.Math.sqrt;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class SquareRoot extends CalculatorOperation {

    public double getSquareRoot(Double inputValue) {
        this.inputValue = inputValue;
        outputValue = sqrt(inputValue);
        Display display = new Display();
        display.showOutputValue(outputValue);
        return outputValue;
    }
}
