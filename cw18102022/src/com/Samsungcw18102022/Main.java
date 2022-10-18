package com.Samsungcw18102022;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();
        int sum = sum(a, b);

        System.out.println(sum);

        int [] arr1 = {10, 20, 30, 40};
        int [] arr2 = {10, 20, 30, 40};

        printArray(arr1);
        printArray(arr2);

        int res = max(a, b);
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void printArray(int [] array){
        System.out.println("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println(array.length - 1 + "]");
    }

    public static int max(int a, int b) {;
        return a > b ? a : b;
    }
}
