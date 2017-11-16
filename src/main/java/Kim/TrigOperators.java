package Kim; /**
 * Created by andykim on 1/14/17.
 */
import java.awt.*;
import java.math.*;
public class TrigOperators {
    public static void main(String[] args){};

    double answer = 0;

    public double sin(double input){
        answer = Math.sin(input);
        System.out.println(answer);
        return answer;
        }
    public double inverseSin(double input){
        answer = Math.asin(input);
        System.out.println(answer);
        return answer;
    }
    public double cos(double input){
        answer = Math.cos(input);
        System.out.println(answer);
        return answer;
    }
    public double inverseCos(double input){
        answer = Math.acos(input);
        System.out.println(answer);
        return answer;
    }
    public double tan(double input){
        answer = Math.tan(input);
        System.out.println(answer);
        return answer;
    }
    public double inverseTan(double input){
        answer = Math.atan(input);
        return answer;
    }


    }



