package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Statistics1VarTest {

    Double[][] dataArr;
    Double[][] results;

    @Before
    public void setUp() throws Exception {
        Statistics1Var stats = new Statistics1Var();
        dataArr = {
                {1.0, 2.2, 3.2, 4.5},
                {0.0, 0.0, 0.0},
                {-23.0, 344.5, 12.0, 12.0, 12.0},
                {1.0, 2.0, 3.0, 4.0, 5.0}
        };
        results = { //n, mean, median,
                {4, , },
                {3, 0.0, 0.0},
                {5, , },
                {5, 3.0, 3.0}
        }
    }

    @Test
    public void nTest() {
        Double expected;
        Double actual;
        for (int i = 0; i < dataArr.length, ) {
            expected = results[];
            actual =
        }
    }
}