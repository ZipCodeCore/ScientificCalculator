package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/11/16.
 */
public class State {

    public enum StateMode {BINARY, OCTAL, DECIMAL, HEXADECIMAL}

    private double stateValue;
    private StateMode stateMode;

    State(){
        this.stateValue = 0.0;
        this.stateMode = StateMode.DECIMAL;
    }

    public double getStateValue(){
        return this.stateValue;
    }

    public void setStateValue(double stateValue){
        this.stateValue = stateValue;
    }

    public void clearDisplayValue(){
        this.stateValue = 0;
    }

    public void switchDisplayMode(StateMode stateMode){
        this.stateMode = stateMode;
    }

    public String error(String msg){
        return msg;
    }

}
