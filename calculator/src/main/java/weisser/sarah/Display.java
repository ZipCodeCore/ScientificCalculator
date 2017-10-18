package weisser.sarah;

/**
 * Created by sarahweisser on 4/29/17.
 */
public class Display {

    CalculationValues values;

    public Display(CalculationValues values) {
        this.values = values;
    }

    public void displayFirstValue() {
        System.out.println(values.getValue1());
    }

    public void displaySecondValue() {
        System.out.println(values.getValue2());
    }

    public void displayOperation() {
        System.out.println(values.getOperation());
    }
}
