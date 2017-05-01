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
        if (secondOperand == 0) {
            return Double.NaN;
        } else {
            return firstOperand / secondOperand;
        }
    }


    public double exponent(double firstOperand, double secondOperand) {
         if(firstOperand == 0 && secondOperand < 0) {
             return Double.NaN;
         }
         else {
             return Math.pow(firstOperand, secondOperand);
         }
    }


    public double square(double firstOperand) {return Math.pow(firstOperand, 2.0);}


    public double squareRoot(double firstOperand) {
        if (firstOperand <0) {
            return Double.NaN;
        }
        else{
            return Math.sqrt(firstOperand);
        }
    }


    public double inverse(double firstOperand) {
        if (firstOperand == 0) {
            return Double.NaN;
        }
        else{
            return 1 / firstOperand;
        }
    }


    public double switchSign(double firstOperand) {return firstOperand * -1;}

}

