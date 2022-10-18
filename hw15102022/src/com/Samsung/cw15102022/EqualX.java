package com.Samsung.cw15102022;
import java.util.Scanner;

public class EqualX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++) array[i] = in.nextInt();

        boolean flag = false;
        int x = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (array[i] == x){
                System.out.println(i + 1);
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("NO");
    }
}
