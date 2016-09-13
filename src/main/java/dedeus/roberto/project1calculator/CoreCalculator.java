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

    public double inverse(double getStateValue){
        return 1 / getStateValue;
    }

    public double switchSign(double getStateValue){
        return getStateValue * -1;
    }


}
