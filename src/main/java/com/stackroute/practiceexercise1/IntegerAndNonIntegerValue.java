package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class IntegerAndNonIntegerValue {
    public String  sumOfIntegerValue(String inputStringNumbers){
        String[] arrayOfStringNumber = inputStringNumbers.split(" ");
        boolean boo = true;
        int sum = 0;
        for (String str: arrayOfStringNumber) {
            for (int i = 0; i < str.length(); i++){
                if ( (!(Character.isDigit(str.charAt(i)))) &&
                        (str.charAt(i) != '-') &&
                        (str.charAt(i) != '+')){
                    System.out.println(str.charAt(i));
                    boo = false;
                }

            }
        }
        if (boo){
            for (String str: arrayOfStringNumber){
                sum += Integer.parseInt(str);
            }
            return String.valueOf(sum);
        }
        else {
            return "Non Integer Value";
        }
    }

}
