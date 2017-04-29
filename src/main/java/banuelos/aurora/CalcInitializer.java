package banuelos.aurora;


/**
 * Created by aurorabanuelos on 4/29/17.
 */
public class CalcInitializer {


    public static void main(String[] args) {
        UserInput input = new UserInput();
        Calculator calculator = new Calculator();
        MathEquations equations = new MathEquations();
        DisplayScreen currentDisplay = new DisplayScreen();

        currentDisplay.displayDefault();
        input.print();
        calculator.calculate();
        currentDisplay.displayResult();


    }


}
