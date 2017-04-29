package kim.christopher;


import java.util.ArrayList;

public class Controller {

    Calculator calculator;
    Display display;
    InputReader reader;

    public Controller(){
        calculator = new Calculator();
        display = new Display();
        reader = new InputReader();
    }

    public void start(){

        System.out.println("Welcome to the first attempt, please try adding two numbers: ");
        ArrayList<String> test = reader.readLine();
        double result = Double.NaN;

        if(test.get(1).equals("+")) {
            result = calculator.add(Double.parseDouble(test.get(0)), Double.parseDouble(test.get(2)));
            display.setDisplay(Double.toString(result));
        } else if(test.get(1).equals("-")){
            result = calculator.subtract(Double.parseDouble(test.get(0)), Double.parseDouble(test.get(2)));
            display.setDisplay(Double.toString(result));
        } else display.setDisplay("Invalid operator");





    }

}
