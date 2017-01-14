package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Inverse extends CalculatorOperation {

    public Double getInverse(Double inputValue) {
        if (inputValue == 0) {
            Display display = new Display();
            display.sendErrorMessage();
            return 0.0;
        } else {
            this.inputValue = inputValue;
            outputValue = (1 / inputValue);
            Display display = new Display();
            display.showOutputValue(outputValue);
            return outputValue;
        }
    }
}
