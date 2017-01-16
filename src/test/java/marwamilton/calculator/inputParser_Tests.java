package marwamilton.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mkulima on 1/16/17.
 */
public class inputParser_Tests {

    InputParser inputParser;

    @Before
    public void setup(){
        inputParser = new InputParser();
    }

    @Test
    public void splitInput_Test(){
        String[] expectedSplitString = new String[]{"7","10"};
        String[] actualSplitString = inputParser.splitInput("7+10");
        Assert.assertArrayEquals("Arrays not equal",expectedSplitString,actualSplitString);
    }

    @Test
    public void determineOperation_Test(){
        String expectedOperation = "+";
        String actualOperation = inputParser.determineOperationType("7+10");
        Assert.assertEquals("Strings not equal",expectedOperation,actualOperation);
    }

    @Test
    public void exitFlag_Test(){
        boolean expectedFlag = false;
        boolean actualFlag = inputParser.exitFlagCheck("7+10");
        Assert.assertEquals("boolean mismatch", expectedFlag, actualFlag);
    }

    @Test
    public void clearScreenCheck_Test(){
        boolean expectedClearScreenCheck = false;
        boolean actualClearScreenCheck = inputParser.clearScreenCheck("7+10");
        Assert.assertEquals("boolean mismatch", expectedClearScreenCheck, actualClearScreenCheck);
    }

}
