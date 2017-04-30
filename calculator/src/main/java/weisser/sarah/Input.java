package weisser.sarah;

import java.util.Scanner;

/**
 * Created by sarahweisser on 4/29/17.
 */
public class Input {

    public double getFirstValue(String input) {
        String[] values = input.split(" ");
        return Double.valueOf(values[0]);
    }

    public double getSecondValue(String input) {
        String[] values = input.split(" ");
        return Double.valueOf(values[1]);
    }

    public String getOperation(String input) {
        String[] values = input.split(" ");
        return values[2];
    }
}
