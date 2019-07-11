package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class TomAndJerry {

    public String tomOrJerryFinder(int inputNum) {
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
        boolean boo = false;
        if ( (num >= 20) && (num <= 30) ){
            boo = true;
        }
        return boo;
    }
}
