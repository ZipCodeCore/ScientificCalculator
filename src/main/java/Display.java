/**
 * Created by danzygmund-felt on 4/28/17.
 */
import java.util.*;

public class Display {

    Display() {
        this.setDisplay("0");
    }

    public void setDisplay(String display) {
        System.out.println(display);
    }

    public void clearDisplay() {
        this.setDisplay("");
    }

    //not worrying about a getDisplay method right now, since it seems a little redundant and will make my life difficult
    //but if I have to...

}