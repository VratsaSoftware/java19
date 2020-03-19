package com.vsc;

public class Main {

    public static void main(String[] args) {
        String text = "I like Java";
        String checkText = "java";
        System.out.println(getFirstPosition(text, null));
    }

    public static int getFirstPosition(String text, String checkText) {
        if (text == null) {
            return -3;
        } else if (checkText == null) {
            return -5;
        } else {
            return text.indexOf(checkText);
        }
    }
}
