package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class LineComparisonMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LineComparisonMain objPQ=new LineComparisonMain();
        LineComparisonMain objRS=new LineComparisonMain();

        boolean lengthCheck  = Objects.equals(objPQ.lengthPQ(), objRS.lengthRS());

        if (lengthCheck == true)
            System.out.println("The lines PQ and RS are equal");
        else
            System.out.println("PQ and RS are not equal");
    }


    double lengthPQ(){
        System.out.println("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 and y2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double a = Math.pow(x2 - x1, 2);
        double b = Math.pow(y2 - y1, 2);
        double c = (a * x1) + (b * y1);

        double length1 = Math.sqrt(a + b);

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
        System.out.println("Length of Line = " + length1);
        System.out.println();
        return length1;
    }

    double lengthRS(){
        System.out.println("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 and y2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double a = Math.pow(x2 - x1, 2);
        double b = Math.pow(y2 - y1, 2);
        double c = (a * x1) + (b * y1);

        double length2 = Math.sqrt(a + b);

        if (b < 0) {
            System.out.println(
                    "The line passing through points R and S:: "
                            + a + "x - " + b + "y = " + c);
        }
        else {
            System.out.println(
                    "The line passing through points R and S is: "
                            + a + "x + " + b + "y = " + c);
        }
        System.out.println("Length of Line = " + length2);
        return length2;
    }
}
