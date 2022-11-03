package com.Samsung.cw20102022;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] array1 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        int [][] array2 = new int[5][4];
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                array1[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                System.out.print(array1[i][j] + "\t");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i][i] + "\t");
        }
        System.out.print("\n");

        //Далее всё аналогично
    }
}
