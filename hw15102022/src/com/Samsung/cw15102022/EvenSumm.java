package com.Samsung.cw15102022;
import java.util.Scanner;

public class EvenSumm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }

        int summ = 0;
        boolean flag = false;

        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 0){
                flag = true;
                summ += array[i];
            }
        }
        if (!flag) System.out.println("NO");
        else System.out.println(summ);
    }
}
