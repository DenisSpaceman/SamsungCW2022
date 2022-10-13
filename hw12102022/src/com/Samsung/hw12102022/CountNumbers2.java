package com.Samsung.hw12102022;
import java.util.Scanner;

public class CountNumbers2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, c = 0;
        while (true){
            n = in.nextInt();
            if (n % 5 == 0){
                if (n > 10) c += n;
                break;
            }
            else{
                if (n > 10) c += n;
            }
        }
        System.out.println(c);
    }
}
