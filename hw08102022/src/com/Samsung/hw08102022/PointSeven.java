package com.Samsung.hw08102022;
import java.util.Scanner;
import java.util.Locale;

public class PointSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.println((y > 1 - x && x < 1 && ((y > 2 * x * x) || (y < 2 * x * x) && x > 0)) ? "YES" : "NO");
    }
}
