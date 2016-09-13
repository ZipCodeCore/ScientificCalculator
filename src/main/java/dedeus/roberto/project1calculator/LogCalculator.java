package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/13/16.
 */
public class LogCalculator {
    public double log(double stateValue){
        return Math.log10(stateValue);
    }

    public double inverseLog(double stateValue){
        return Math.pow(Math.E, (Math.log10(stateValue)));
    }

    public double naturalLog(double stateValue){
        return Math.log(stateValue);
    }

    public double inverseNaturalLog(double stateValue){
        return Math.pow(Math.E, Math.log(stateValue));
    }
}
