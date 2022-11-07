package com.samsung.trash2;

import java.util.Scanner;

public class isalpha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char x = in.next().charAt(0);
        IsDigit(x);

    }
    public static String IsDigit(char c){
        if (Character.isDigit(c)){
            System.out.println("yes");
            return true;
        }else{
            System.out.println("no");
            return false;
        }
    }
}
