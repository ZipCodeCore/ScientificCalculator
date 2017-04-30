package weisser.sarah;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 4/30/17.
 */


public class TestCalculationValues {

    @Test
    public void testCalculationValues() {
        //given
        CalculationValues values = new CalculationValues(5, 8, "+");
        double expectedValue1 = 5;
        double expectedValue2 = 8;
        String expectedOperation = "+";

        //when
        double actualValue1 = values.getValue1();
        double actualValue2 = values.getValue2();
        String actualOperation = values.getOperation();

        //then
        Assert.assertEquals(expectedValue1, actualValue1, 0);
        Assert.assertEquals(expectedValue2, actualValue2, 0);
        Assert.assertEquals(expectedOperation, actualOperation);
    }
}
