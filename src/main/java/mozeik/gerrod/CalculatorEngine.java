package mozeik.gerrod;


/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class CalculatorEngine {

    Double currentValue;
    Double previousValue;
    Double memoryValue;
    char operatorCode;
    Double outputValue;

    public void startEngine() {

        Display display = new Display();
        currentValue = display.getCurrentValue();

        System.out.println("Display: " + currentValue);
        operatorCode = display.getOperatorCode();

        OperationSelector operationSelector = new OperationSelector();
        outputValue = operationSelector.sendValueToOperation(currentValue, operatorCode);
        display.showOutputValue(outputValue);

    }

}
