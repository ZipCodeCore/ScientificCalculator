import org.junit.Test;
import org.junit.Assert;


/**
 * Created by luisgarcia on 4/29/17.
 */
public class CalculatorTester
{
    Calculator calc = new Calculator();

    @Test
    public void testAddition()
    {
        // Given
        int val1 = 2;
        int val2 = 2;
        int expectSum = val1 + val2;


        //When
        double answer = calc.add(val1,val2);

        //then
        Assert.assertEquals(expectSum, answer, 0);

    }

    @Test
    public void testSubraction()
    {
        //given
        double val1 = 2;
        double val2 = 1;
        double expectDiff = val1 - val2;

        //when
        double answer = calc.subtract(val1, val2);

        //then
        Assert.assertEquals(expectDiff, answer, 0);
    }

    @Test
    public void testMultiplication()
    {
        //given
        double val1 = 3;
        double val2 = 4;
        double expected = val1 * val2;

        //when
        double answer = calc.multiply(val1, val2);

        //then
        Assert.assertEquals(expected, answer, 0);
    }

    @Test
    public void testDivision()
    {
        //given
        double val1 = 2;
        double val2 = 4;
        double expected = val1 / val2;

        //when
        double answer = calc.divide(val1, val2);

        //then
        Assert.assertEquals(expected, answer, 0);
    }

    @Test
    public void testDivision_Zero()
    {
        //given
        double val1 = 3;
        double val2 = 0;
        double expected = Double.NaN;

        //when
        double answer = calc.divide(val1, val2);

        //then
        Assert.assertEquals(expected, answer, 0);
    }

    @Test
    public void testSquare()
    {
        //given
        double val1 = 3;
        double expected = val1 * val1;

        //when
        double actual = calc.square(val1);

        //then
        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testSquareRoot()
    {
        //given
        double val1 = 9;
        double expected = 3;

        //when
        double actual = calc.squareRoot(val1);

        //then
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testVariableExp()
    {
        //given
        double val1 = 3;
        double val2 = 8;
        double expected = Math.pow(val1, val2);

        //when
        double acutal = calc.variableExp(val1, val2);

        //then
        Assert.assertEquals(expected, acutal, 0);
    }

    @Test
    public void testInverse()
    {
        //given
        double val1 = 8;
        double expected = 1 / val1;

        //when
        double actual = calc.inverse(val1);

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testInvert()
    {
        //given
        double val1 = 8;
        double expected = val1 * -1;

        //when
        double actual = calc.invert(val1);

        //then
        Assert.assertEquals(expected, actual, 0);
    }

}
