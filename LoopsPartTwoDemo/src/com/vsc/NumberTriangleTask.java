package com.vsc;

public class NumberTriangleTask {

    public static void main(String[] args) {
        int n = 4;

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        String result = "";
        for (int i = 1; i <= n; i++) {
            result += i + "";
            System.out.println(result);
        }
    }
}
