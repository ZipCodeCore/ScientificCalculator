package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @Test
    public void testcalcDiv() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 100;
        int b = 10;
        int expected = a / b;
        //when
        int outcome = mainApplication.calcDiv(a, b);
        //then
        assertEquals(expected, outcome);
    }

    @Test
    public void testcalcDiv1() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 9;
        int b = 3;
        int expected = a / b;
        //when
        int outcome = mainApplication.calcDiv(a, b);
        //then
        assertEquals(expected, outcome);
    }

    @Test
    public void testcalcDiv2() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 15;
        int b = 5;
        int expected = a / b;
        //when
        int outcome = mainApplication.calcDiv(a, b);
        //then
        assertEquals(expected, outcome);
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
        assertEquals(expected, outcome);
    }
    @Test
    public void testcalcSqrt1() {
        //given
        MainApplication mainApplication = new MainApplication();
        double a = 25;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = mainApplication.calcSqrt(a);
        //then
        assertEquals(expected, outcome);
    }

    @Test
    public void testcalcSqrt2() {
        //given
        MainApplication mainApplication = new MainApplication();
        double a = 64;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = mainApplication.calcSqrt(a);
        //then
        assertEquals(expected, outcome);
    }

    @Test
    public void testcalcInverse() {
        //given
        MainApplication mainApplication = new MainApplication();
        double a = 20;
        Double expected = 1 / a;
        //when
        Double outcome = mainApplication.calcInverse(a);
        //then
        assertEquals(expected, outcome);
    }

    @Test
    public void testcalcInverse1() {
        //given
        MainApplication mainApplication = new MainApplication();
        double a = 5;
        Double expected = 1 / a;
        //when
        Double outcome = mainApplication.calcInverse(a);
        //then
        assertEquals(expected, outcome);
    }

    @Test
    public void testcalcInverse2() {
        //given
        MainApplication mainApplication = new MainApplication();
        double a = 10;
        Double expected = 1 / a;
        //when
        Double outcome = mainApplication.calcInverse(a);
        //then
        assertEquals(expected, outcome);
    }
}
