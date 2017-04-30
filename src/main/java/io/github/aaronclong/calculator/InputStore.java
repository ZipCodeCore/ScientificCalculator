package io.github.aaronclong.calculator;

import java.util.ArrayList;

/**
 * Created by aaronlong on 4/30/17.
 */
public class InputStore {

    private ArrayList<InputBuffer> oldInputs;

    public InputStore() {
        oldInputs = new ArrayList<InputBuffer>();
    }

    public void add(InputBuffer element){
        oldInputs.add(element);
    }
    
    public ArrayList<InputBuffer> getInput() {
        return (ArrayList<InputBuffer>) oldInputs.clone();
    }
}
