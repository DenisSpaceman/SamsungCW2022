package com.Samsung.hw08102022;
import java.util.Scanner;
import java.util.Locale;

public class PointOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.println((x < 2 && x * x + y * y > 4 && y < x && y > 0 && x > 0) ? "YES" : "NO");
    }
}
