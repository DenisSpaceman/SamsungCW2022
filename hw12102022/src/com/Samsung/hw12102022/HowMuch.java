package com.Samsung.hw12102022;
import java.util.Scanner;

public class HowMuch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int c = 0;
        while (n > 0){
            c++;
            n /= 10;
        }
        System.out.println(c);
    }
}
