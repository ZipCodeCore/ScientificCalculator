
public class BasicMath {

    public double leftOperand;
    public double rightOperand;
    public double result;

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
            System.out.println("Can not divide by zero");
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


}
