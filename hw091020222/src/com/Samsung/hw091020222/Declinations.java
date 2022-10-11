package com.Samsung.hw091020222;
import java.util.Scanner;

public class Declinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n % 10 == 0) System.out.println(n + " TORTOV");
        else if (n % 100 > 10 && n % 100 < 20) System.out.println(n + " TORTOV");
        else if (n % 10 < 5) System.out.println(n + " TORT" + (n % 10 > 1? "A" :""));
        else System.out.println(n + " TORTOV");
    }
}
