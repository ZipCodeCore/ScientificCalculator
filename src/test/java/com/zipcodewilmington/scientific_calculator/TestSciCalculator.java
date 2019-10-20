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
        String expected = "0.15425144988758405";
        String actual = cosine(30);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcosine2() {
        String expected = "0.5253219888177297";
        String actual = cosine(45);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcosine3() {
        String expected = "-0.9524129804151563";
        String actual = cosine(60);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testtangent1() {
        String expected = "-6.405331196646276";
        String actual = tangent(30);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testtangent2() {
        String expected = "1.6197751905438615";
        String actual = tangent(45);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testtangent3() {
        String expected = "0.320040389379563";
        String actual = tangent(60);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcsc1() {
        String expected = "0.0";
        String actual = csc(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcsc2() {
        String expected = "0.5235987755982989";
        String actual = csc(0.5);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcsc3() {
        String expected = "NaN";
        String actual = csc(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testsec1() {
        String expected = "0.0";
        String actual = sec(1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testsec2() {
        String expected = "1.5707963267948966";
        String actual = sec(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testsec3() {
        String expected = "3.141592653589793";
        String actual = sec(-1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcotan1() {
        String expected = "1.5374753309166493";
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
        String expected = "1.554131203080956";
        String actual = cotan(60);
        Assert.assertEquals(expected, actual);
    }
}
