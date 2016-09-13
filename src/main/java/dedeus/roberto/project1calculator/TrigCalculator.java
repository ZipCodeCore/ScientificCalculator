package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/13/16.
 */
public class TrigCalculator {

    public double sine(double stateValue){
        return Math.sin(stateValue);
    }

    public double cosine(double stateValue){
        return Math.cos(stateValue);
    }

    public double tangent(double stateValue){
        return Math.tan(stateValue);
    }

    public double inverveSine(double stateValue){
        return Math.sinh(stateValue);
    }

    public double inverseCosine(double stateValue){
        return Math.cosh(stateValue);
    }

    public double inverseTangent(double stateValue){
        return Math.tanh(stateValue);
    }
}
