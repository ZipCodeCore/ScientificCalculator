package weisser.sarah;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/1/17.
 */
public class TestOperationSwitcher {


    @Test
    public void testOperationSwitcherFields() {
        //given
        CalculationValues values = new CalculationValues(5, 8, "+");
        String expectedResult = "+";

        //when
        String actualResult = values.getOperation();

        //then
        Assert.assertEquals(expectedResult, actualResult);
    }
}
