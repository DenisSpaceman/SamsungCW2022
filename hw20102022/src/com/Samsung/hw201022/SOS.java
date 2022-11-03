package com.Samsung.hw201022;

public class SOS {
    public static void main(String[] args) {
        System.out.println(sumOfSeven(10, 30));
    }

    public static int sumOfSeven(int a, int b){
        int summ = 0;
        for (int i = a; i <= b; i++){
            if (i % 7 == 0 && i >= 10 && i <= 99){
                summ += i / 10 + (i - (i / 10) * 10);
            }
        }
        return summ;
    }
}
