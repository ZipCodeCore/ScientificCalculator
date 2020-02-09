package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidOperationsTest {
    @Test
    public void TestValidOperationsAdd()
    {
        Boolean expected = true;
        ValidOperations TestValidOperations = new ValidOperations();
        Boolean actual = TestValidOperations.isValid("+");

        assertEquals(expected, actual);
    }

    @Test
    public void TestValidOperationsSub()
    {
        Boolean expected = true;
        ValidOperations TestValidOperations = new ValidOperations();
        Boolean actual = TestValidOperations.isValid("-");

        assertEquals(expected, actual);
    }

    @Test
    public void TestValidOperationsWrongAdd()
    {
        Boolean expected = false;
        ValidOperations TestValidOperations = new ValidOperations();
        Boolean actual = TestValidOperations.isValid("add");

        assertEquals(expected, actual);
    }

    @Test
    public void TestValidOperationsFoo()
    {
        Boolean expected = false;
        ValidOperations TestValidOperations = new ValidOperations();
        Boolean actual = TestValidOperations.isValid("foo");

        assertEquals(expected, actual);
    }

    @Test
    public void TestClear()
    {
        Boolean expected = true;
        ValidOperations TestValidOperations = new ValidOperations();
        Boolean actual = TestValidOperations.isValid("c");
    }
}