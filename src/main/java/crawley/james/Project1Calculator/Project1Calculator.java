package crawley.james.Project1Calculator;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class Project1Calculator {

    public static void main (String[] args) {

        InputListener calculator = new InputListener(0, 2);

        System.out.println("This is a calculator.\n Type \"help\" to get a list of commands.");
        System.out.println("The current state is: 0.0");

        while (calculator.isRunning()) {
            calculator.executeCommand();
        }

    }
}
