/**
 * Created by danzygmund-felt on 4/29/17.
 * So far, only decimal and hexadecimal here.
 */

class CalculatorDisplayMode {
    private int mode;

    CalculatorDisplayMode() {
        mode = 0;
    }

    void switchDisplayMode() {
        mode++;
        mode = mode % 3;  //Can turn this to 3 or 4 when I've fixed the binary and octal display modes
    }

    void switchDisplayMode(int x) {
        mode = x;
    }

    String toDisplayMode(double x) {
        switch (mode) {
            case 0:
                return Double.toString(x);
            case 1:
                return Double.toHexString(x);
            case 2:
                Long y = (long) x;
                //Below is from http://stackoverflow.com/questions/6359847/convert-double-to-binary-representation
                //Also adapted for case 3 (octal) below.
                StringBuilder binary = new StringBuilder();
                double num = x - y;
                while (num > 0 && binary.length() < 15) {
                    double r = num * 2;
                    if (r >= 1) {
                        binary.append(1);
                        num = r - 1;
                    } else {
                        binary.append(0);
                        num = r;
                    }
                }
                return Long.toBinaryString(y) + "." + binary.toString();
            case 3:
                Long z = (long) x;
                StringBuilder octal = new StringBuilder();
                double number = x - z;
                while (number > 0 && octal.length() < 15) {
                    double r = number * 8;
                    if (r >= 1) {
                        octal.append(1);
                        number = r - 1;
                    } else {
                        octal.append(0);
                        number = r;
                    }
                }
                return Long.toOctalString(z) + "." + octal.toString();
            default:
                return "";
        }
    }
}
