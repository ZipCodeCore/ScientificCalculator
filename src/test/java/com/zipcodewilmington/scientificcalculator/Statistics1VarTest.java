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
                {4.0, 2.725, 2.7, 1.0, 4.5, 1.4863265679744362, 2.209166666666666},
                {3.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                {5.0, 71.5, 12.0, -23.0, 344.5, 153.3623161014465, 23520.0},
                {5.0, 3.0, 3.0, 1.0, 5.0, 1.5811388300841898, 2.5000000000000004}
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

    @Test
    public void stdDevTest() {
        Statistics1Var stats;
        Double expected;
        Double actual;
        for (int i = 0; i < dataArr.length; i++) {
            stats = new Statistics1Var();
            stats.setData(dataArr[i]);
            expected = results[i][5];
            actual = stats.calcStdDev();
            Assert.assertEquals(0, Double.compare(actual, expected));
        }
    }

    @Test
    public void varTest() {
        Statistics1Var stats;
        Double expected;
        Double actual;
        for (int i = 0; i < dataArr.length; i++) {
            stats = new Statistics1Var();
            stats.setData(dataArr[i]);
            expected = results[i][6];
            actual = stats.calcVar();
            Assert.assertEquals(0, Double.compare(actual, expected));
        }
    }

    @Test
    public void calculateStatisticsTest() {
        Statistics1Var stats;
        String expected;
        String actual;
        for (int i = 0; i < dataArr.length; i++) {
            stats = new Statistics1Var();
            stats.setData(dataArr[i]);
            stats.calculateStatistics();

            expected = "\n1-Variable Statistics:\n" +
                    "n: " + Integer.toString(results[i][0].intValue()) + "\n" +
                    "Mean: " + Double.toString(results[i][1]) +"\n" +
                    "Median: " + Double.toString(results[i][2]) +"\n" +
                    "Min: " + Double.toString(results[i][3]) +"\n" +
                    "Max: " + Double.toString(results[i][4]) +"\n" +
                    "Sample Std Dev: " + Double.toString(results[i][5]) +"\n" +
                    "Sample Var: " + Double.toString(results[i][6]) +
                    "\n\nReturning to normal mode";
            actual = stats.getOutput();
            Assert.assertEquals(actual, expected);
        }
    }
}