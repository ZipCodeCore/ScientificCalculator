package io.github.aaronclong.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by aaronlong on 4/30/17.
 */
public class InputStoreTest {
    private InputStore store;

    @Before
    public void SetUp() {
        store = new InputStore();
    }

    @Test
    public void checkInputStoreValues() {
        store.add(InputBuffer.makeInputBuffer("9*9/2+1"));
        ArrayList<InputBuffer> list = store.getInput();
        Assert.assertEquals("Check list's value", 41.5, list.get(0).getValue(), .003);
    }

    @Test
    public void clearOldInputs() {
        store.add(InputBuffer.makeInputBuffer("9*9/2+1"));
        store.clear();
        ArrayList<InputBuffer> list = store.getInput();
        Assert.assertEquals("Checking if array cleared", 0, list.size());
    }
}
