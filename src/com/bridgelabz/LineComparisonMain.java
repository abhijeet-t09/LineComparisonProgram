package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 and y2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double result = lengthComputation(x1, y1, x2, y2);
        System.out.println("Length of Line = " + result);
    }

    static double lengthComputation(int x1, int y1, int x2, int y2){

        double a = Math.pow(x2 - x1, 2);
        double b = Math.pow(y2 - y1, 2);
        double c = (a * x1) + (b * y1);

        double length = Math.sqrt(a + b);

        if (b < 0) {
            System.out.println(
                    "The line passing through points P and Q:: "
                            + a + "x - " + b + "y = " + c);
        }
        else {
            System.out.println(
                    "The line passing through points P and Q is: "
                            + a + "x + " + b + "y = " + c);
        }

        return length;
    }
}
