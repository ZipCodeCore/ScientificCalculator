/**
 * Created by luisgarcia on 4/29/17.
 */
public class Controller
{
    DisplayOperation examples = new DisplayOperation();
    Input ex = new Input();

    public static void main (String[] args)
    {
        Controller ex = new Controller();
        ex.run();
    }

    public void run()
    {

        examples.setDisplay(3);
        examples.divide(3);
        System.out.println(examples.display());
        System.out.println(examples.getMode());
        examples.multiply(3);
        System.out.println(examples.display());
        examples.variableExp(8);
        examples.squareRoot();
        examples.invert();
        System.out.println(examples.display());



    }
}
