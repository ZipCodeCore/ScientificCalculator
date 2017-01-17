package armstrong.alexandra;

import java.util.Scanner;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */

public class InputHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static String stringScanner(){
        return scanner.nextLine();
    }

    public static int intScanner(){
        return scanner.nextInt();
    }

    public static Object blankScanner() {
        return scanner.next();
    }

    public static char charScanner(){
        return scanner.next().charAt(0);
    }

    public static double doubleScanner() {
        return scanner.nextDouble();
    }

    public static boolean booleanScanner() {
        return scanner.nextBoolean();
    }

}