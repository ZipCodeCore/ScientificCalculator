/**
 * Created by mattwu on 4/30/17.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ComputationTest {

    Computation calc;

    @Before
    public void setUp(){ calc = new Computation(); }


    @Test
    public void testSimpleAddition(){
        //: Given
        double input1 = 2, input2 = 2; // ... two positive values to add
        double expectedSum = input1 + input2; // 2 + 2 = 4

        //: When
        double actualSum = calc.add(input1, input2); // ... I add 2 and 2

        //: Then
        // ... The result should be the sum of those two values
        Assert.assertEquals(expectedSum, actualSum, 0);
    }


    @Test
    public void testNegativeAddition(){

        double input1 = -15, input2 = 42; // ... two values to add, one that is negative
        double expectedSum = input1 + input2;

        double actualSum = calc.add(input1, input2); // ... add a negative number to a positive number

        Assert.assertEquals(expectedSum, actualSum, 0);
    }


    @Test
    public void testSimpleSubtraction(){

        double input1 = 8, input2 = 2; // ... two positive values to subtract
        double expectedDifference = input1 - input2; // 8 - 2 = 6

        double actualDifference = calc.subtract(input1, input2); // ... subtract 2 from 8

        Assert.assertEquals(expectedDifference, actualDifference, 0);
    }


    @Test
    public void testUnderflowSubtraction(){

        double input1 = 15, input2 = 42; // ... a large number to subtract from a smaller number
        double expectedDifference = input1 - input2; //

        double actualDifference = calc.subtract(input1, input2); // ... I subtract a larger number from a smaller one

        Assert.assertEquals("the difference of two numbers are able to be negative results", expectedDifference, actualDifference, 0);
    }


    @Test
    public void testNegativeSubtraction(){

        double input1 = 15, input2 = -42; // ... a negative number to subtract from another number
        double expectedDifference = input1 - input2; //

        double actualDifference = calc.subtract(input1, input2); // ... I subtract a negative number from a smaller one

        // ... The result should be the difference, which is larger than either of the original numbers
        Assert.assertEquals("should able to subtract negative values", expectedDifference, actualDifference, 0);
    }


    @Test
    public void testMultiplication(){

        double input1 = 8, input2 = 11; // ... two values to multiply
        double expectedSum = input1 * input2; // 8 * 11 = 88

        double actualSum = calc.multiply(input1, input2); // ... I add 2 and 2

        // ... The result should be the sum of those two values
        Assert.assertEquals("Multiply Many Multitudinous", expectedSum, actualSum, 0);
    }


    @Test
    public void testEvenDivision(){

        double input1 = 143, input2 = 13; // ... two evenly divisible numbers
        double expectedSum = input1 / input2; // 143 / 13=11

        double actualSum = calc.divide(input1, input2); // ... I divide the numerator by the divisor

        // ... The result should be the exact (whole number) ratio of the two numbers
        Assert.assertEquals("divide evenly divisible digits", expectedSum, actualSum, 0);
    }


    @Test
    public void testUnevenDivision(){

        double input1 = 17, input2 = 6; // ... two values that are not evenly divisible
        double expectedSum = input1 / input2; // 17 / 6 = 2 (remainder is truncated)

        double actualSum = calc.divide(input1, input2); // ... I divide the numerator by the divisor

        // ... The result should be the truncated ratio of the two numbers
        Assert.assertEquals("Truncated division removes remainder readouts.", expectedSum, actualSum, 0);
    }


    @Test
    public void testEqualityOnDifferentValues(){

        double input1 = 2, input2 = 6; // ... two different values to compare
        boolean expectedResult = input1 != input2; // 2 is not equal to 6

        boolean actualResult = calc.isEqual(input1, input2); // ... I compare 2 and 6

        // ... The result should false because the values are different
        Assert.assertEquals("Two different values should not be considered equal.", expectedResult, actualResult);
    }


    @Test
    public void testEqualityOnIdenticalValues(){
        //: Given
        double input1 = 487; // ... one value to compare to itself
        boolean expectedResult = input1 == input1; // Equality is the identity function

        boolean actualResult = calc.isEqual(input1, input1); // ... I compare 487 to itself

        // ... The result should be true because the values are the same.
        Assert.assertEquals("Two different values should not be considered equal.", expectedResult, actualResult);
    }

}


