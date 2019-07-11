package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        System.out.println(reverseString(inputString));
    }

    private static String reverseString(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse.concat(String.valueOf(str.charAt(i)));
        }
        return reverse;
    }
}
