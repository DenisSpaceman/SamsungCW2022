package com.Samsung.hw12102022;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, c = 0;
        while (true){
            n = in.nextInt();
            if (n < 0){
                c++;
                break;
            }
            else c ++;
        }
        System.out.println(c);
    }
}
