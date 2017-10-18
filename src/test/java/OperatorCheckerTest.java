/**
 * Created by danzygmund-felt on 4/30/17.
 */
import org.junit.*;

public class OperatorCheckerTest {

    @Test
    public void isBinaryOperationTrueTest() {
        //Given
        OperatorChecker checker = new OperatorChecker();
        //When
        boolean result = checker.isBinaryOperation("+");
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void isBinaryOperationFalseTest() {
        //Given
        OperatorChecker checker = new OperatorChecker();
        //When
        boolean result = checker.isBinaryOperation("sq");
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void isUnaryOperationTrueTest() {
        //Given
        OperatorChecker checker = new OperatorChecker();
        //When
        boolean result = checker.isUnaryOperation("log10");
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void isUnaryOperationFalseTest() {
        //Given
        OperatorChecker checker = new OperatorChecker();
        //When
        boolean result = checker.isUnaryOperation("*");
        //Then
        Assert.assertFalse(result);
    }

}
