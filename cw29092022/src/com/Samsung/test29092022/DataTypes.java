package com.Samsung.test29092022;
import java.util.Locale;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        byte aByte = -128;
        short aShort = 32676;
        int aInt = 2147483647;
        long aLong = 2000000000L;
        double aDouble = 0.1;
        float aFloat = 0.1f;

        boolean aBool = true;

        Scanner in = new Scanner(System.in);

        in.useLocale(Locale.US); // смена формата ввода данных

        System.out.println(i++); // 0
        System.out.println(i); // 1
        System.out.println(++i); // 2

        System.out.println(i--); // 1
        System.out.println(i); // 0
    }
}
