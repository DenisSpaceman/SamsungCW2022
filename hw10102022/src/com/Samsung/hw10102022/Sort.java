package com.Samsung.hw10102022;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);


        System.out.println(min + " " +  (a + b + c - min - max) + " " + max);
    }
}
