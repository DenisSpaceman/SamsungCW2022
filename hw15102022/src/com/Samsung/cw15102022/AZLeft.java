package com.Samsung.cw15102022;
import java.util.Scanner;

public class AZLeft {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];
        int [] sorted = new int[n];

        for (int i = 0; i < n; i++) array[i] = in.nextInt();

        for (int i = 0; i < n; i++){
            int temp = 0;
            for (int j = 0; j < n; j++){
                if(array[j] < 0 && array[j] != -999999999){
                    temp = array[j];
                    array[j] = -999999999;
                    break;
                }
            }
            sorted[i] = temp;
        }

        int counter = 0;
        for (int i = 0; i < n; i++){
            if (sorted[i] == 0){
                counter = i;
                break;
            }
        }

        if (sorted[counter] == 0){
            for (int i = counter; i < n; i++){
                int temp = 0;
                for (int j = 0; j < n; j++){
                    if(array[j] > 0 && array[j] != -999999999){
                        temp = array[j];
                        array[j] = -999999999;
                        break;
                    }
                }
                sorted[i] = temp;
            }
            for (int i = 0; i < n; i ++) System.out.print(sorted[i] + " ");
        }else{
            for (int i = 0; i < n; i ++) System.out.print(sorted[i] + " ");
        }
    }
}
