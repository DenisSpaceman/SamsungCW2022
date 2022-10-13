package com.Samsung.hw12102022;
import java.util.Scanner;

public class EvenSumm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int c = 0;
        int counter = 25;

        while (counter <= n){
            if (counter % 2 == 0) c += counter;
            counter++;
        }
        System.out.println(c);
    }
}
