package weisser.sarah;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 4/29/17.
 */
public class TestGetInput {

    @Test
    public void testGetFirstValue() {

        //given
        String userInput = "1 5 +";
        Input input = new Input();
        double expectedResult = 1;

        //when
        double actualResult = input.getFirstValue(userInput);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void testGetSecondValue() {

        //given
        String userInput = "1 5 +";
        Input input = new Input();
        double expectedResult = 5;

        //when
        double actualResult = input.getSecondValue(userInput);

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testGetOperation() {

        //given
        String userInput = "1 5 +";
        Input input = new Input();
        String expectedResult = "+";

        //when
        String actualResult = input.getOperation(userInput);

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }


}
