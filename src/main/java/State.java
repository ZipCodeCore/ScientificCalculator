/**
 * Created by danzygmund-felt on 4/28/17.
 */
public class State {
    private double value;
    private boolean hasError;

    State() {
        this(0);
    }

    State(double value) {
        this.value = value;
        this.hasError = false;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setError(boolean hasError) {
        this.hasError = hasError;
    }

    public boolean isError() {

        return this.hasError;
    }


}
