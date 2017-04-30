package io.github.aaronclong.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by aaronlong on 4/30/17.
 */
public class InputStoreTest {
    @Test
    public void checkInputStoreValues() {
        InputStore store = new InputStore();
        store.add(InputBuffer.makeInputBuffer("9*9/2+1"));
        ArrayList<InputBuffer> list = store.getInput();
        Assert.assertEquals("Check list's value", 41.5, list.get(0).getValue(), .003);
    }
}
