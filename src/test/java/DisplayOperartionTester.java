import org.junit.Assert;
import org.junit.Test;

/**
 * Created by luisgarcia on 4/29/17.
 */
public class DisplayOperartionTester
{
    DisplayOperation test = new DisplayOperation();

    @Test
    public void testDisplay()
    {
        //given
        String expected = "0.0";

        //when
        String actual = test.display();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdd()
    {
        //given
        double expected = 1.0;

        //when
        double actual = test.add(1.0);

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testSubtract()
    {
        //given
        double expected = -1.0;

        //when
        double actual = test.subtract(1.0);

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testMultiply()
    {
        //given
        double expected = 0.0;

        //when
        double actual = test.multiply(1.0);

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testDivide()
    {
        //given
        test.setDisplay(12);
        double expected = 4;

        //when
        double actual = test.divide(3.0);

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testSquare()
    {
        //given
        test.setDisplay(3);
        double expected = 9;

        //when
        double actual = test.square();

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testSquareRoot()
    {
        //given
        test.setDisplay(9);
        double expected = 3;

        //when
        double actual = test.squareRoot();

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testVarExp()
    {
        //given
        test.setDisplay(2);
        double expected = 32;

        //when
        double actual = test.variableExp(5);

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testInverse()
    {
        //given
        test.setDisplay(4);
        double expected = .25;

        //when
        double actual = test.inverse();

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testInvert()
    {
        //given
        test.setDisplay(3);
        double expected = -3.0;

        //when
        double actual = test.invert();

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public  void testModeNumDisplay()
    {
        //given
        test.setDisplay(2);
        test.setMode("binary");
        String expected = "10";

        //when
        String actual = test.displayModeNum();

        //then
        Assert.assertEquals(expected, actual);
    }



//    @Test
//    public void testOperation()
//    {
//        //given
//        double expected = 3;
//
//        //when
//        double actual = test.operation("ADD",3.0);
//
//        //then
//        Assert.assertEquals(expected, actual, 0);
//    }





}
