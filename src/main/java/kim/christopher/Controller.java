package kim.christopher;

/**
 * Created by christopherkim on 4/28/17.
 */
public class Controller {

    Calculator calculator;
    Display display;
    InputReader reader;

    public Controller(){
        calculator = new Calculator();
        display = new Display();
        reader = new InputReader();
    }

}
