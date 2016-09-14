package leczner.jon.Calculator;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class Memory {
    private String memoryValue;
    private String state;

    public Memory() {
        memoryValue = "";
    }

    public void setCurrentState(String state) {
        this.state = state;
    }

    public String recall() {
        return memoryValue;
    }

    public void reset() {
        memoryValue = null;
    }

    public void store() {
        memoryValue = state;
    }
}
