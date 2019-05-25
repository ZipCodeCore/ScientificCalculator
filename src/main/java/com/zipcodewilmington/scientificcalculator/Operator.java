package com.zipcodewilmington.scientificcalculator;

public class Operator {

    public static Double getOperator(String operator,Double firstNum,Double secondNum)

    {Double answer = 0.0;
        if(operator.equals("+")){
            answer = firstNum + secondNum;
        }
        else if(operator.equals("-")){
        answer = firstNum - secondNum;
    }
        else if(operator.equals("*")){
            answer = firstNum * secondNum;
        }else if(operator.equals("/")){
            answer = firstNum / secondNum;
        }
        else{

        }
       return answer;
    }




}
