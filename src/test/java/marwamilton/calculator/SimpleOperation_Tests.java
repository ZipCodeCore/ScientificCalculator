package marwamilton.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mkulima on 1/16/17.
 */
public class SimpleOperation_Tests {

    // initialize SimpleOperation object
    SimpleOperation simpleOperation;
    InputParser inputParser;
    String numsToUse;
    String[] parsedNumsToUse;

    @Before
    public void setupTest(){
        simpleOperation = new SimpleOperation();
        simpleOperation = new SimpleOperation();
        inputParser = new InputParser();
        String numsToUseStrinng = "7+10";
        parsedNumsToUse = inputParser.splitInput(numsToUseStrinng);

    }
    @Test
    public void checkDefaultNumsVal(){
        String[] expectedDefaultNums = null;
        String[] actualDefaultNums = simpleOperation.nums;
        System.out.println(Arrays.toString(parsedNumsToUse));
        Assert.assertEquals("Not same", expectedDefaultNums, actualDefaultNums);
    }

    @Test
    public void checkDesiredOperationVal(){
        String expectedDefaultOperationVal = null;
        String actualDefaultOperationVal = simpleOperation.desiredOperation;
        Assert.assertEquals("Not same", expectedDefaultOperationVal, actualDefaultOperationVal);
    }

    @Test
    public void addThem_Test(){
        simpleOperation.nums = parsedNumsToUse;
        simpleOperation.desiredOperation = "+";
        double expectedSum = 17;
        double actualSum = simpleOperation.runUserOperation();
        Assert.assertThat("they aint equal",expectedSum, is(actualSum));

    }

    @Test
    public void subtract_Test(){
        simpleOperation.nums = parsedNumsToUse;
        simpleOperation.desiredOperation = "-";
        double expectedDiff = -3;
        double actualDiff = simpleOperation.runUserOperation();
        Assert.assertThat(actualDiff,is(expectedDiff));
    }

    @Test
    public void product_Test(){
        simpleOperation.nums = parsedNumsToUse;
        simpleOperation.desiredOperation = "*";
        double expectedProduct = 70;
        double actualProduct = simpleOperation.runUserOperation();
        Assert.assertThat(actualProduct,is(expectedProduct));
    }

    @Test
    public void division_test(){
        simpleOperation.nums = parsedNumsToUse;
        simpleOperation.desiredOperation = "/";
        double expectedDivisionResult = 0.7;
        double actualDivisionResult = simpleOperation.runUserOperation();
        Assert.assertThat(actualDivisionResult,is(expectedDivisionResult));
    }
}
