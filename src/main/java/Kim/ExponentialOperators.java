package Kim; /**
 * Created by andykim on 1/14/17.
 */

import java.math.*;
public class ExponentialOperators {

    public static void main(String[] args){};

    double answer;

    public double square(double input){
        answer = Math.pow(input, 2);
        System.out.println(answer);
        return answer;
    }
    public double squareRoot(double input){
        answer = Math.sqrt(input);
        System.out.println(answer);
        return answer;
    }
    public double toPower(double base, double power){
        answer = Math.pow(base, power);
        System.out.println(answer);
        return answer;
    }
    public double inversePower(double input){
        answer = 1/input;
        System.out.println(answer);
        return answer;
    }

    }


}
