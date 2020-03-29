package com.vsc.oop.callbacks;

public class Program {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number = 7;

//        calculator.calculateFactoial(number, new OnCalculatorResultListener() {
//            @Override
//            public void onResult(int result, boolean isNumberGreaterThanAThousand) {
//                System.out.println("Factorial of " + number + " is " + result);
//                System.out.println("Is number greater than a thousand: " + isNumberGreaterThanAThousand);
//            }
//
//            @Override
//            public void onNegativeNumber() {
//                System.out.println("Number passed cannot be negative");
//            }
//
//            @Override
//            public void onOnePassed() {
//                System.out.println("Factorial of 1 is always 1");
//            }
//        });
//        calculator.calculateFactoial(number, new OnCalculatorResultListener() {
//            @Override
//            public void onResult(int result, boolean isResultGreaterThanAThousand) {
//                System.out.println("asasdasdas");
//            }
//
//            @Override
//            public void onNegativeNumber() {
//                System.out.println("cdvxcvxcv");
//            }
//
//            @Override
//            public void onOnePassed() {
//                System.out.println("tggedbddbdrb");
//            }
//        });

        OnCalculatorResultListener listener = new CallbackImpl(number);
        calculator.calculateFactoial(number, listener);
    }
}
