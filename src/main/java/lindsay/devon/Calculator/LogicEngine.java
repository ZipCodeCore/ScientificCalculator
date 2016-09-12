package lindsay.devon.Calculator;

/**
 * Created by devonlindsay on 9/12/16.
 */
public class LogicEngine {
    BasicCalculations basic = new BasicCalculations();
    TrigCalculations trig = new TrigCalculations();
    LogarithmicCalculations log = new LogarithmicCalculations();
    UserInterfaceMenus ui = new UserInterfaceMenus();

    public static void logicEngine() {

        ui.welcome();
    }
}
