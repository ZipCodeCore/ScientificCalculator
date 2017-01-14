package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class OperationSelector {

    Double currentValue;
    char operatorCode;

    public void sendValueToOperation(Double currentValue, char operatorCode) {
        switch (operatorCode) {
            case 'q': //Square
                Square square = new Square();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                square.getSquare(currentValue);
                break;
            case 'r': //Square Root
                SquareRoot squareRoot = new SquareRoot();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                squareRoot.getSquareRoot(currentValue);
        }

    }
}
