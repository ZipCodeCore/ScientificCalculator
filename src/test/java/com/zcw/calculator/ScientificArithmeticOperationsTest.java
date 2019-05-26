package com.zcw.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScientificArithmeticOperationsTest {

    @Test
    public void square() {
        ScientificArithmeticOperations sao = new ScientificArithmeticOperations();
        Assert.assertEquals("4",sao.square(2));
    }

    @Test
    public void squareRoot() {
    ScientificArithmeticOperations sao1 = new ScientificArithmeticOperations();
    Assert.assertEquals("2",sao1.squareRoot(4));
    }

    @Test
    public void inverse() {
        ScientificArithmeticOperations sao = new ScientificArithmeticOperations();
        Assert.assertEquals("0.5",sao.inverse(2));
    }

    @Test
    public void switchSign() {
        ScientificArithmeticOperations sao = new ScientificArithmeticOperations();
        Assert.assertEquals("-1",sao.switchSign(-1));
    }

    @Test
    public void sine() {
        ScientificArithmeticOperations s = new ScientificArithmeticOperations();
        Assert.assertEquals("0",s.sine(0));
    }

    @Test
    public void cosine() {
        ScientificArithmeticOperations c = new ScientificArithmeticOperations();
        Assert.assertEquals("1", c.cosine(1));
    }

    @Test
    public void tangent() {
        ScientificArithmeticOperations t = new ScientificArithmeticOperations();
        Assert.assertEquals("0", t.tangent(0));
    }

    @Test
    public void inverseSine() {
        ScientificArithmeticOperations ins = new ScientificArithmeticOperations();
        Assert.assertEquals("90", ins.inverseSine(1));

    }

    @Test
    public void inverseCosine() {
        ScientificArithmeticOperations inc = new ScientificArithmeticOperations();
        Assert.assertEquals("0", inc.inverseCosine(1));
    }

    @Test
    public void inverseTangent() {
        ScientificArithmeticOperations inst = new ScientificArithmeticOperations();
        Assert.assertEquals("45", inst.inverseTangent(1));
    }


    @Test
    public void factorial() {
        ScientificArithmeticOperations fact = new ScientificArithmeticOperations();
        Assert.assertEquals("5", fact.factorial(120));
    }

    @Test
    public void log() {
        ScientificArithmeticOperations t = new ScientificArithmeticOperations();
        Assert.assertEquals("1", t.log(10));
    }

    @Test
    public void inverseLog() {
        ScientificArithmeticOperations t = new ScientificArithmeticOperations();
        Assert.assertEquals("10", t.inverseLog(1));
    }

    @Test
    public void naturalLog() {
        ScientificArithmeticOperations t = new ScientificArithmeticOperations();
        Assert.assertEquals("1", t.naturalLog(Math.E));
    }

    @Test
    public void inverseNaturalLogarith() {
        ScientificArithmeticOperations t = new ScientificArithmeticOperations();
        Assert.assertEquals(Double.toString(Math.E), t.tangent(1));


    }
}