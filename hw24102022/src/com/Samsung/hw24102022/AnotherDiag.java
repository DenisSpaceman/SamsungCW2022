package com.Samsung.hw24102022;
import java.util.Scanner;

public class AnotherDiag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = n - 1;
        int [][] matrix = new int[n][n];
        for (int m = 0; m < matrix.length; m++){
            for (int j = 0; j < matrix[m].length; j++){
                if (j < i) matrix[m][j] = 0;
                if (j == i) matrix[m][j] = 1;
                if (j > i) matrix[m][j] = 2;
            }
            i--;
        }
        for (int m = 0; m < matrix.length; m++){
            for (int j = 0; j < matrix[m].length; j++){
                System.out.print(matrix[m][j] + " ");
            }
            System.out.println();
        }
    }
}
