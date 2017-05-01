package kim.christopher;


import java.util.ArrayList;
import org.apache.commons.lang3.math.NumberUtils;

public class Controller {

    Calculator calc;
    Display disp;
    InputReader reader;

    public Controller(){
        calc = new Calculator();
        disp = new Display();
        reader = new InputReader();
    }


    public void start() {

        reset();

        boolean quit = false;

        while(!quit) {
           readInput(quit);
        }
    }

    void readInput(boolean quit){

        ArrayList<String> input = reader.readLine();
        String first = input.get(0);

        if(input.size() == 1) {

            if (first.equals("quit") || first.equals("q")) {
                quit = true;
                System.out.println("Goodbye!");
            } else if (first.equals("clear") || first.equals("c")) {
                reset();
            } else if (first.equals("negate")) {
                disp.setDisplay(calc.negate(disp.getDisplay()));
            } else if (first.equals("square")) {
                disp.setDisplay(calc.square(disp.getDisplay()));
            } else if (first.equals("sqrt")) {
                if(calc.sqrt(disp.getDisplay()).equals("ERROR"))
                    disp.displayError();
                else disp.setDisplay(calc.sqrt(disp.getDisplay()));
            } else if (first.equals("inverse")) {
                disp.setDisplay(calc.inverse(disp.getDisplay()));
            } else disp.showInvalidOperator(first);

        } else if(input.size() == 2) {

            if (first.equals("+")) {
                if (calc.add(disp.getDisplay(), input.get(1)).equals("ERROR")) {
                    disp.displayError();
                } else disp.setDisplay(calc.add(disp.getDisplay(), input.get(1)));
            } else if (first.equals("-")) {
                if (calc.subtract(disp.getDisplay(), input.get(1)).equals("ERROR")) {
                    disp.displayError();
                } else disp.setDisplay(calc.subtract(disp.getDisplay(), input.get(1)));
            } else if (first.equals("*")) {
                if (calc.multiply(disp.getDisplay(), input.get(1)).equals("ERROR")) {
                    disp.displayError();
                } else disp.setDisplay(calc.multiply(disp.getDisplay(), input.get(1)));
            } else if (first.equals("/")) {
                if (calc.divide(disp.getDisplay(), input.get(1)).equals("ERROR")) {
                    disp.displayError();
                } else disp.setDisplay(calc.divide(disp.getDisplay(), input.get(1)));
            } else if (first.equals("^")) {
                if (calc.multiply(disp.getDisplay(), input.get(1)).equals("ERROR")) {
                    disp.displayError();
                } else disp.setDisplay(calc.power(disp.getDisplay(), input.get(1)));
            } else disp.showInvalidOperator(first);

        } else disp.displayError();
    }

    void reset(){

        boolean quit = false;
        disp.clearDisplay();
        String test = reader.readLine().get(0);

        while(!quit){
            if (!NumberUtils.isNumber(test)) {
                disp.showInvalidNumber(test);
                test = reader.readLine().get(0);
            } else {
                disp.setDisplay(test);
                quit = true;
            }
        }
    }

}
