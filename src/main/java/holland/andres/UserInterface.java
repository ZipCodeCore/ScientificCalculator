package holland.andres;

public class UserInterface {

    private String currentDisplay = "0";

    public void runCalculator() {
        boolean isCalculatorOn = true;
        while (isCalculatorOn) {
            GetTextInput getTextInput = new GetTextInput();
            String textInput = getTextInput.getText();
            ConvertToString convertToString = new ConvertToString();
            if (textInput.equalsIgnoreCase("clear") || textInput.equalsIgnoreCase("off")) {
                switch (textInput) {
                    case "clear":
                        currentDisplay = "";
                        break;
                    case "off":
                        currentDisplay = "OFF";
                        isCalculatorOn = false;
                        break;
                }
            }
            else {
                ConvertToDouble convertToDouble = new ConvertToDouble();
                double currentDisplayAsDouble = convertToDouble.convert(currentDisplay);
                switch (textInput) {
                    case "add":
                        Add add = new Add();
                        double addResult = add.run(currentDisplayAsDouble);
                        currentDisplay = convertToString.convert(addResult);
                        break;
                    case "subtract":
                        Subtract subtract = new Subtract();
                        double subtractResult = subtract.run(currentDisplayAsDouble);
                        currentDisplay = convertToString.convert(subtractResult);
                        break;
                    case "multiply":
                        Multiply multiply = new Multiply();
                        double multiplyResult = multiply.run(currentDisplayAsDouble);
                        currentDisplay = convertToString.convert(multiplyResult);
                        break;
                    case "divide":
                        Divide divide = new Divide();
                        double divideResult = divide.run(currentDisplayAsDouble);
                        currentDisplay = convertToString.convert(divideResult);
                        break;
                    case "inverse":
                        Inverse inverse = new Inverse();
                        double inverseResult = inverse.run(currentDisplayAsDouble);
                        currentDisplay = convertToString.convert(inverseResult);
                        break;
                    case "square":
                        Square square = new Square();
                        double squareResult = square.run(currentDisplayAsDouble);
                        currentDisplay = convertToString.convert(squareResult);
                        break;
                    case "square root":
                        SquareRoot squareRoot = new SquareRoot();
                        double squareRootResult = squareRoot.run(currentDisplayAsDouble);
                        currentDisplay = convertToString.convert(squareRootResult);
                        break;
                    case "invert":
                        Invert invert = new Invert();
                        double invertResult = invert.run(currentDisplayAsDouble);
                        currentDisplay = convertToString.convert(invertResult);
                        break;
                    case "exponent":
                        Exponent exponent = new Exponent();
                        double exponentResult = exponent.run(currentDisplayAsDouble);
                        currentDisplay = convertToString.convert(exponentResult);
                        break;
                }

            }
            System.out.println("DISPLAY: " + currentDisplay);
        }
    }
}
