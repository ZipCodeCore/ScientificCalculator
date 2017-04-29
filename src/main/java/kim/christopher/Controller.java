package kim.christopher;


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
        //stub
    }

}
