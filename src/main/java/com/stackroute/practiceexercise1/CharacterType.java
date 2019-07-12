package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class CharacterType {
    public String letterChecker(char inputCharacter){
        String letterType = "";
        if (Character.isAlphabetic(inputCharacter)) {
            if (Character.isUpperCase(inputCharacter)) {
                letterType = "Capital letter";
            } else if (Character.isLowerCase(inputCharacter)) {
                letterType = "Lowercase letter";
            }
        }
        else if (Character.isDigit(inputCharacter)){
            letterType = "Digit";
        }
        else {
            letterType = "Special symbol";
        }

        return letterType;
    }

}
