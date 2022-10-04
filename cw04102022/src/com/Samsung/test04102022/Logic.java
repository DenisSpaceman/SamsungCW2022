package com.Samsung.test04102022;
import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean aBool = true;
        System.out.println(aBool);

        aBool = 5 > 6;
        System.out.println(aBool);

        aBool = 5 > 6 && 6 < 7;
        System.out.println(aBool);

        int n = in.nextInt(); // from 0 to 10
        aBool = 0 < n && n < 10;
        System.out.println(aBool);

        aBool = 0 + 5 < n * 10 && n < 10; //math, com, logic ops priority
        System.out.println(aBool);

        double x = in.nextDouble();
        double y = in.nextDouble();

        String res = ( y > 0 && x < 2 && y < x && x * x + y * y > 4 ) ? "YES" : "NO";
        System.out.println(res);
    }
}
