package com.Samsung.hw201022;
import java.text.DecimalFormat;
import java.util.Locale;

public class AOD {
    public static void main(String[] args) {
        int [] arr = {-8, 15, 86457
        };
        System.out.println(avgOf4Digit(3, arr));
    }

    public static double avgOf4Digit(int n, int [] array){
        boolean isinArr = false;
        int res = 0, c = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 1000 && array[i] <= 9999){
                isinArr = true;
                c += 1;
                res += array[i];
            }
        }
        if (isinArr) return (double) res / c;
        else return -1.00;
    }
}
