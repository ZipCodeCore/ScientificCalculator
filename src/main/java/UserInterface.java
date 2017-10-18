import java.util.*;
import java.lang.*;

/**
 * Created by gregoryfletcher on 4/29/17.
 */


public class UserInterface {

	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
		userInterface.start();
	}

	ScientificCalculator scientificCalculator = new ScientificCalculator();

		boolean isRunning = true;

		public static double display = 0;
		public static String error = "Err";


		Scanner in = new Scanner(System.in);
		int choice;

		public void start(){
			while(isRunning){
				mySwitch();
			}
		}

	public void mySwitch() {
		System.out.println("This is a calculator, you can Exit (Type 0), Add (Type: 1)");
		choice = in.nextInt();
		switch (choice) {
			case 0:
				isRunning = false;
				break;
			case 1:
				choice = 1;
				addOperation();
				break;

		}
	}

	public void addOperation() {
		System.out.println("Give first number: ");
		int inputOne = in.nextInt();
		System.out.println("Give second number: ");
		int inputTwo = in.nextInt();
		scientificCalculator.add(inputOne, inputTwo);
		System.out.println(display);
	}
}
