package Main;

/**
 * Created by jennifermcginty on 4/28/17.
 */
public class BasicCalculator {

    Display display = new Display();
    UserInput input = new UserInput();

    public double addNums(double numOne, double numTwo){
        double ans = numOne + numTwo;
        display.printDouble(ans);
        return ans;
    }

    public double subNums(double numOne, double numTwo){
        double ans = numOne - numTwo;
        display.printDouble(ans);
        return ans;
    }

    public double multiNums(double numOne, double numTwo){
        double ans = numOne * numTwo;
        display.printDouble(ans);
        return ans;
    }

    public double divideNum(double numOne, double numTwo){
        double ans = numOne/numTwo;
        if(numOne == 0 || numTwo == 0){
            display.print("Err");
        }
        display.printDouble(ans);
        return ans;
    }



}
