/**
 * Created by danzygmund-felt on 4/29/17.
 * So far, only decimal and hexadecimal here.
 */

public class CalculatorDisplayMode {
    private int mode;

    CalculatorDisplayMode() {
        mode = 0;
    }

    public void switchDisplayMode() {
        mode++;
        mode = mode % 2;
    }

    public void switchDisplayMode(int x) {
        mode = x;
    }

    public String toDisplayMode(double x) {
        //this is a stub. gonna be mathy to write, hopefully.
        switch (mode) {
            case 0:
                return Double.toString(x);
            case 1:
                return Double.toHexString(x);
            default:
                return "";
        }
    }
}
