/**
 * Created by danzygmund-felt on 4/28/17.
 */
import java.util.*;

public class Display {

    State state;
    Scanner scanner;
    double memory;

    Display() {
        this.state.setValue(0);
        this.memory = 0;
        this.scanner = new Scanner(System.in);
    }

    public double displayValue() {
        return this.state.getValue();
    }

    public void clearDisplay() {

    }

    public void changeDisplay(double x) {
        
    }
}
