package com.Samsung.hw24102022;
import java.util.Scanner;

public class DevTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int i = x, c = 0;
        while (x < 100) {
            c++;
            x++;
        }
        System.out.println(x + " " + c);
        x = i;
        c = 0;
        do {
            if (x >= 100){
                c = 0;
                break;
            }else{
                x++;
                c++;
            }
        } while (x < 100);
        System.out.println(x + " " + c);
    }
}
