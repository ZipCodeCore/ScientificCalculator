package holland.andres;

import java.util.Scanner;

public class GetTextInput {

    public String getText () {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do? (add,subtract,multiply,divide,exponent,inverse,invert,square,square root)");
        return input.nextLine().toLowerCase();
    }
}
