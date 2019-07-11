package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        char inputCharacter = scanner.next().charAt(0);
        System.out.println(letterChecker(inputCharacter));
    }

    private static String letterChecker(char ch){
        String letterType = "";
        if (Character.isAlphabetic(ch)) {
            if (Character.isUpperCase(ch)) {
                letterType = "Capital letter";
            } else if (Character.isLowerCase(ch)) {
                letterType = "Lowercase letter";
            }
        }
        else if (Character.isDigit(ch)){
            letterType = "Digit";
        }
        else {
            letterType = "Special symbol";
        }

        return letterType;
    }

}
