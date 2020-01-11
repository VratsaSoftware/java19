package com.vsc;

import java.util.Scanner;

public class CubeTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cube side:");
        int cubeSide = input.nextInt();
        System.out.println(calculateCubeSurface(cubeSide));
        System.out.println(calculateCubeVolume(cubeSide));
    }

    public static double calculateCubeSurface(int cubeSide) {
        return 6 * cubeSide * cubeSide;
    }

    public static double calculateCubeVolume(int cubeSide) {
        return cubeSide * cubeSide * cubeSide;
    }
}
