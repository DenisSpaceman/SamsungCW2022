package com.Samsung.hw201022;

public class SOT {
    public static void main(String[] args) {
        System.out.println(sumOfThirteen(10000));
    }

    public static int sumOfThirteen(int n){
        int res = 0;
        for (int i = 0; i < n; i++){
            int sum = 0;
            int num = i;
            while (num != 0){
                sum += num % 10;
                num /= 10;
            }
            if (sum % 13 == 0) res += 1;
        }
        return res;
    }
}
