package com.Samsung.hw10102022;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class NumbersOfRome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<Integer,String> dictionary = new HashMap<Integer,String>();
        dictionary.put(1, "I");
        dictionary.put(2, "II");
        dictionary.put(3, "III");
        dictionary.put(4, "IV");
        dictionary.put(5, "V");
        dictionary.put(6, "VI");
        dictionary.put(7, "VII");
        dictionary.put(8, "VIII");
        dictionary.put(9, "IX");
        dictionary.put(10, "X");
        dictionary.put(20, "XX");
        dictionary.put(30, "XXX");
        dictionary.put(40, "XL");
        dictionary.put(50, "L");
        dictionary.put(60, "LX");
        dictionary.put(70, "LXX");
        dictionary.put(80, "LXXX");
        dictionary.put(90, "XC");
        dictionary.put(100, "C");

        int number = in.nextInt();
        int integer = number / 10 * 10;
        int delta = number - integer;

        if (integer != 0 && delta != 0) System.out.println(dictionary.get(integer) + dictionary.get(delta));
        if (integer != 0 && delta == 0) System.out.println(dictionary.get(integer));
        if (integer == 0 && delta != 0) System.out.println(dictionary.get(delta));
    }
}
