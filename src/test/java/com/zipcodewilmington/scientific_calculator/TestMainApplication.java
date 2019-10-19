package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void testcalcDiv() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 8;
        int b = 4;
        Integer expected = a / b;
        //when
        Integer outcome = mainApplication.calcDiv(a, b);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testcalcDiv2() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 9;
        int b = 3;
        Integer expected = a / b;
        //when
        Integer outcome = mainApplication.calcDiv(a, b);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testcalcDiv3() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 100;
        int b = 10;
        Integer expected = a / b;
        //when
        Integer outcome = mainApplication.calcDiv(a, b);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testcalcSqrt() {
        //given
        MainApplication mainApplication = new MainApplication();
        double a = 100;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = mainApplication.calcSqrt(a);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testcalcSqrt1() {
        //given
        MainApplication mainApplication = new MainApplication();
        double a = 64;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = mainApplication.calcSqrt(a);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testcalcSqrt2() {
        //given
        MainApplication mainApplication = new MainApplication();
        double a = 100;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = mainApplication.calcSqrt(a);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    @Test
    public void testclacInverse() {
        //given
        MainApplication mainApplication = new MainApplication();
        double a = 10;
        Double expected = 1 / a;
        //when
        Double outcome = mainApplication.calcInverse(1 / a);
        //then
        Assert.assertEquals(expected, outcome);
}
