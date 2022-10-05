package com.Samsung.hw05102022;
import java.util.Locale;
import java.util.Scanner;

public class PointOfLine2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        System.out.println(!((x >= -2 && x <= 3) || (x >= 6 && x <= 9)) ? true : false);
    }
}
