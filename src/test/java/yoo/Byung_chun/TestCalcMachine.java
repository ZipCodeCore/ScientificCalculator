package yoo.Byung_chun;


/**
 * Created by byung-chunyoo on 4/30/17.
 */

import org.junit.Assert;
import org.junit.Test;

public class TestCalcMachine {
    @Test
    public void calculateTwoNum(){
        //: Given
        byte opCode = 1;
        double firstOperand = 2.0, secondOperand = 2.0; // ... two positive values to add
        double expectedSum = firstOperand + secondOperand; // 2 + 2 = 4

        CalcMachine calcMachine = new CalcMachine();

        //: When
        calcMachine.calculateTwoNum(firstOperand, secondOperand, opCode);

        //: Then
        // ... The result should be the sum of those two values
        Assert.assertEquals(expectedSum, calcMachine.getResult(), 0);
    }

    @Test
    public void calculateOneNum(){
        //: Given
        byte opCode = 6;
        double firstOperand = 2.0;
        double expectedResult = Math.sqrt(2);

        CalcMachine calcMachine = new CalcMachine();

        //: When
        calcMachine.calculateOneNum(firstOperand, opCode);

        //: Then
        // ... The result should be the sum of those two values
        System.out.println(expectedResult + ": " + calcMachine.getResult());
        Assert.assertEquals(expectedResult, calcMachine.getResult(), 0);
    }
}
