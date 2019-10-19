public class CoreFunctions {

    private double num1;
    private double num2;
    private double answer;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getAnswer() {
        return answer;
    }

    public double add(double num1, double num2) {
        return this.answer = num1 + num2;
    }

    public double subtract(double num1, double num2)    {
        return this.answer = num1 - num2;
    }

    public double multiply(double num1, double num2)    {
        return this.answer = num1 * num2;
    }

    public double divide(double num1, double num2)  {
        return this.answer = num1 / num2;
    }




}