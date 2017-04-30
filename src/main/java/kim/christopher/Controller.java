package kim.christopher;


import java.util.ArrayList;
import org.apache.commons.lang3.math.NumberUtils;

public class Controller {

    Calculator calc;
    Display display;
    InputReader reader;

    public Controller(){
        calc = new Calculator();
        display = new Display();
        reader = new InputReader();
    }

    public void start() {

        boolean quit = false;
        System.out.println("Welcome, enter a number: ");
        display.setDisplay("0");
        String test = reader.readLine().get(0);
        while(!quit){
            if (!NumberUtils.isNumber(test)) {
                System.out.println(test + " is not a number, please try again");
                test = reader.readLine().get(0);
            } else {
                display.setDisplay(test);
                quit = true;
            }
        }

        quit = false;
        while(!quit) {
           readInput(quit);
        }
    }

    void readInput(boolean quit){

        ArrayList<String> input = reader.readLine();

        if(input.get(0).equals("quit")) {
            quit = true;
            System.out.println("Goodbye!");
        } else if (input.get(0).equals("clear")) {
            display.clearDisplay();
        } else if (input.get(0).equals("+")) {
            display.setDisplay(calc.add(display.getDisplay(), input.get(1)));
        } else if (input.get(0).equals("-")) {
            display.setDisplay(calc.subtract(display.getDisplay(), input.get(1)));
        } else if (input.get(0).equals("*")) {
            display.setDisplay(calc.multiply(display.getDisplay(), input.get(1)));
        } else if (input.get(0).equals("/")) {
            if(calc.divide(display.getDisplay(), input.get(1)).equals("ERROR")){
                System.out.println("DISPLAY: ERROR");
            }
            else display.setDisplay(calc.divide(display.getDisplay(), input.get(1)));
        } else if(input.get(0).equals("negate")){
            display.setDisplay(calc.negate(display.getDisplay()));
        } else System.out.println("Invalid Operator, please try again");
    }

}
