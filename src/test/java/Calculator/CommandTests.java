package Calculator;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by randallcrame on 1/14/17.
 */
public class CommandTests {
    Command test = new Command();

    @Test
    public void RequestFirstNumberTest(){
        test.requestFirstNumber(1.0);
        Double expected = 1.0;
        Double actual = Storage.storeFirstInput;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RequestSecondNumberTest(){
        test.requestSecondNumber(1.0);
        Double expected = 1.0;
        Double actual = Storage.storeSecondInput;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RequestCommandTest() {
        test.requestCommand("complete");
        String expected = "complete";
        String actual = Storage.storeStringCommand;
        Assert.assertEquals(expected,actual);
    }

}
