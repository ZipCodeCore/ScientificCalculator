package leczner.jon.Calculator;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class Display {
    private String state;
    private int significantDigits;
    public enum Mode {DECIMAL, HEX, BINARY, OCTAL}
    private Mode mode;

    public Display() {
        mode = Mode.DECIMAL;
    }

    public void clear() {
        return;
    }

    public void showState() {
        return;
    }

    public void switchDisplayMode() {
        if (mode == Mode.DECIMAL)
            mode = Mode.HEX;
    }

    public void switchDisplayMode(Mode mode) { return; }

    public void setSignificantDigits(int digits) { significantDigits = digits; }

}
