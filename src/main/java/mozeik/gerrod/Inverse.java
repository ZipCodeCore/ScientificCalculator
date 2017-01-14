package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Inverse extends CalculatorOperation {

    public Double getInverse(Double inputValue) {
        if (inputValue == 0) {
            System.out.println("ERR");
            return 0.0;
        } else {
            this.inputValue = inputValue;
            outputValue = (1 / inputValue);
            return outputValue;
        }
    }
}
