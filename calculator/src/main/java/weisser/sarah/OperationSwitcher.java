package weisser.sarah;

/**
 * Created by sarahweisser on 5/1/17.
 */
public class OperationSwitcher {

    private CalculationValues values;
    private String operation = values.getOperation();

    public OperationSwitcher(CalculationValues values) {
        this.values = values;
    }

    public String getOperation() {
        return operation;
    }

    
}
