package com.zipcodewilmington.scientific_calculator;

import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.scientificcalculator.SciCalculator.*;

public class TestSciCalculator
{
    @Test
    public void testSine1() {
        String expected = "-0.9880316240928618";
        String actual = sine(30);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSine2() {
        String expected = "0.8509035245341184";
        String actual = sine(45);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSine3() {
        String expected = "-0.3048106211022167";
        String actual = sine(60);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcosine1() {
        String expected = "-0.9880316240928618";
        String actual = cosine(30);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcosine2() {
        String expected = "0.8509035245341184";
        String actual = cosine(45);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcosine3() {
        String expected = "-0.3048106211022167";
        String actual = cosine(60);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testtangent1() {
        String expected = "-0.9880316240928618";
        String actual = tangent(30);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testtangent2() {
        String expected = "0.8509035245341184";
        String actual = tangent(45);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testtangent3() {
        String expected = "-0.3048106211022167";
        String actual = tangent(60);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcsc1() {
        String expected = "-0.9880316240928618";
        String actual = csc(30);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcsc2() {
        String expected = "0.8509035245341184";
        String actual = csc(45);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcsc3() {
        String expected = "-0.3048106211022167";
        String actual = csc(60);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testsec1() {
        String expected = "-0.9880316240928618";
        String actual = sec(30);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testsec2() {
        String expected = "0.8509035245341184";
        String actual = sec(45);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testsec3() {
        String expected = "-0.3048106211022167";
        String actual = sec(60);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcotan1() {
        String expected = "1.5485777614681775";
        String actual = cotan(30);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcotan2() {
        String expected = "1.5485777614681775";
        String actual = cotan(45);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcotan3() {
        String expected = "-1.5485777614681775";
        String actual = cotan(60);
        Assert.assertEquals(expected, actual);
    }
}
