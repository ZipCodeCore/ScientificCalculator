package com.zcw.calculator;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionEvaluatorTest {
    @Test
    public void evaluateArithematicExpressionTest() {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        Assert.assertEquals("10",ee.evaluate("1 + 2 + 3 + 4"));
        Assert.assertEquals("6",ee.evaluate("1 * 2 * 3"));
        Assert.assertEquals("7",ee.evaluate("1 + 2 * 3"));
        Assert.assertEquals("2",ee.evaluate("1 + 3 * 2 / 5"));
        Assert.assertEquals("6",ee.evaluate("5 / 1 + 2 * 3 % 2 + 1"));
        Assert.assertEquals("15",ee.evaluate("( 5 + 1 ) / 2 * 4 + 3"));
    }

}
