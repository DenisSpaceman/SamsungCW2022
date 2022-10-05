package com.Samsung.hw05102022;
import java.util.Scanner;

public class PointOfLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println((x >= 3 && x <= 8) ? true : false);
    }
}
