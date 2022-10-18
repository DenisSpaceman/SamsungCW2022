package com.Samsung.cw15102022;
import java.util.Scanner;

public class MostPop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++) array[i] = in.nextInt();

        int [] popularity = new int[n];

        for (int i = 0; i < n; i++){
            int e_pop = 0;
            for (int j = 0; j < n; j++){
                if (array[i] == array[j] && j != i) e_pop++;
            }
            popularity[i] = e_pop;
        }

        int pop_max = 0;

        for (int i = 0; i <n; i++){
            if (popularity[i] > pop_max) pop_max = popularity[i];
        }

        if (pop_max == 0){
            int min = 99999999;
            for (int i = 0; i < n; i++){
                if (array[i] < min) min = array[i];
            }
            System.out.println(min);
        }else{
            int min = 99999999;
            pop_max = 0;
            for (int i = 0; i < n; i++){
                if (popularity[i] > pop_max) pop_max = popularity[i];
            }
            for (int i = 0; i < n; i++){
                if (popularity[i] == pop_max) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}
