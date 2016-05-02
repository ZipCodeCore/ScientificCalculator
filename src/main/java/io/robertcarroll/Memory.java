package io.robertcarroll;

public class Memory {
    private double storedValue;

    public double getStoredValue() {
        return storedValue;
    }

    public void setStoredValue(double storedValue) {
        this.storedValue = storedValue;
    }

    public void clearMemory() {
        storedValue = 0;
    }
}
