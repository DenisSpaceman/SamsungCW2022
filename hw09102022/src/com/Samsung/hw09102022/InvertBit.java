package com.Samsung.hw09102022;
import java.util.Scanner;

public class InvertBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int i = in.nextInt();

        System.out.println(a ^ (1 << i));
    }
}

