package Kim;

/**
 * Created by andykim on 1/14/17.
 */

public class ArithmeticOperators {


    double answer = 0;
    public void print(){
        System.out.println(answer);
    }

    public double add(double input1, double input2){

        answer = input1 + input2;
        print();
        return answer;

    }
    public double subtract(double input1, double input2){
        answer = input1 - input2;
        print();
        return answer;
    }
    public double multiply(double input1, double input2){
        answer = input1 * input2;
        print();
        return answer;
    }
    public double divide(double input1, double input2){
        if (input2 == 0){
            System.out.println("ERROR. STOP. DO NOT DO THIS");
        }

        answer = input1 / input2;
        print();
        return answer;
    }




}

