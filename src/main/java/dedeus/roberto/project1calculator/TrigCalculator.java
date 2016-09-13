package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/13/16.
 */

public class TrigCalculator {

    double normalizeToDegree(State.TrigUnit trigUnit, double stateValue){
        if(trigUnit == State.TrigUnit.RADIANS){
            return Math.toDegrees(stateValue);
        } else {
            return stateValue;
        }
    }

    double normalizeToRadian(State.TrigUnit trigUnit, double stateValue){
        if(trigUnit == State.TrigUnit.DEGREES){
            return Math.toRadians(stateValue);
        } else {
            return stateValue;
        }
    }

    double sine(double stateValue){
        return Math.sin(stateValue);
    }

    double inverseSine(double stateValue){
        return Math.asin(stateValue);
    }

    double cosine(double stateValue){
        return Math.cos(stateValue);

    }

    double tangent(double stateValue){
        return Math.tan(stateValue);
    }

    double inverseCosine(double stateValue){
        return Math.acos(stateValue);
    }

    double inverseTangent(double stateValue){
        return Math.atan(stateValue);
    }
}
