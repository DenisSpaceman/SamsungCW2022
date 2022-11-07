package com.samsung.trash2;

public class mintobegin {
    public static void main(String[] args) {
        int [] x = {200, -5555, 4852, -5555, 15, 78, 65};
        minToBegin(x);
    }
    public static void minToBegin(int [] array){
        int [] arr = array;
        int min = 999999999, min_i = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                min_i = i;
            }
        }
        int [] out = new int[arr.length];
        out[0] = min;
        for (int i = 1; i < out.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (j == min_i) continue;
                else{
                    out[i] = arr[j];
                    i++;
                }
            }
        }
        array = out;
    }
}
