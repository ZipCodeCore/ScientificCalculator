package squier.john.calculatorProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/13/17.
 */
public class OperationsTest {

    Operations operations;

    @Before
    public void setup() {
        operations = new Operations();
    }

    @Test
    public void testPerformCalculationAddition() {
        double expected = 2.0;
        double actual = operations.performCalculation("+", 0.0, 2.0);
        Assert.assertEquals(expected, actual, 0.00001);
    }

}
