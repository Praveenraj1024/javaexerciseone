package com.stackroute.practiceexercise1;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerDigitSum {
    public boolean sortedSumOfInteger(int inputInteger){
        String inputIntegerInString = String.valueOf(inputInteger);
        boolean boo = false;
        int[] arrayOfSortedDigits;
        int sum = 0;
        arrayOfSortedDigits = sortedArray(inputIntegerInString);
        for (int num: arrayOfSortedDigits) {
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
