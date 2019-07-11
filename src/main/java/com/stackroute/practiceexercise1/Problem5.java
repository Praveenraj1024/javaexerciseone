package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputStringNumbers = scanner.nextLine();
        String[] ar = inputStringNumbers.split(" ");
        sumOfNum(ar);
    }

    private static void sumOfNum(String[] strAr){
        boolean boo = true;
        int sum = 0;
        for (String str: strAr) {
            for (int i = 0; i < str.length(); i++){
                if ( !(Character.isDigit(str.charAt(i))) ){
                    boo = false;
                }

            }
        }
        if (boo){
            for (String str: strAr){
                sum += Integer.parseInt(str);
            }
            System.out.println(sum);
        }
        else {
            System.out.println("You entered a non integer value");
        }
    }

}
