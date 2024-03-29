package com.stackroute.practiceexercise1;

import java.util.Scanner;
import java.lang.*;

public class Palindrome  {
    public String palindromeSum(long inputNum){
        /*
        Checks whether the received number is palindrome or not.
        If it is palindrome, then it checks whether the sum of even digits are greater
        than 25 or not. I yes, returns "Palindrome and greater than 25" else returns
        "Palindrome and smaller than 25"
        If it is not a palindrome, then this method will return Not a palindrome.
         */
        String returnResult = "Not a palindrome";
        if (isPalindrome(inputNum)) {
            if ( (isSumOfEvenNum(inputNum) > 25) ) {
                returnResult = "Palindrome and greater than 25";
            }
            else {
                returnResult = "Palindrome and smaller than 25";
            }
        }
        return returnResult;
    }

    private boolean isPalindrome(long number){
        /*
        Checks whether the accepted number is palindrome or not.
         */
        String str = "";
        String stringNum = String.valueOf(number);
        boolean boo = false;
        for (int i = stringNum.length() -1; i >=0; i--){
            str = str.concat( String.valueOf(stringNum.charAt(i)) );
        }
        if (str.equals(stringNum)) boo = true;
        return boo;
    }

    private int isSumOfEvenNum(long number){
        /*
        Returns the sum of Even Digits.
         */
        int sumOfEvenNum = 0;
        long localNumber = number;
        while (localNumber > 0){
            if ( (localNumber % 10) % 2 == 0 ){
                sumOfEvenNum += localNumber % 10;
            }
            localNumber = localNumber / 10;
        }
        return sumOfEvenNum;
    }
}
