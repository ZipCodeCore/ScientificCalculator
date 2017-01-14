package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/14/17.
 */
public class CalculatorParserTest {

    CalculatorParser calculatorParser;

    @Before
    public void setup() {
        calculatorParser = new CalculatorParser();
    }

    @Test
    public void testParseUserInputABC() {
        String[] expected = {"a", "b", "c"};
        String[] actual = calculatorParser.parseUserInput("a b c");
        Assert.assertArrayEquals("I expect actual to be a 3 element array containg a, b, c",
                expected, actual);
    }

    @Test
    public void testParseUserInputNothing() {
        String[] expected = {""};
        String[] actual = calculatorParser.parseUserInput("");
        Assert.assertArrayEquals("I expect actual to be an empty array",
                expected, actual);
    }
}
