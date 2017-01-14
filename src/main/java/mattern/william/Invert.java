package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class Invert extends CalculatorOperation {

    public Double getInverse(Double inputValue){
        if (inputValue == 0){
            Display display = new Display();
            display.sendErrorMessage();
            return 0.0;

        } else {
            outputValue = 1/inputValue;
            Display display = new Display();
            display.showOutputValue(outputValue);
            return outputValue;
        }
    }
}
