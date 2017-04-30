package io.github.aaronclong.calculator;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Display display = new Display();
        while (scanner.hasNext()) {
            display.addToScreen(scanner.next());
        }
    }
}
