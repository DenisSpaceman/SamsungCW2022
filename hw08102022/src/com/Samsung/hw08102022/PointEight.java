package com.Samsung.hw08102022;
import java.util.Scanner;
import java.util.Locale;

public class PointEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.println(((x >= 0 && x * x + y * y <= 1) || (y <= 1 && x >= 0 && y >= x - 1)) ? "YES" : "NO");
    }
}
