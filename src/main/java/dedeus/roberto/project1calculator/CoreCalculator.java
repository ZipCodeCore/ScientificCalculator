package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/11/16.
 */

public class CoreCalculator {

    public double addition(double stateValue, double input){
        return stateValue + input;
    }

    public double subtraction(double stateValue, double input){
        return stateValue - input;
    }

    public double multiplication(double stateValue, double input){
        return stateValue * input;
    }

    public double division(double stateValue, double input){

        return stateValue / input;
    }

    public double square(double stateValue){
        return stateValue * stateValue;
    }

    public double squareRoot(double stateValue){
        return Math.sqrt(stateValue);
    }

    public double variableExponentiation(double stateValue, double exponent){
        return Math.pow(stateValue, exponent);
    }

    public double inverse(double stateValue){
        return 1 / stateValue;
    }

    public double switchSign(double stateValue){
        return stateValue * -1;
    }

    public double factorial(double stateValue){
        double subTotal = 0;
        double currentValue = stateValue;
        for(double i = stateValue; i > 0; i--, currentValue--) {
            subTotal += currentValue;
        }
        return subTotal;
    }


}
