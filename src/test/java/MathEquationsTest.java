import banuelos.aurora.MathEquations;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 4/29/17.
 */
public class MathEquationsTest {

    @Test
    public void addTest() {
        // Given
        double firstOperand = 1.0;
        double secondOperand = 2.0;
        double expectedResult = firstOperand + secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.add(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void addIfOneNumberNegativeTest() {
        // Given
        double firstOperand = -1.0, secondOperand = 2.0;
        double expectedResult = firstOperand + secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.add(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void addIfBothNumbersNegativeTest() {
        // Given
        double firstOperand = -1.0, secondOperand = -2.0;
        double expectedResult = firstOperand + secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.add(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void subtractTest() {
        //Given
        double firstOperand = 3.0, secondOperand = 1.0;
        double expectedResult = firstOperand - secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.subtract(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void subtractGreaterTest() {
        //Given
        double firstOperand = 3.0, secondOperand = 8.0;
        double expectedResult = firstOperand - secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.subtract(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void subtractNegativesTest() {
        //Given
        double firstOperand = -3.0, secondOperand = -8.0;
        double expectedResult = firstOperand - secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.subtract(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void multiplyTest() {
        //Given
        double firstOperand = 3.0, secondOperand = 2.0;
        double expectedResult = firstOperand * secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.multiply(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void multiplyNegativesTest() {
        //Given
        double firstOperand = -3.0, secondOperand = -2.0;
        double expectedResult = firstOperand * secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.multiply(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void divideTest() {
        //Given
        double firstOperand = 6.0, secondOperand = 2.0;
        double expectedResult = firstOperand / secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.divide(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void divideNegativesTest() {
        //Given
        double firstOperand = -6.0, secondOperand = -2.0;
        double expectedResult = firstOperand / secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.divide(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void divideByZeroTest() {
        //Given
        double firstOperand = 6.0, secondOperand = 0.0;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.divide(firstOperand, secondOperand);

        //Then
        Assert.assertTrue(Double.isNaN(actualResult));
    }

    @Test
    public void exponentTest() {
        //Given
        double firstOperand = 3.0, secondOperand = 2.0;
        double expectedResult = Math.pow(firstOperand, secondOperand);
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.exponent(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void zeroToNegativePowerTest() {
        //Given
        double firstOperand = 0.0, secondOperand = -3.0;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.exponent(firstOperand, secondOperand);

        //Then
        Assert.assertTrue(Double.isNaN(actualResult));
    }

    @Test
    public void squareTest(){
        //Given
        double firstOperand = 2.0;
        double expectedResult = Math.pow(firstOperand, 2.0);
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.square(firstOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void inverseTest(){
        //Given
        double firstOperand = 2.0;
        double expectedResult = 1 / firstOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.inverse(firstOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void inverseZeroTest(){
        //Given
        double firstOperand = 0.0;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.inverse(firstOperand);

        //Then
        Assert.assertTrue(Double.isNaN(actualResult));
    }

    @Test
    public void squareRootTest(){
        //Given
        double firstOperand = 4.0;
        double expectedResult = Math.sqrt(firstOperand);
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.squareRoot(firstOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void squareRootNegativeTest(){
        //Given
        double firstOperand = -4.0;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.squareRoot(firstOperand);

        //Then
        Assert.assertTrue(Double.isNaN(actualResult));
    }

    @Test
    public void switchSignTest(){
        //Given
        double firstOperand = 4.0;
        double expectedResult= firstOperand * -1;
        MathEquations equations = new MathEquations();

        //When
        double actualResult = equations.switchSign(firstOperand);

        //Then
        Assert.assertEquals(expectedResult, actualResult, 0 );

    }


}
