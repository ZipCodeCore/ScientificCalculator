/**
 * Created by mattwu on 4/30/17.
 */

import java.util.Scanner;

public class MethodSelect {

    Scanner input;

    Computation methodPicked;

    double input1;
    double input2;

    public MethodSelect(){
        input = new Scanner(System.in);
        methodPicked = new Computation();
        input1 = 0;
        input2 = 0;
    }

    public void pickMethod(){

        System.out.println("Please choose a computation method from the menu above:");
        int methodChoosed = input.nextInt();

        switch (methodChoosed){

            case 1:
                System.out.println("Addition selected: Enter your first number:");
                input1 = input.nextDouble();
                System.out.println("Enter your second number:");
                input2 = input.nextDouble();
                System.out.println(input1 +  " + " + input2 + " = " + methodPicked.add(input1, input2));
                break;

            case 2:
                System.out.println("Subtraction selected: Enter your first number:");
                input1 = input.nextDouble();
                System.out.println("Enter your second number:");
                input2 = input.nextDouble();
                System.out.println(input1 +  " - " + input2 + " = " + methodPicked.subtract(input1, input2));
                break;

            case 3:
                System.out.println("Multiplication selected: Enter your first number:");
                input1 = input.nextDouble();
                System.out.println("Enter your second number:");
                input2 = input.nextDouble();
                System.out.println(input1 +  " * " + input2 + " = " + methodPicked.multiply(input1, input2));
                break;

            case 4:
                System.out.println("Division selected: Enter your first number:");
                input1 = input.nextDouble();
                System.out.println("Enter your second number:");
                input2 = input.nextDouble();
                System.out.println(input1 +  " / " + input2 + " = " + methodPicked.divide(input1, input2));
                break;




        }

    }

}

