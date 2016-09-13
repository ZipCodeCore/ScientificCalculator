package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/11/16.
 */
public class State {

    enum StateMode {BINARY, OCTAL, DECIMAL, HEXADECIMAL}

    enum TrigUnit {DEGREES, RADIANS}

    private double stateValue;
    private StateMode stateMode;
    private TrigUnit trigUnit = TrigUnit.RADIANS;

    State(){
        this.stateValue = 0.0d;
        this.stateMode = StateMode.DECIMAL;
    }

    double getStateValue(){
        return this.stateValue;
    }

    StateMode getStateMode(){
        return this.stateMode;
    }

    TrigUnit getTrigUnit(){
        return this.trigUnit;
    }

    void setStateValue(double stateValue){
        this.stateValue = stateValue;
    }

    void switchDisplayMode(StateMode stateMode){
        this.stateMode = stateMode;
    }

    void switchUnitsMode(){
        if(this.trigUnit == TrigUnit.RADIANS){
            this.trigUnit = TrigUnit.DEGREES;
        } else {
            this.trigUnit = TrigUnit.RADIANS;
        }
    }

    void switchUnitsMode(TrigUnit trigUnit){
        this.trigUnit = trigUnit;
    }

    String outputStateValue(double stateValue){
        StateMode stateMode = getStateMode();
        switch(stateMode){
            case BINARY:
                return Integer.toBinaryString((int)stateValue);
            case OCTAL:
                return Integer.toOctalString((int)stateValue);
            case HEXADECIMAL:
                return Integer.toHexString((int)stateValue);
            case DECIMAL:
                return Double.toString(stateValue);
            default:
                return "Invalid selection";
        }
    }

    void clearDisplayValue(){
        this.stateValue = 0;
    }

    String error(String msg){
        return msg;
    }

}