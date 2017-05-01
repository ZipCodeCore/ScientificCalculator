package io.github.aaronclong.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aaronlong on 4/29/17.
 */
public class StringParserTest {

    @Test
    public void testGetValue() {
        StringParser parserAddition = StringParser.makeStringParser("1 + 2");
        StringParser parserSubtraction = StringParser.makeStringParser("6 - 4");
        StringParser parserMultiplication = StringParser.makeStringParser("8  * 4");
        StringParser parserDivision = StringParser.makeStringParser("27/3");
        Assert.assertEquals("Confirming string conversion for addition", 3.0, parserAddition.getValue(), .003);
        Assert.assertEquals("Confirming string conversion for subtraction", 2.0, parserSubtraction.getValue(), .003);
        Assert.assertEquals("Confirming string conversion for multiplication", 32.0, parserMultiplication.getValue(), .003);
        Assert.assertEquals("Confirming string conversion for subtraction", 9.0, parserDivision.getValue(), .003);
    }

    @Test
    public void testTrigFunctionExpression() {
        StringParser parserAddition = StringParser.makeStringParser("sin(7)");
        double testValue = Math.sin(7);
        Assert.assertEquals("Confirming trig sn function run", testValue, parserAddition.getValue(), .003);
    }
}
