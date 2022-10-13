package com.Samsung.cw13102022;

public class Main {
    public static void main(String[] args) {
        int ai = 0;

        /*
        while (ai < 100){
            System.out.println(i);
            ai++;
        }
        */
        /*
        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }
         */
        /*
        for (;;){
            System.out.println(1);
            if () break;
        }
         */

        int [] array;
        array = new int[10];

        array[9] = 10;
        array[0] = -100;

        double res = 0;

        for (int i = 0; i < 10; i++){
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            res += array[i];
        }

        System.out.println("\n" + res / array.length);
    }
}
