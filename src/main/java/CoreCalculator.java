/**
 * Created by gregoryfletcher on 4/29/17.
 */
public class CoreCalculator {

	public void add(double inputOne, double inputTwo) {
		UserInterface.display = inputOne + inputTwo;
	}

	public void subtract(double inputOne, double inputTwo) {
		UserInterface.display = inputOne - inputTwo;
	}

	public void multiply(double inputOne, double inputTwo) {
		UserInterface.display = inputOne * inputTwo;
	}

	public void divide(double inputOne, double inputTwo) {
		if(inputTwo <= 0){
			System.out.println(UserInterface.error);
		} else {
			UserInterface.display = inputOne / inputTwo;
		}
	}

	public void exponentiation(double inputOne, double inputTwo) {
		UserInterface.display = Math.pow(inputOne, inputTwo);
	}

	public void square(double inputOne) {
		UserInterface.display = inputOne * inputOne;
	}

	public void squareRoot(double inputOne) {
		UserInterface.display = Math.sqrt(inputOne);
	}

	public void inverse(double inputOne) {
		UserInterface.display = 1 / inputOne;
	}

	public void invertSign(double inputOne) {
		UserInterface.display = inputOne * -1;
	}
}
