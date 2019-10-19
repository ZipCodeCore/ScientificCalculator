package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Statistics1VarTest {

    private Double[][] dataArr;
    private Double[][] results;
    private Statistics1Var stats;

    @Before
    public void setUp() throws Exception {

        dataArr = new Double [][]{
                {1.0, 2.2, 3.2, 4.5},
                {0.0, 0.0, 0.0},
                {-23.0, 344.5, 12.0, 12.0, 12.0},
                {1.0, 2.0, 3.0, 4.0, 5.0}
        };
        results = new Double[][] { //n, mean, median, min, max, stDev, var
                {4.0, 2.725, 2.7, 1.0, 4.5, 1.48632657, 2.20916667},
                {3.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                {5.0, 71.5, 12.0, -23.0, 344.5, 153.362316, 23520.0},
                {5.0, 3.0, 3.0, 1.0, 5.0, 1.58113883, 2.5}
        };

    }

    @Test
    public void meanTest() {
        Statistics1Var stats;
        Double expected;
        Double actual;
        for (int i = 0; i < dataArr.length; i++) {
            stats = new Statistics1Var();
            stats.setData(dataArr[i]);
            expected = results[i][1];
            actual = stats.calcMean();
            Assert.assertEquals(0, Double.compare(actual, expected));
        }
    }

    @Test
    public void medianTest() {
        Statistics1Var stats;
        Double expected;
        Double actual;
        for (int i = 0; i < dataArr.length; i++) {
            stats = new Statistics1Var();
            stats.setData(dataArr[i]);
            expected = results[i][2];
            actual = stats.calcMedian();
            Assert.assertEquals(0, Double.compare(actual, expected));
        }
    }

    @Test
    public void minTest() {
        Statistics1Var stats;
        Double expected;
        Double actual;
        for (int i = 0; i < dataArr.length; i++) {
            stats = new Statistics1Var();
            stats.setData(dataArr[i]);
            expected = results[i][3];
            actual = stats.calcMin();
            Assert.assertEquals(0, Double.compare(actual, expected));
        }
    }

    @Test
    public void maxTest() {
        Statistics1Var stats;
        Double expected;
        Double actual;
        for (int i = 0; i < dataArr.length; i++) {
            stats = new Statistics1Var();
            stats.setData(dataArr[i]);
            expected = results[i][4];
            actual = stats.calcMax();
            Assert.assertEquals(0, Double.compare(actual, expected));
        }
    }
}