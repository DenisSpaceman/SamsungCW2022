package com.Samsung.cw15102022;
import java.util.Locale;
import java.util.Scanner;

public class NEvenMid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }

        boolean flag = false;
        int summ = 0;
        int neven = 0;

        for (int i = 0; i < n; i++){
            if (array[i] % 2 != 0){
                flag = true;
                summ += array[i];
                neven += 1;
            }
        }
        if (!flag) System.out.println("NO");
        else System.out.println(String.format(Locale.US,"%.2f", (double) summ / neven));
    }
}
