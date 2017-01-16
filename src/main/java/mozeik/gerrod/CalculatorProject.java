package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 * Worked with Bill Mattern on this.
 * The main function calls Display to prompt the user to input a number.
 * Display then asks the user what function they want to perform on that number. That function is passed to Choice.
 * Choice determines whether or not the user needs to enter another number based on the operator code they entered.
 * For any functions that require the user to input another number, it prompts for that number and then runs the
 * appropriate calculation against both with CalculatorWithOneNumber.
 * If the requested operation does not require another number to be entered, the calculation runs in CalculatorWithTwoNumbers.
 * The resulting value is then passed back to Display to appear on the screen.
 */
public class CalculatorProject {

    public static void main(String[] ars) {
        Display.getInitialValue();
    }

}
