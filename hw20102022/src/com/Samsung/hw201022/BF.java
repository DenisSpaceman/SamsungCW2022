package com.Samsung.hw201022;

public class BF {
    public static void main(String[] args) {
        binFraction(0.1, 10);
    }

    public static void binFraction(double x, int n){
        double num = x;
        num = num - (int) num;
        for (int i = 0; i < n; i++){
            num *= 2;
            System.out.print((int) num);
            num = num - (int) num;
        }
    }
}
