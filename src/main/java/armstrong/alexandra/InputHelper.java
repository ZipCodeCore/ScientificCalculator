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

}