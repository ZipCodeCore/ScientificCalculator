package crawley.james.Project1Calculator;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class Project1Calculator {

    public static void main (String[] args) {

        Core calculator = new Core();

        System.out.println("This is a calculator.");

        //System.out.println(Math.tan(Math.PI));

        while (calculator.isRunning()) {
            calculator.receiveCommand();
        }

    }
}
