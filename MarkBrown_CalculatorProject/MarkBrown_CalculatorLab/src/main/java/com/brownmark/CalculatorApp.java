package com.brownmark;


public class CalculatorApp {


    public CalculatorApp() {}


    CalculatorPower calculatorOn = new CalculatorPower();
    Display calculatorDisplay = new Display();
    UserInput input = new UserInput();
    MemoryStorage storedMemory = new MemoryStorage();
    CalculationFeed calculationFeed = new CalculationFeed();


    public void calculatorEngine() {


        storedMemory.resetStorage();
        storedMemory.resetCalculationCount();
        calculatorDisplay.defaultDisplay();


        while (calculatorOn.getCalculatorPower()) {
            String operandOne;
            String operator;
            String operandTwo;


            if (storedMemory.returnCalculationCount() == 0) {
                operandOne = input.getOperandInput();
                if (operandOne.equals("c") || operandOne.equals("")) {
                    calculatorDisplay.defaultDisplay();
                    continue;
                }
                if (operandOne.equals("e")) {
                    break;
                }
                storedMemory.pushNumberToStorage(Double.parseDouble(operandOne));
                calculatorDisplay.returnDisplay(Double.parseDouble(operandOne));
            }
            storedMemory.incrementCalculationCount();


            operator = input.getOperator();
            if (operator.equals("c") || operator.equals("")) {
                storedMemory.resetStorage();
                storedMemory.resetCalculationCount();
                calculatorDisplay.defaultDisplay();
                continue;
            }
            if (operator.equals("e")) {
                break;
            }
            calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());



            operandTwo = input.getOperandInput();
            if (operandTwo.equals("c") || operandTwo.equals("")) {
                storedMemory.resetStorage();
                storedMemory.resetCalculationCount();
                calculatorDisplay.defaultDisplay();
                continue;
            }
            if (operandTwo.equals("e")) {
                break;
            }
            double operandTwoNumber = Double.parseDouble(operandTwo);


            if (calculationFeed.errorChecks(storedMemory.returnStoredNumber(), operator, operandTwoNumber)) {
                System.out.println("Err");
                storedMemory.resetStorage();
                storedMemory.resetCalculationCount();
                continue;
            }


            double newResult = calculationFeed.sendInputsThroughFeed(storedMemory.returnStoredNumber(), operator, operandTwoNumber);
            storedMemory.pushNumberToStorage(newResult);
            calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());


        }


    }


}