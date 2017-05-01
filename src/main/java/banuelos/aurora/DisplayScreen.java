package banuelos.aurora;

import java.util.Scanner;

/**
 * Created by aurorabanuelos on 4/29/17.
 */
public class DisplayScreen {

    Calculator calculator = new Calculator();
    Scanner in = new Scanner(System.in);
    String continueOrExit;


    public void displayDefault (){
        System.out.println("This is a calculator");
        System.out.println("0");

    }

    public void continueUse() {

        System.out.println("Continue ? Y/N");
        continueOrExit = in.next();
    }

}
