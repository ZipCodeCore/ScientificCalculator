package Calculator;

import org.junit.Test;
import org.junit.Assert;


/**
 * Created by randallcrame on 1/14/17.
 */
public class ExpressionsTests {


    @Test
    public void AddTest() {
        Add test = new Add();
        Input.setLeftValue(2);
        Input.setRightValue(1);
        test.calculate();
        Double expected = 3.0;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void SubtractTest() {
        Subtract test = new Subtract();
        Input.setLeftValue(2);
        Input.setRightValue(1);
        test.calculate();
        Double expected = 1.0;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void MultipleTest() {
        Multiple test = new Multiple();
        Input.setLeftValue(2);
        Input.setRightValue(1);
        test.calculate();
        Double expected = 2.0;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void DivideTest() {
        Divide test = new Divide();
        Input.setLeftValue(2);
        Input.setRightValue(1);
        test.calculate();
        Double expected = 3.0;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void Divide0Test() {
        Divide test = new Divide();
        Input.setLeftValue(2);
        Input.setRightValue(0);
        test.calculate();
        Double expected = 0.0;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void Inverse0Test() {
        Inverse test = new Inverse();
        Input.setLeftValue(2);
        test.calculate();
        Double expected = 0.0;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void InverseTest() {
        Inverse test = new Inverse();
        Input.setLeftValue(2);
        test.calculate();
        Double expected = 0.5;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void SquareRootTest() {
        SquareRoot test = new SquareRoot();
        Input.setLeftValue(9);
        test.calculate();
        Double expected = 3.0;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void SquareRoot0Test() {
        SquareRoot test = new SquareRoot();
        Input.setLeftValue(0);
        test.calculate();
        Double expected = 0.0;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void SquareTest() {
        Square test = new Square();
        Input.setLeftValue(2);
        test.calculate();
        Double expected = 4.0;
        Double actual = Input.getSingleMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }

}