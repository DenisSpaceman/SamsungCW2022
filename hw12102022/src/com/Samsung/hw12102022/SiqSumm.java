package com.Samsung.hw12102022;
import java.util.Scanner;

public class SiqSumm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, c = 0;
        while (true){
            n = in.nextInt();
            if (n < 10 || n > 99){
                break;
            }else{
                c += n / 10 + (n - n / 10 * 10);
            }
        }
        System.out.println(c);
    }
}
