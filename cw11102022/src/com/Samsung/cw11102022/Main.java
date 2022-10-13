package com.Samsung.cw11102022;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("");

        System.out.print("");

        double pi = 3.141234234233456345;

        System.out.printf("3 знака %.3f | 5 знаков %.5f", pi, pi);

        int n = in.nextInt();

        while (n < 100){
            System.out.println(n);
            n++;
        }

        n = in.nextInt();

        do {
            System.out.println(n);
        }while (n < 100);

        n = 0;
        int count = 0;

        do {
            n = in.nextInt();
            count++;
        }while (n >= 0);

        System.out.println(count);
        in.close();
    }
}
