package com.Samsung.hw08102022;
import java.util.Scanner;
import java.util.Locale;

public class PointTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.println((y < Math.sin(x) && y > 0 && y < 0.5 && x < Math.PI && x > 0) ? "YES" : "NO");
    }
}
