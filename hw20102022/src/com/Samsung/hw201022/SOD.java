package com.Samsung.hw201022;

public class SOD {
    public static void main(String[] args) {
        // somecode
        System.out.println(sumOfDigits(123));
    }

    public static int sumOfDigits(int num){
        char [] number = String.valueOf(num).toCharArray();
        int summ = 0;
        for (int i = 0; i < number.length; i++){
            summ += Integer.parseInt(Character.toString(number[i]));
        }
        return summ;
    }
}
