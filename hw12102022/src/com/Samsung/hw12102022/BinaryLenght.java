package com.Samsung.hw12102022;
import java.util.Scanner;

public class BinaryLenght {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int len = 0;
        while (n > 0){
            n >>= 1;
            len += 1;
        }
        System.out.println(len);
    }
}
