package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/11/16.
 */
public class State {

    public enum StateMode {BINARY, OCTAL, DECIMAL, HEXADECIMAL}

    private double stateValue;
    private StateMode stateMode;

    State(){
        this.stateValue = 0.0d;
        this.stateMode = StateMode.DECIMAL;
    }

    public double getStateValue(){
        return this.stateValue;
    }

    public StateMode getStateMode(){
        return this.stateMode;
    }

    public void setStateValue(double stateValue){
        this.stateValue = stateValue;
    }

    public String outputStateValue(double stateValue){
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