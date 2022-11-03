package com.Samsung.hw24102022;
import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = n - 1;
        int [][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        boolean isSymmetric = true;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(Math.abs(matrix[i][j] - matrix[j][i]) > 0) isSymmetric = false;
            }
        }
        if (!isSymmetric) System.out.println("no");
        else System.out.println("yes");
    }
}
