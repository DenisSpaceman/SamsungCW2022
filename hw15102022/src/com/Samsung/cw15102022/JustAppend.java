package com.Samsung.cw15102022;
import java.util.Scanner;

public class JustAppend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];
        int number = 4;
        for (int i = 0; i < n; i++){
            array[i] = number;
            number += 3;
        }
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
