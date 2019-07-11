package com.stackroute.practiceexercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String inputNumString = scanner.next();
        System.out.println(sortingSum(inputNumString));
    }

    private static boolean sortingSum(String str){
        boolean boo = false;
        int[] ar;
        int sum = 0;
        ar = sortedArray(str);
        for (int num: ar) {
            if (num % 2 == 0){
                sum += num;
            }
        }
        if (sum > 15){
            boo = true;
        }
        return boo;
    }

    private static int[] sortedArray(String strAr){
        int[] ar = new int[strAr.length()];
        int[] ar1 = new int[strAr.length()];
        for (int i = 0; i < strAr.length(); i++){
            ar[i] = Integer.parseInt(String.valueOf(strAr.charAt(i)));
        }
        Arrays.sort(ar);
        for(int i = 0, j = strAr.length() -1; i < strAr.length(); i++, j--){
            ar1[i] = ar[j];
        }
        return ar1;
    }
}
