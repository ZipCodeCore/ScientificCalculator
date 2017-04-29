package io.github.aaronclong.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aaronlong on 4/29/17.
 */
public class StringParserTest {

    @Test
    public void testGetValue() {
        StringParser parser = StringParser.makeStringParser("1 + 2");
        Assert.assertEquals("Confirming string conversion", 3.0, parser.getValue(), .003);
    }
}
