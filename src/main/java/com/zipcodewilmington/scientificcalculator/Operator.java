package com.zipcodewilmington.scientificcalculator;

public class Operator {

    public static Double getOperator(String operator,Double firstNum,Double secondNum)

    {Double answer = 0.0;
        if(operator.equals("+")){
            answer = simpleMath.add(firstNum,secondNum);
        }
        else if(operator.equals("-")){
        answer = firstNum - secondNum;
        }
        else if(operator.equals("*")){
            answer = firstNum * secondNum;
        }
        else if(operator.equals("/")){
            answer = firstNum / secondNum;
        }
        else if(operator.equals("r")){
            answer= Math.sqrt(firstNum);

        }
        else if(operator.equals("^")){
            answer= Math.pow(firstNum,secondNum);
        }
        else if(operator.equals("s")){
            answer= Math.sin(firstNum);
        }
        else if(operator.equals("cs")){
            answer= Math.cos(firstNum);
        }
        else if(operator.equals("t")){
            answer = Math.tan(firstNum);
        }
        else if(operator.equals("is")){
            answer = Math.asin(firstNum);
        }
        else if(operator.equals("ics")){
            answer = Math.acos(firstNum);
        }
        else if(operator.equals("it")){
            answer = Math.atan(firstNum);
        }
        else if(operator.equals("f")){
            for(int i=1;i <=firstNum;i++){
                answer+=firstNum*i;
            }
        }
        else{
            System.out.println("Please enter a valid operator");
        }
       return answer;
    }




}
