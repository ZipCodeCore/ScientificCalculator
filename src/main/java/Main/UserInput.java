package Main;

import java.util.Scanner;

/**
 * Created by jennifermcginty on 4/29/17.
 */
public class UserInput {
    Scanner input = new Scanner(System.in);

    public int takeUserInt(){
        return input.nextInt();
    }
}
