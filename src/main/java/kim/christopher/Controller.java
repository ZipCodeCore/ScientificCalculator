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
        System.out.println("Welcome, enter a number: ");
        display.setDisplay("0");
        display.setDisplay(reader.readLine().get(0));

        while(!quit) {
            System.out.println("Enter operator and 2nd operand: ");

            ArrayList<String> test = reader.readLine();
            if(test.get(0).equals("quit")) {
                quit = true;
                System.out.println("Goodbye!");
            } else if (test.get(0).equals("clear")) {
                display.clearDisplay();
                display.show();
            } else if (test.get(0).equals("+")) {
                display.setDisplay(calc.add(display.getCurrentDisplay(), test.get(1)));
            } else if (test.get(0).equals("-")) {
                display.setDisplay(calc.subtract(display.getCurrentDisplay(), test.get(1)));
            } else if (test.get(0).equals("*")) {
                display.setDisplay(calc.multiply(display.getCurrentDisplay(), test.get(1)));
            } else if (test.get(0).equals("/")) {
                if(calc.divide(display.getCurrentDisplay(), test.get(1)).equals("ERROR")){
                    System.out.println("ERROR");
                }
                else display.setDisplay(calc.divide(display.getCurrentDisplay(), test.get(1)));
            } else System.out.println("Invalid Operator");
        }




    }

}
