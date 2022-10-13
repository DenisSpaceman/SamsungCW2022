package com.Samsung.hw12102022;
import java.util.Scanner;

public class DevRem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        int n = 0;
        int buffer = a;
        while (true){
            if (buffer - b >= 0){
                c++;
                buffer -= b;
            }else break;
        }
        buffer = a;
        while (true){
            if (buffer - b >= 0){
                buffer -= b;
            }else{
                n = buffer;
                break;
            }
        }
        System.out.println(c + " " + n);
    }
}
