package weisser.sarah;

/**
 * Created by sarahweisser on 4/30/17.
 */
public class CalculationValues {

    private double value1;
    private double value2;
    private String operation;

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public String getOperation() {
        return operation;
    }

    public CalculationValues(double value1, double value2, String operation) {

        this.value1 = value1;
        this.value2 = value2;
        this.operation = operation;

    }
}
