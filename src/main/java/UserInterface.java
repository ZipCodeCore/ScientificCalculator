import java.util.*;
import java.lang.*;

/**
 * Created by gregoryfletcher on 4/29/17.
 */


public class UserInterface {

	public static double display = 0;
	public static String error = "Err";

	Scanner in = new Scanner(System.in);
	int choice = in.nextInt();

	switch (choice) {
		case 1:
			choice = 1;
			addOperation();
			break;

	}

	public void addOperation() {
		System.out.println("Give first number: ");
		int inputOne = in.nextInt();
		System.out.println("Give second number: ");
		int inputTwo = in.nextInt();
		System.out.println(CoreCalculator.add(inputOne, inputTwo));
	}
}