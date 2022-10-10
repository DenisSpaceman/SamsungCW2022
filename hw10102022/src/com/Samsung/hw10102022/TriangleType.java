package com.Samsung.hw10102022;
import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int another = (a + b + c) - max - min;

        boolean obtuse = false;
        boolean right = false;

        if (a + b > c && b + c > a && a + c > b){
            if (max * max > another * another + min * min) {
                System.out.println("obtuse");
                obtuse = true;
            }
            if (max * max == another * another + min * min){
                System.out.println("right");
                right = true;
            }
            if (!obtuse && !right) System.out.println("acute");
        }else System.out.println("impossible");
    }
}
