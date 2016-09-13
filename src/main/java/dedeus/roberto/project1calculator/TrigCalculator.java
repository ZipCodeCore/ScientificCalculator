package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/13/16.
 */
public class TrigCalculator {

    double sine(double stateValue){
        return Math.sin(stateValue);
    }

    double cosine(double stateValue){
        return Math.cos(stateValue);
    }

    double tangent(double stateValue){
        return Math.tan(stateValue);
    }

    double inverveSine(double stateValue){
        return Math.sinh(stateValue);
    }

    double inverseCosine(double stateValue){
        return Math.cosh(stateValue);
    }

    double inverseTangent(double stateValue){
        return Math.tanh(stateValue);
    }
}
