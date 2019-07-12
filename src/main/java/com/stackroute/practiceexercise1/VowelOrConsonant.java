package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class VowelOrConsonant {
    
    public String[] vowelOrConsonantChecker(String string){
        String[] returnResult = new String[string.length()];
        for(int i = 0; i <= string.length() - 1; i++){
            char ch = string.charAt(i);
            if(Character.isAlphabetic(ch)){
                if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                    || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U'){
                    returnResult[i] = "Vowel";
                }
                else {
                    returnResult[i] = "Consonant";
                }
            }
            else {
                returnResult[i] = "Not a letter";
            }
        }
        return returnResult;
    }
}
