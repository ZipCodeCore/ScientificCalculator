/**
 * Created by andrewwong on 4/28/17.
 */
public class CalculationResult{

    private boolean isError;
    private double value;

    public CalculationResult(boolean isError, double value) {
        this.isError = isError;
        this.value = value;
    }

    public boolean hasError() {
        return isError;
    }

    public double getValue() {
        return value;
    }

}
