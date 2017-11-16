package Kim; /**
 * Created by andykim on 1/14/17.
 */
import java.math.*;
public class LogFunctions {
    public static void main(String[] args){};

    double answer;

    public double log(double input){
        answer = Math.log10(input);
        System.out.println(answer);
        return answer;
    }
    public double inverseLog(double input){
        answer = Math.pow(10, input);
        System.out.println(answer);
        return answer;
    }
    public double naturalLog(double input){
        answer = Math.log(input);
        System.out.println(answer);
        return answer;
    }
    public double inverseNaturalLog(double input){
        answer = Math.exp(input);
        System.out.println(answer);
        return answer;
    }

}
