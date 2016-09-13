package Ravikumar.Sujatha.Project1Calculator;

import java.util.Scanner;

/**
 * Created by sujatharavikumar on 9/10/16.
 */
public class Input {

    public int getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        return num;
    }

    public double getDouble(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = input.nextDouble();
        return num;
    }


    public String getStringInput(){
        Scanner inp = new Scanner(System.in);
        String value = inp.nextLine();
        return value;
    }

}
