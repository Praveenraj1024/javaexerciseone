package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class TomAndJerry {

    public String tomOrJerryFinder(int inputNum) {
        /*
        Returns Jerry, if the given number is between 20 and 30 (inclusive)
        and dividable by 2.
        Returns Tom, if the given number is between 20 and 30 (inclusive)
        and not dividable by 2.
        Else it will return "Not in between 20 and 30".
         */
        String returnString = "Not in between 20 and 30";
        if (isBetween20And30(inputNum)){
            if (inputNum % 2 == 0){
                returnString = "Jerry";
            }
            else {
                returnString = "Tom";
            }
        }
        return returnString;
    }

    private static boolean isBetween20And30(int num){
        /*
        Returns true if the accepted number is greater than or equal to 20 and lesser than
        or equal to 30.
        else it will return false.
         */
        boolean boo = false;
        if ( (num >= 20) && (num <= 30) ){
            boo = true;
        }
        return boo;
    }
}
