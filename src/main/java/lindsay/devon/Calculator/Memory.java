package lindsay.devon.Calculator;

import javax.swing.*;

/**
 * Created by devonlindsay on 9/12/16.
 */
public class Memory {

    double storedValue;


    public double storeValue(double currentValue) {
        storedValue = currentValue;
        return storedValue;
    }

    public double resetStoredValue() {
        storedValue = 0;
        return storedValue;
    }

    public double getStoredValue() {
        return storedValue;
    }


}
