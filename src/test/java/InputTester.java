import org.junit.Assert;
import org.junit.Test;

/**
 * Created by luisgarcia on 4/29/17.
 */
public class InputTester
{
    Input test = new Input();

    @Test
    public void testGetValue()
    {
        //given
        double expected = 3;

        //when
        double actual = test.getValue("3");

        //then
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testGetOperation()
    {
        //given
        String expected = "add";

        //when
        String actual = test.getOperation("add");

        //then
        Assert.assertEquals(expected, actual);
    }


}
