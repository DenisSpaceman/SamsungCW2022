package com.Samsung.hw201022;

public class MTB {
    public static void main(String[] args) {
        int [] arr = {200, -5555, 4852, -5555, 15, 78, 65};
        minToBegin(arr);
    }

    public static void minToBegin(int [] array){
        int min = 999999999, n = 0;
        int [] arr = array;
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                n = i;
                min = array[i];
            }
        }
        int i = min, j = min - 1;
        while (j >= 0){
            arr[i--] = array[j--];
        }
        arr[0] = min;
        for (int it = 0; it < arr.length; it++){
            System.out.print(arr[it] + " ");
        }
    }
}
