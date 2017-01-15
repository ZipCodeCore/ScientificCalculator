package marwamilton.calculator;

/**
 * Created by mkulima on 1/15/17.
 */
public class OwnDebugs {


    public static void main(String[] args) {
        InputParser ip = new InputParser();
        DisplayManager dm = new DisplayManager();

        String userString = dm.getUserInput();
        Boolean clearFlag = ip.clearScreenCheck(userString);
        System.out.println(Boolean.toString(clearFlag));


    }
}
