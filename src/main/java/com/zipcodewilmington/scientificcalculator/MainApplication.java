package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 * James, Sandy and Zanetta version
 */
public class MainApplication {
    private static Prompt prompt = new Prompt();

    public static void main(String[] args) {
        Console.println("Welcome to Mr. Math!");
        Console.println("To see a valid list of commands, type 'menu' at any time");
        Console.println("When you are finish with Mr. Math, feel free to quit by entering ':q'");

        prompt.start();
    }
}