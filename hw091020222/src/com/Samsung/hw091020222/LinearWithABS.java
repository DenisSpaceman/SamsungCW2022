package com.Samsung.hw091020222;
import java.util.Locale;
import java.util.Scanner;

public class LinearWithABS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if ((a >= 0 && b > 0) || (a == 0 && b > 0)) System.out.println("any x");
        else if (a == 0 || (a < 0 && b <= 0)) System.out.println("no such x");
        else if (a < 0){
            System.out.println(String.format(Locale.US, "%.1f", (double) b / a) + "<x<" + String.format(Locale.US, "%.1f", (double) -b / a));
        }else System.out.println("x<" + String.format(Locale.US, "%.1f", (double) b / a) + " or x>" + String.format(Locale.US, "%.1f", (double) -b / a));
    }
}
