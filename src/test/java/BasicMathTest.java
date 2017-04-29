import org.junit.Assert;
import org.junit.Test;


public class BasicMathTest {

    @Test
    public void testAddition()  {

        // Given
        double leftOperand = 1.0;
        double rightOperand = 1.0;
        double expectedResult = leftOperand + rightOperand;
        BasicMath calcEngine = new BasicMath();

        // When
        double actualResult = calcEngine.add(leftOperand,rightOperand);

        // Then
        Assert.assertEquals(expectedResult,actualResult, 1e-8);
    }

    @Test
    public void testNegativeAddition()  {

        // Given
        double leftOperand = -1.0;
        double rightOperand = 1.0;
        double expectedResult = leftOperand + rightOperand;
        BasicMath calcEngine = new BasicMath();

        // When
        double actualResult = calcEngine.add(leftOperand,rightOperand);

        // Then
        Assert.assertEquals(expectedResult,actualResult, 1e-8);
    }

    @Test
    public void testSubtraction() {

        // Given
        double leftOperand = 2.0;
        double rightOperand = 1.0;
        double expectedResult = leftOperand - rightOperand;
        BasicMath calcEngine = new BasicMath();

        // When
        double actualResult = calcEngine.subtract(leftOperand,rightOperand);

        // Then
        Assert.assertEquals(expectedResult,actualResult, 1e-8);

    }

    @Test
    public void testNegativeSubtraction() {

        // Given
        double leftOperand = 2.0;
        double rightOperand = -1.0;
        double expectedResult = leftOperand - rightOperand;
        BasicMath calcEngine = new BasicMath();

        // When
        double actualResult = calcEngine.subtract(leftOperand,rightOperand);

        // Then
        Assert.assertEquals(expectedResult,actualResult, 1e-8);

    }

    @Test
    public void divide() {

        // Given
        double leftOperand = 2.0;
        double rightOperand = 1.0;
        double expectedResult = leftOperand / rightOperand;
        BasicMath calcEngine = new BasicMath();

        // When
        double actualResult = calcEngine.divide(leftOperand,rightOperand);

        // Then
        Assert.assertEquals(expectedResult,actualResult, 1e-8);
    }

    @Test
    public void negativeDivision() {

        // Given
        double leftOperand = -2.0;
        double rightOperand = 1.0;
        double expectedResult = leftOperand / rightOperand;
        BasicMath calcEngine = new BasicMath();

        // When
        double actualResult = calcEngine.divide(leftOperand,rightOperand);

        // Then
        Assert.assertEquals(expectedResult,actualResult, 1e-8);
    }

    @Test
    public void testMultiplication() {

        // Given
        double leftOperand = 2.0;
        double rightOperand = 2.0;
        double expectedResult = leftOperand * rightOperand;
        BasicMath calcEngine = new BasicMath();

        // When
        double actualResult = calcEngine.multiply(leftOperand,rightOperand);

        // Then
        Assert.assertEquals(expectedResult,actualResult, 1e-8);

    }

    @Test
    public void testNegativeMultiplication() {

        // Given
        double leftOperand = 2.0;
        double rightOperand = -2.0;
        double expectedResult = leftOperand * rightOperand;
        BasicMath calcEngine = new BasicMath();

        // When
        double actualResult = calcEngine.multiply(leftOperand,rightOperand);

        // Then
        Assert.assertEquals(expectedResult,actualResult, 1e-8);

    }

}