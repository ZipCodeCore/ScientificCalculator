
public class BasicMath {
    double result;

    public double add (double leftOperand, double rightOperand) {
        result = leftOperand + rightOperand;
        return result;
    }

    public double subtract (double leftOperand, double rightOperand) {
        result = leftOperand - rightOperand;
        return result;
    }

    public double divide (double leftOperand, double rightOperand) {
        if (rightOperand == 0) {
            System.out.println("ERR");
        } else {
            result = leftOperand / rightOperand;
        }
        return result;
    }

    public double multiply (double leftOperand, double rightOperand) {
        result = leftOperand * rightOperand;
        return result;
    }

    public double exponential (double leftOperand, double rightOperand) {
        result = Math.pow(leftOperand,rightOperand);
        return result;
    }

    public double squareRoot (double leftOperand) {
        result = Math.sqrt(leftOperand);
        return result;
    }


}
