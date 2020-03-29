package com.vsc.oop.callbacks;

public class CallbackImpl implements OnCalculatorResultListener {

    private int number;

    public CallbackImpl(int number) {
        this.number = number;
    }

    @Override
    public void onResult(int result, boolean isResultGreaterThanAThousand) {
        System.out.println("Factorial of " + number + " is " + result);
    }

    @Override
    public void onNegativeNumber() {

    }

    @Override
    public void onOnePassed() {

    }
}
