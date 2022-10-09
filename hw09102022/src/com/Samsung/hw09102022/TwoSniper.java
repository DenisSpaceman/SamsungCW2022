package com.Samsung.hw09102022;
import java.util.Scanner;

public class TwoSniper{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(n & (n - 1));
    }
}