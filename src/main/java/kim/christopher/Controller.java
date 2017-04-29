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

        System.out.println("Welcome to the first attempt, please try adding two numbers: ");
        ArrayList<String> test = reader.readLine();
        double result = Double.NaN;

        if(test.get(1).equals("+")) {
            display.setDisplay(calc.add(test.get(0), test.get(2)));
        } else if(test.get(1).equals("-")){
            display.setDisplay(calc.subtract(test.get(0), test.get(2)));
        } else display.setDisplay("Invalid operator");





    }

}
