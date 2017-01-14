package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Square extends CalculatorOperation {

    public Double getSquare(Double inputValue) {
        this.inputValue = inputValue;
        outputValue = (inputValue * inputValue);
        return outputValue;
    }
}
