package marwamilton.calculator;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mkulima on 1/16/17.
 */
public class DisplayManager_Tests {

    @Test
    public void checkDefaulVariables(){
        DisplayManager displayManager = new DisplayManager();
        String expectedDefaultDisplayedString = null;
        boolean expectedDefaultDisplayOn = false;
        String actualDefaultDisplayedString = displayManager.displayedString;
        boolean actualDefaultDisplayOn = displayManager.displayOn;
        Assert.assertThat(actualDefaultDisplayedString, is(expectedDefaultDisplayedString));
        Assert.assertThat(actualDefaultDisplayOn, is(expectedDefaultDisplayOn));
    }

}
