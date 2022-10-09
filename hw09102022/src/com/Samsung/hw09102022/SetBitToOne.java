package com.Samsung.hw09102022;
import java.util.Scanner;

public class SetBitToOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int i = in.nextInt();

        System.out.println((1 << i) | a);
    }
}
