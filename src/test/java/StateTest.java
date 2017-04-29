/**
 * Created by danzygmund-felt on 4/28/17.
 */
import org.junit.*;

public class StateTest {

    @Test
    public void setValueTest() {
        //Given
        State state = new State();
        double expected = 43.4343;
        //When
        state.setValue(43.4343);
        //Then
        Assert.assertEquals("The value is 43.4343",expected,state.getValue(),0);
    }

    @Test
    public void getValueTest() {
        //Given
        State state = new State(-81.81);
        double expected = -81.81;
        //Then
        double actual = state.getValue();
        //Then
        Assert.assertEquals("The value is -81.81",expected, actual, 0);
    }

    /*@Test
    public void setErrorTest() {
        //Given
        State state = new State();
        boolean expected = true;
        //When
        state.setError(true);
        //Then
        Assert.assertEquals("There should be an error",expected,state.getError(),0);
    }

    @Test
    public void getErrorTest() {
        //Given
        State state = new State();
        boolean expected = false;
        //Then
        Assert.assertEquals("There should be no error", expected);
    }*/

}
