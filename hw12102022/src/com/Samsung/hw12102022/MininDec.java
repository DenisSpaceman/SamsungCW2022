package com.Samsung.hw12102022;
import java.util.Scanner;

public class MininDec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int out = 1;
        while (n > 0){
            int i = n % 10;
            if (i < out) out = i;
            n /= 10;
        }
        System.out.println(out);
    }
}

