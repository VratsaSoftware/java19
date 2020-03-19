package com.vsc;

public class ReplaceTask {

    public static void main(String[] args) {
        String text = "I study Java. Java is nice.";
        System.out.println(replaceText(text));
    }

    public static String replaceText(String text) {
        return text.replace("Java", "PHP");
    }
}
