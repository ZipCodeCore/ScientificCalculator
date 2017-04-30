package com.brownmark;
import org.apache.commons.lang3.StringUtils;

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
        storedMemory.resetDegreeFlag();
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
                if (operandOne.equalsIgnoreCase("Rad") && storedMemory.returnDegreeFlag() == true) {
                    System.out.println("Now in Rad Mode.");
                    storedMemory.setDegreeFlag(false);
                    double tempDouble = Math.toRadians(storedMemory.returnStoredNumber());
                    storedMemory.pushNumberToStorage(tempDouble);
                    calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                    continue;
                }
                if (operandOne.equalsIgnoreCase("Deg") && storedMemory.returnDegreeFlag() == false) {
                    System.out.println("Now in Deg Mode.");
                    storedMemory.setDegreeFlag(true);
                    double tempDouble = Math.toDegrees(storedMemory.returnStoredNumber());
                    storedMemory.pushNumberToStorage(tempDouble);
                    calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                    continue;
                }
                if (operandOne.equalsIgnoreCase("Deg") && storedMemory.returnDegreeFlag() == true){
                    System.out.println("Now in Deg Mode.");
                    calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                    continue;
                }
                if (operandOne.equalsIgnoreCase("Rad") && storedMemory.returnDegreeFlag() == false){
                    System.out.println("Now in Rad Mode.");
                    calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                    continue;
                }
                if (operandOne.equals("e")) {
                    break;
                }
                if (!StringUtils.isNumeric(operandOne)) {
                    calculatorDisplay.displayInvalidInput();
                    calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                    continue;
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
            if (operator.equalsIgnoreCase("Rad") && storedMemory.returnDegreeFlag() == true) {
                System.out.println("Now in Rad Mode.");
                storedMemory.setDegreeFlag(false);
                double tempDouble = Math.toRadians(storedMemory.returnStoredNumber());
                storedMemory.pushNumberToStorage(tempDouble);
                calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                continue;
            }
            if (operator.equalsIgnoreCase("Deg") && storedMemory.returnDegreeFlag() == false) {
                System.out.println("Now in Deg Mode.");
                storedMemory.setDegreeFlag(true);
                double tempDouble = Math.toDegrees(storedMemory.returnStoredNumber());
                storedMemory.pushNumberToStorage(tempDouble);
                calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                continue;
            }
            if (operator.equalsIgnoreCase("Deg") && storedMemory.returnDegreeFlag() == true){
                System.out.println("Now in Deg Mode.");
                calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                continue;
            }
            if (operator.equalsIgnoreCase("Rad") && storedMemory.returnDegreeFlag() == false){
                System.out.println("Now in Deg Mode.");
                calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                continue;
            }
            if (operator.equals("e")) {
                break;
            }
            if (StringUtils.isNumeric(operator)) {
                double tempDouble = Double.parseDouble(operator);
                storedMemory.pushNumberToStorage(tempDouble);
                calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                continue;
            }
            if (calculationFeed.errorChecks(storedMemory.returnStoredNumber(), operator)) {
                calculatorDisplay.displayErr();
                storedMemory.resetStorage();
                storedMemory.resetCalculationCount();
                continue;
            }
            if (calculationFeed.checkForMatchingTrigOperator(operator) && storedMemory.returnDegreeFlag()) {
                if (calculationFeed.degreeTrigErrorChecks(storedMemory.returnStoredNumber(), operator)) {
                    calculatorDisplay.displayErr();
                    storedMemory.resetStorage();
                    storedMemory.resetCalculationCount();
                    continue;
                } else {
                    double tempDegreeOperand = storedMemory.returnStoredNumber();
                    double tempRadiansOperand = Math.toRadians(tempDegreeOperand);
                    double unaryCalculationResult = calculationFeed.sendInputsThroughFeed(tempRadiansOperand, operator);
                    storedMemory.pushNumberToStorage(unaryCalculationResult);
                    calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                    continue;
                }
            }
            if (calculationFeed.checkForMatchingTrigOperator(operator) && !storedMemory.returnDegreeFlag()) {
                if (calculationFeed.radianTrigErrorChecks(storedMemory.returnStoredNumber(), operator)) {
                    calculatorDisplay.displayErr();
                    storedMemory.resetStorage();
                    storedMemory.resetCalculationCount();
                    continue;
                }
                else {
                    double unaryCalculationResult = calculationFeed.sendInputsThroughFeed(storedMemory.returnStoredNumber(), operator);
                    storedMemory.pushNumberToStorage(unaryCalculationResult);
                    calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                    continue;
                }
            }
            if(calculationFeed.checkForMatchingUnaryOperator(operator)) {
                double unaryCalculationResult = calculationFeed.sendInputsThroughFeed(storedMemory.returnStoredNumber(), operator);
                storedMemory.pushNumberToStorage(unaryCalculationResult);
                calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());
                continue;
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
                calculatorDisplay.displayErr();
                storedMemory.resetStorage();
                storedMemory.resetCalculationCount();
                continue;
            }



            double binaryCalculationResult = calculationFeed.sendInputsThroughFeed(storedMemory.returnStoredNumber(), operator, operandTwoNumber);
            if (Double.isNaN(binaryCalculationResult)) {
                calculatorDisplay.displayInvalidOperator();
                continue;
            }
            storedMemory.pushNumberToStorage(binaryCalculationResult);
            calculatorDisplay.returnDisplay(storedMemory.returnStoredNumber());



        }



    }



}