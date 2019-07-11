package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        printer(inputNum);
    }

    private static void printer(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
