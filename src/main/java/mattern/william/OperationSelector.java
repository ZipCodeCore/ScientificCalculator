package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class OperationSelector {
    Double currentValue;
    char operatorCode;

    public void sendValueToOperation(Double currentValue, char operatorCode){
        switch (operatorCode){
            case 'q' :
                Square square = new Square();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                square.getSquare(currentValue);
                break;
            case 'r':
                SquareRoot squareRoot = new SquareRoot();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;


        }
    }
}
