package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/11/16.
 */

public class CoreCalculator {

    double addition(double stateValue, double input){
        return stateValue + input;
    }

    double subtraction(double stateValue, double input){
        return stateValue - input;
    }

    double multiplication(double stateValue, double input){
        return stateValue * input;
    }

    double division(double stateValue, double input){

        return stateValue / input;
    }

    double square(double stateValue){
        return stateValue * stateValue;
    }

    double squareRoot(double stateValue){
        return Math.sqrt(stateValue);
    }

    double variableExponentiation(double stateValue, double exponent){
        return Math.pow(stateValue, exponent);
    }

    double inverse(double stateValue){
        return 1 / stateValue;
    }

    double switchSign(double stateValue){
        return stateValue * -1;
    }

    double factorial(double stateValue){
        double subTotal = 0;
        double currentValue = stateValue;
        for(double i = stateValue; i > 0; i--, currentValue--) {
            subTotal += currentValue;
        }
        return subTotal;
    }


}
