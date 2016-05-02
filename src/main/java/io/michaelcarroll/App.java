package io.michaelcarroll;


public class App {

    public static void main(String[] args) {

        Display display = new Display();
        try {
            display.runCalculator();
        } catch (Exception e) {
            System.out.println("Err - Not a command");
            display.runCalculator();
        }

    }
}
