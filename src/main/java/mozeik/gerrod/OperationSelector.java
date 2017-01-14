package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class OperationSelector {

    Double currentValue;
    char operatorCode;
    Boolean exitConditionMet;

    public Boolean sendValueToOperation(Double currentValue, char operatorCode) {
        switch (operatorCode) {
            case 'q': //Square
                Square square = new Square();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                square.getSquare(currentValue);
                exitConditionMet = false;
                return exitConditionMet;
            case 'r': //Square Root
                SquareRoot squareRoot = new SquareRoot();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                squareRoot.getSquareRoot(currentValue);
                exitConditionMet = false;
                return exitConditionMet;
            case 'i': //Inverse
                Inverse inverse = new Inverse();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                inverse.getInverse(currentValue);
                exitConditionMet = false;
                return exitConditionMet;
            case 'b': //break
                exitConditionMet = true;
                return exitConditionMet;
            case 'm': //M+

            default:
                exitConditionMet = true;
                return exitConditionMet;
        }

    }
}
