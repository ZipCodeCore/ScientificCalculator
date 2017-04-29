/**
 * Created by danzygmund-felt on 4/28/17.
 */
import org.junit.*;

public class CalculatorTest {

    @Test
    public void addTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 81.0;
        //When
        double actual = calc.add(6.0,75.0);
        //Then
        Assert.assertEquals("6 + 75 = 81", expected, actual,0);
    }

    @Test
    public void subtractTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 18.0;
        //When
        double actual = calc.subtract(24.0,6.0);
        //Then
        Assert.assertEquals("24 - 6 = 18", expected, actual, 0);
    }

    @Test
    public void multiplyTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 15.5;
        //When
        double actual = calc.multiply(5.0,3.1);
        //Then
        Assert.assertEquals("5 x 3.1 = 15.5", expected, actual, 0);
    }

    @Test
    public void divideTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 27.0;
        //When
        double actual = calc.divide(81.0, 3.0);
        //Then
        Assert.assertEquals("81 / 3 = 27", expected, actual, 0);
    }

    @Test
    public void divideByZeroTest() {
        //Given
        Calculator calc = new Calculator();
        //When
        double result = calc.divide(81.0, 0.0);
        //Then
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void squareTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 2.25;
        //When
        double actual = calc.square(1.5);
        //Then
        Assert.assertEquals("1.5 ^ 2 = 2.25", expected, actual, 0);
    }

    @Test
    public void squareRootTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 0.7;
        //When
        double actual = calc.squareRoot(0.49);
        //Then
        Assert.assertEquals("sqrt(0.49) = 0.7", expected, actual, 0);
    }

    @Test
    public void squareRootLessThanZeroTest() {
        //Given
        Calculator calc = new Calculator();
        //When
        double result = calc.squareRoot(-5.0);
        //Then
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void exponentTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 81.0;
        //When
        double actual = calc.exponent(3.0,4.0);
        //Then
        Assert.assertEquals("3 ^ 4 = 81", expected, actual, 0);
    }

    @Test
    public void inverseTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 0.2;
        //When
        double actual = calc.inverse(5.0);
        //Then
        Assert.assertEquals("1 / 5 = 0.2", expected, actual, 0);
    }

    @Test
    public void inverseZeroTest() {
        //Given
        Calculator calc = new Calculator();
        //When
        double result = calc.inverse(0.0);
        //Then
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void oppositeTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 40.5;
        //When
        double actual = calc.opposite(-40.5);
        //Then
        Assert.assertEquals("-(-40.5) = 40.5", expected, actual, 0);
    }

}
