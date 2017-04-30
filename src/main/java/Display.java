/**
 * Created by danzygmund-felt on 4/28/17.
 */

public class Display {

    private DisplayMode displayMode;

    Display() {
        this.setDisplay(0.0);
        DisplayMode displayMode = new DisplayMode();
    }

    public void setDisplay() {
        System.out.println("Err");
    }

    public void setDisplay(double x) {
        System.out.println(displayMode.toDisplayMode(x));
    }

    public void clearDisplay() {
        this.setDisplay(0.0);
    }

    //not worrying about a getDisplay method right now, since it seems a little redundant and will make my life difficult
    //but if I have to...

}