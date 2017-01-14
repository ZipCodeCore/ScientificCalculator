package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class CalculatorEngine {
    Double currentValue;
    char operatorCode;
    Double outputValue;


    public void StartEngine(){
        Display display = new Display();
        currentValue = display.getCurrentValue();

        System.out.println("Display: " + currentValue);
        operatorCode = display.getOperatorCode();

        OperationSelector operationSelector = new OperationSelector();
        operationSelector.sendValueToOperation(currentValue,operatorCode);


    }

}
