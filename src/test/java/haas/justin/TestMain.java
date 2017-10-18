package haas.justin;

/**
 * Created by justinhaas on 4/28/17.
 */

import org.junit.Assert;
import org.junit.Test;


public class TestMain {

    @Test
    public void testBasicAddition() {
        //:Given
        int x = 10, y = 5;
        int expectedSum = x + y;
        Calculate calculate = new Calculate();

        //:When
        int actualSum = calculate.addition(x, y);

        //:Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testNegativeAddition() {
        //:Given
        int x = -10, y = 5;
        int expectedSum = x + y;
        Calculate calculate = new Calculate();

        //:When
        int actualSum = calculate.addition(x, y);

        //:Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testBasicSubtraction() {
        //:Given
        int x = 40, y = 10;
        int expectedSum = x - y;
        Calculate calculate = new Calculate();

        //:When
        int actualSum = calculate.subtraction(x, y);

        //:Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testNegativeSubtraction() {
        //:Given
        int x = 15, y = 25;
        int expectedSum = x - y;
        Calculate calculate = new Calculate();

        //:When
        int actualSum = calculate.subtraction(x, y);

        //:Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testMultiplication() {
        //:Given
        int x = 2, y = 5;
        int expectedSum = x * y;
        Calculate calculate = new Calculate();

        //:When
        int actualSum = calculate.multiplication(x, y);

        //:Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testRegularDivision() {
        //:Given
        int x = 50, y = 25;
        int expectedSum = x / y;
        Calculate calculate = new Calculate();

        //:When
        int actualSum = calculate.division(x, y);

        //:Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testUnevenDivision(){
        //:Given
        int x = 53, y = 4;
        int expectedSum = x / y;
        Calculate calculate = new Calculate();

        //:When
        int actualSum = calculate.division(x, y);

        //:Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSquareRoot(){
        //:Given
        double x = 144, y = 12;
        double expectedSum = Math.sqrt(x);
        Calculate calculate = new Calculate();

        //:When
        double actualSum = calculate.squareRoot(x);

        //:Then
        Assert.assertEquals(expectedSum, actualSum, .0001);
    }

   @Test
    public void testSquare(){
       //:Given
       double x = 4, y = 2;
       double expectedSum = Math.pow(x, y);
       Calculate calculate = new Calculate();

       //:When
       double actualSum = calculate.square(x, y);

       //:Then
       Assert.assertEquals(expectedSum, actualSum, .0001);
   }
}