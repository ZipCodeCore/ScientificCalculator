/**
 * Created by danzygmund-felt on 4/29/17.
 * So far, only decimal and hexadecimal here.
 */

public class DisplayMode {
    private int mode;
    Display display;

    DisplayMode() {
        mode = 0;
    }

    public void switchDisplayMode() {
        mode++;
        mode = mode % 2;
    }

    public void switchDisplayMode(int x) {
        mode = x;
    }

    public void toDisplay(double x) {
        //this is a stub. gonna be mathy to write, hopefully.
        switch (mode) {
            case 0:
                display.setDisplay(Double.toString(x));
            case 1:
                display.setDisplay(Double.toHexString(x));
            default:
                display.setDisplay("");
        }
    }
}
