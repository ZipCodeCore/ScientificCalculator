package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/13/16.
 */
public class LogCalculator {
     double log(double stateValue){
        return Math.log10(stateValue);
    }

     double inverseLog(double stateValue){
        return Math.pow(Math.E, (Math.log10(stateValue)));
    }

     double naturalLog(double stateValue){
        return Math.log(stateValue);
    }

     double inverseNaturalLog(double stateValue){
        return Math.pow(Math.E, Math.log(stateValue));
    }
}
