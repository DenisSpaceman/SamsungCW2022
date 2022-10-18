package com.Samsung.cw15102022;
import java.util.Scanner;

public class ReversedArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }

        int [] reversed = new int[n];
        for (int i = n - 1; i >= 0; i--){
            reversed[n - i - 1] = array[i];
        }

        for (int i = 0; i < n; i++){
            System.out.print(reversed[i] + " ");
        }
    }
}
