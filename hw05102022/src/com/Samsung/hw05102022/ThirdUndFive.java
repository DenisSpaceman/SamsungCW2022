package com.Samsung.hw05102022;
import java.util.Scanner;

public class ThirdUndFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println((x > 0 && x % 5 == 0 && x >= 100 && x < 1000) ? true : false);
    }
}
