package holland.andres;

import java.util.Scanner;

public class GetNumberInput {

    public double getNumber () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return input.nextInt();
    }
}
