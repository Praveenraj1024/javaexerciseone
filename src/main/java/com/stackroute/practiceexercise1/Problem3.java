package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        vowelOrConsonant(inputString);
    }
    
    private static void vowelOrConsonant(String string){
        for(int i = 0; i <= string.length() - 1; i++){
            char ch = string.charAt(i);
            if(Character.isAlphabetic(ch)){
                if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                    || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U'){
                    System.out.println("Vowel");
                }
                else {
                    System.out.println("Consonant");
                }
            }
            else{
                System.out.println("Not a letter");
            }
        }
    }
}
