package lindsay.devon.Calculator;

import java.util.Scanner;
/**
 * Created by devonlindsay on 9/12/16.
 */
public class UserInterfaceMenus {
  BasicCalculations basic = new BasicCalculations();
  TrigCalculations trig = new TrigCalculations();
  LogarithmicCalculations log = new LogarithmicCalculations();


    public double getuserNum() {
        Scanner scanner = new Scanner(System.in);
        double userNum = scanner.nextDouble();
        return userNum;
    }

    public void welcome(){
        System.out.println("Welcome to Devon's Calculator!");
        welcomeMenu();
    }

    public int welcomeMenu() {
        System.out.println("Please choose a destination: (1) Math  (2) DisplayMode");
        Scanner scanner1 = new Scanner(System.in);
        int menuChoice = scanner1.nextInt();
        welcomeMenuChoice(menuChoice);
        return menuChoice;
    }

    public void welcomeMenuChoice(int input) {
        switch(input) {
            case 1: mathMenu();
            case 2: displayModeMenu();
        }
    }

    public int mathMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] Basic Math [2] Trig [3] Logs");
        Scanner scanner2 = new Scanner(System.in);
        int mathMenuChoice = scanner2.nextInt();
        mathMenuChoice(mathMenuChoice);
        return mathMenuChoice;

    }

    public void displayModeMenu() {
        System.out.println("under construction");
    }

    public void mathMenuChoice(int input) {
        switch(input) {
            case 1: basicMathMenu();
            case 2: trigMenu();
            case 3: logMenu();
        }
    }

    public int basicMathMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] Add [2] Subtract [3] Multiply [4] Divide [5] Square [6] Square Root [7] Exponent [8] Inverse Num [9] Switch +/-");
        Scanner scanner2 = new Scanner(System.in);
        int basicMath = scanner2.nextInt();
        basicMath(basicMath);
        return basicMath;
    }

    public void basicMath(int input) {

        switch (input) {
            case 1: basic.add(getuserNum());
            case 2: basic.subtract(getuserNum());
            case 3: basic.multiply(getuserNum());
            case 4: basic.divide(getuserNum());
            case 5: basic.square(getuserNum());
            case 6: basic.squareRoot(getuserNum());
            case 7: basic.exponent(getuserNum());
            case 8: basic.inverse(getuserNum());
            case 9: basic.switchSign(getuserNum());
        }
    }

    public void trigMenu() {
        System.out.println("under construction");
    }

    public void logMenu() {
        System.out.println("under construction");
    }

}


