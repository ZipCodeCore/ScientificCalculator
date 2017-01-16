package gross_ryan;

/**
 * Created by ryangross on 1/16/17.
 */
public class Custom {

    public double customSum(double displayedNumber) {
       double total = 0;
       for (double i = 0; i <= (int) displayedNumber; i++) {
           total += i;
       }
       return total;
    }

    public double oddOrEven(double displayedNumber) {
        if (displayedNumber % 2 != 0) {
            return -1.0;
        } else {
            return 1.0;
        }
    }
}
