/**
 * Created by danzygmund-felt on 4/28/17.
 */
import java.util.*;

public class Display {

    private String display;

    Display() {
        this.setDisplay("0");
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void clearDisplay() {
        this.setDisplay("");
    }

    public String getDisplay() {
        return this.display;
    }

}
