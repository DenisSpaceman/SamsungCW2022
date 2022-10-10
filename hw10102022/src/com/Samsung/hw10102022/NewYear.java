package com.Samsung.hw10102022;
import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int month = in.nextInt();
        int day = in.nextInt();

        if (month >= 1 && month <= 12){
            if ((month != 2 && (day % 2 == 0 && day >= 1 && day <= 30)) || (month == 2 && day >= 1 && day <= 28)){
                switch (month){
                    case 1:
                        System.out.println(334 + (31 - day));;
                        break;
                    case 2:
                        System.out.println(306 + (28 - day));;
                        break;
                    case 3:
                        System.out.println(275 + (31 - day));;
                        break;
                    case 4:
                        System.out.println(245 + (30 - day));;
                        break;
                    case 5:
                        System.out.println(214 + (31 - day));;
                        break;
                    case 6:
                        System.out.println(184 + (30 - day));;
                        break;
                    case 7:
                        System.out.println(153 + (31 - day));;
                        break;
                    case 8:
                        System.out.println(122 + (31 - day));;
                        break;
                    case 9:
                        System.out.println(92 + (30 - day));;
                        break;
                    case 10:
                        System.out.println(61 + (31 - day));;
                        break;
                    case 11:
                        System.out.println(31 + (30 - day));;
                        break;
                    case 12:
                        System.out.println(31 - day);;
                        break;
                }
            }
            else System.out.println(-1);
        }else System.out.println(-1);
    }
}
