package com.vsc.oop.callbacks;

public class Calculator {

    public void calculateFactoial(int number, OnCalculatorResultListener listener) {
        if (number <= 0) {
            listener.onNegativeNumber();
        } else if (number == 1) {
            listener.onOnePassed();
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            boolean isNumberGreaterThanAThousand = factorial >= 1000;
            listener.onResult(factorial, isNumberGreaterThanAThousand);
        }
    }
}
