package lindsay.devon.Calculator;

/**
 * Created by devonlindsay on 9/12/16.
 */
public class CurrentValueDisplay {

    BasicCalculations basicMath = new BasicCalculations();
    TrigCalculations trig = new TrigCalculations();
    LogarithmicCalculations log = new LogarithmicCalculations();
    double stateValue;

    CurrentValueDisplay() {
        this.stateValue = 0;
    }

   public void setCurrentValue(double input) {
    this.stateValue = input;
   }

   public double getCurrentValue() {
        return this.stateValue;
   }

   public void resetCurrentValue() {
        this.stateValue = 0;

   }
}
