package com.samsung.hw212;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println((x == (byte) x) ? "YES" : "NO");
        System.out.println((x == (short) x) ? "YES" : "NO");
    }
}
