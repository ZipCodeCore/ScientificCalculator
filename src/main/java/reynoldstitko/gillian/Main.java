package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.runCalculator();
        UserInterface userInterface = new UserInterface();
        Scanner sc = new Scanner(System.in);
        Double value = sc.nextDouble();
        userInterface.captureUserInputValue(value);
    }
}
