package com.Samsung.hw091020222;
import java.util.Scanner;

public class ToHeigher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a < b && b < c) {
            System.out.println(a + " " + b + " " + c);
        }
        if (b < a && a < c) {
            System.out.println(b + " " + a + " " + c);
        }
        if (a < c && c < b) {
            System.out.println(a + " " + c + " " + b);
        }
        if (c < a && a < b) {
            System.out.println(c + " " + a + " " + b);
        }
        if (c < b && b < a) {
            System.out.println(c + " " + b + " " + a);
        }
        if (b < c && c < a) {
            System.out.println(b + " " + c + " " + a);
        }
    }
}
