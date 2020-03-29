package com.vsc.oop.callbacks;

public interface OnCalculatorResultListener {

    void onResult(int result, boolean isResultGreaterThanAThousand);

    void onNegativeNumber();

    void onOnePassed();
}
