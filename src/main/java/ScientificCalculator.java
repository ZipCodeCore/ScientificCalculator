/**
 * Created by gregoryfletcher on 4/29/17.
 */
public class ScientificCalculator extends CoreCalculator {
	private double memory = 0;

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public void addMemory() {
		this.memory = UserInterface.display + memory;
	}

	public void clearMemory() {
		this.memory = 0;
	}
}
