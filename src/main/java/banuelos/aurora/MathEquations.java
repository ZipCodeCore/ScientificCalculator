package banuelos.aurora;

/**
 * Created by aurorabanuelos on 4/29/17.
 */
public class MathEquations {



    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double subtract(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double multiply(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double divide(double firstOperand, double secondOperand) {
        if(secondOperand == 0){
            return Double.NaN;
        }
        else {
            return firstOperand / secondOperand;
        }
    }
}
