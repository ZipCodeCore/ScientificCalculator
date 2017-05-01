import java.util.Scanner;

/**
 * Created by andrewwong on 4/28/17.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicMath basicMath = new BasicMath();
        TrigMath trigMath = new TrigMath();
        Memory memory = new Memory();
        Display display = new Display(memory, scanner);
        TaskAssigner taskDelegater = new TaskAssigner(basicMath, memory);

        Logic logic = new Logic(taskDelegater, display, memory);
        logic.run();

    }
}
