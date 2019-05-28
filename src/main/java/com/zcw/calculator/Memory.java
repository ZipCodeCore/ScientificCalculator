package com.zcw.calculator;

public class Memory {
    String memory = "0";
    public void store(String m) {
        memory = m;
    }
    public void resetMemory() {
        memory = "0";

    }
    public String recallCurrentValue() {
        return memory;
    }
}
