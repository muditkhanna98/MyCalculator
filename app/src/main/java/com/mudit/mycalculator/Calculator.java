package com.mudit.mycalculator;


public class Calculator {
    String operationString = "";
    String resultString = "0";
    String operation = "";

    long intNumber;
    long firstNumber;
    long memoryInt = 0;

    double realNumber;
    double memoryDouble = 0.0;

    boolean isIntMemory = true;
    boolean isIntNumber = true;

    public void processNumber(int num) {
        if (resultString.length() < 12) {
            intNumber = intNumber * 10 + num;
            resultString = String.valueOf(intNumber);
            if (operation != "") {
                operationString += num;
            } else operationString = resultString;
        } else operationString = "The number is too long..";
    }


    public void processOperation(String operation) {
        firstNumber = intNumber;
        intNumber = 0;
        this.operation = operation;
        operationString += operation;
    }

    public void memPlusClicked() {
        if (isIntMemory) {
            if (isIntNumber) {
                memoryInt += intNumber;
                operationString = "M: " + memoryInt;
            } else {
                isIntNumber = false;
                memoryDouble = memoryInt + realNumber;
            }
        }
    }

    public void memMinusClicked() {
        if (isIntMemory) {
            if (isIntNumber) {
                memoryInt -= intNumber;
                operationString = "M: " + memoryInt;
            } else {
                isIntNumber = false;
                memoryDouble = memoryInt - realNumber;
            }
        }
    }

    public void memoryRecall() {
        resultString = operationString = String.valueOf(memoryInt);
        intNumber = memoryInt;
    }

    public void memoryClear() {
        memoryInt = 0;
        resultString = "0";
        operationString = "";
        intNumber = 0;
    }

    public void clear() {
        resultString = "0";
        operationString = "";
        intNumber = 0;
        operation = "";
    }


    public void showResult() {
        switch (operation) {
            case "+":
                resultString = String.valueOf(firstNumber + intNumber);
                break;
            case "-":
                resultString = String.valueOf(firstNumber - intNumber);
                break;
            case "x":
                resultString = String.valueOf(firstNumber * intNumber);
                break;
            case "/":
                resultString = String.valueOf(firstNumber / intNumber);
        }
    }


}
