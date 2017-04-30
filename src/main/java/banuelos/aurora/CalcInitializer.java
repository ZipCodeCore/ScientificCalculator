package banuelos.aurora;


/**
 * Created by aurorabanuelos on 4/29/17.
 */
public class CalcInitializer {


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        DisplayScreen currentDisplay = new DisplayScreen();

        currentDisplay.displayDefault();
        calculator.print();
        calculator.calculate();
        //currentDisplay.displayResult();

    }

}
