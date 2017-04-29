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
        //When
        //Then
    }

    @Test
    public void squareRootTest() {
        //Given
        //When
        //Then
    }

    @Test
    public void exponentTest() {
        //Given
        //When
        //Then
    }

    @Test
    public void inverseTest() {
        //Given
        //When
        //Then
    }

    @Test
    public void oppositeTest() {
        //Given
        //When
        //Then
    }



}
