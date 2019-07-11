package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int length = scanner.nextInt();
        printer(inputString, length);
    }

    private static void printer(String str, int len){
        String subString = str.substring((str.length() - len));
        System.out.print(str);
        for (int i = 1; i <= len; i++){
            System.out.print(subString);
        }
    }
}
