package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if (isBetween20And30(inputNum)){
            if (inputNum % 2 == 0){
                System.out.println("Jerry");
            }
            else {
                System.out.println("Tom");
            }
        }
        else {
            System.out.println("Not exist between 20 and 30");
        }
    }

    private static boolean isBetween20And30(int num){
        boolean boo = false;
        if ( (num > 20) && (num < 30) ){
            boo = true;
        }
        return boo;
    }
}
