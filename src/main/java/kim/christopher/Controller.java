package kim.christopher;


import java.util.ArrayList;

public class Controller {

    Calculator calc;
    Display display;
    InputReader reader;

    public Controller(){
        calc = new Calculator();
        display = new Display();
        reader = new InputReader();
    }

    public void start(){

        boolean quit = false;
        while(!quit) {
            System.out.println("Please try a basic math operation: ");

            ArrayList<String> test = reader.readLine();
            if(test.get(0).equals("quit")) {
                quit = true;
            } else if (test.get(1).equals("+")) {
                display.setDisplay(calc.add(test.get(0), test.get(2)));
            } else if (test.get(1).equals("-")) {
                display.setDisplay(calc.subtract(test.get(0), test.get(2)));
            } else if (test.get(1).equals("*")) {
                display.setDisplay(calc.multiply(test.get(0), test.get(2)));
            } else if (test.get(1).equals("/")) {
                display.setDisplay(calc.divide(test.get(0), test.get(2)));
            } else display.setDisplay("Invalid operator");
        }




    }

}
