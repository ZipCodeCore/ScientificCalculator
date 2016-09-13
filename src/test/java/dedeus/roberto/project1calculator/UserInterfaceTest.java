package dedeus.roberto.project1calculator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static java.lang.Double.NaN;

/**
 * Created by robertodedeus on 9/13/16.
 */
public class UserInterfaceTest {
    private CoreCalculator coreCalculator;
    private State state;
    private UserInterface userInterface;

    @Before
    public void initialize(){
        coreCalculator = new CoreCalculator();
        state = new State();
        userInterface = new UserInterface();
    }
    @Test
    public void checkErrorTest(){
        userInterface.state.setStateValue(NaN);
        boolean actualValue = userInterface.checkError();
        assertTrue(actualValue);
    }
}
