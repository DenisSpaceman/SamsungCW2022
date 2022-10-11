package com.Samsung.hw091020222;
import java.util.Scanner;

public class Classificator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n / 10 == 0 && n >= 0) System.out.println("DIGIT");
        else if (n / 10 > 0 && n / 10 < 10 && n > 0) System.out.println("NUM");
        else System.out.println("OTHER");
    }
}
