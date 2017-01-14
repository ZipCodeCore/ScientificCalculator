package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class OperationSelector {

    Double currentValue;
    Double outputValue;
    char operatorCode;

    public Double sendValueToOperation(Double currentValue, char operatorCode) {
        switch (operatorCode) {
            case 'q': //Square
                Square square = new Square();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                outputValue = square.getSquare(currentValue);
                return outputValue;

            case 'r': //Square Root
                SquareRoot squareRoot = new SquareRoot();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                outputValue = squareRoot.getSquareRoot(currentValue);
                return outputValue;

            case 'i': //Inverse
                Inverse inverse = new Inverse();
                this.currentValue = currentValue;
                this.operatorCode = operatorCode;
                inverse.getInverse(currentValue);
                outputValue = inverse.getInverse(currentValue);
                return outputValue;

            case 'b': //break
                System.exit(0);
                return 0.0;

            /*case 'm': //M+*/

            default:
                System.exit(0);
                return 0.0;
        }

    }
}
