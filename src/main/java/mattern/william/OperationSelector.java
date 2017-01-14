package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class OperationSelector {
    Double currentValue;
    char operatorCode;
    Boolean exitConditionMet;

    public Boolean sendValueToOperation(Double currentValue, char operatorCode){
        switch (operatorCode){
            case 'q' :
                Square square = new Square();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                square.getSquare(currentValue);
                exitConditionMet = false;
                return exitConditionMet;

            case 'r':
                SquareRoot squareRoot = new SquareRoot();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                squareRoot.getSquareRoot(currentValue);
                exitConditionMet = false;
                return exitConditionMet;

            case 'i':
                Invert invert = new Invert();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                invert.getInverse(currentValue);
                exitConditionMet = false;
                return exitConditionMet;

            case 'b':
                exitConditionMet = true;
                return exitConditionMet;

            default:
                exitConditionMet = true;
                return exitConditionMet;

        }
    }
}
