package com.Samsung.hw05102022;
import java.util.Scanner;

public class SelfNegativeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (a == b * (-1) || a == c * (-1) || a == d * (-1)){
            System.out.println(true);
        }
        else if (b == c * (-1) || b == d * (-1)){
            System.out.println(true);
        }
        else if (c == d * (-1)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
