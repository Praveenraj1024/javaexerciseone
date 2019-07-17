package com.stackroute.practiceexercise1;


public class IntegerAndNonIntegerValue {
    public String  sumOfIntegerValue(String inputStringNumbers){
        /*
        Accepts the Numbers as String.
        If all the numbers are valid then returns the sum of it.
        Else return "Non integer value".
         */
        String[] arrayOfStringNumber = inputStringNumbers.split(" ");
        boolean boo = true;
        int sum = 0;
        for (String str: arrayOfStringNumber) {
            for (int i = 0; i < str.length(); i++){
                if ( (!(Character.isDigit(str.charAt(i)))) &&
                        (str.charAt(i) != '-') &&
                        (str.charAt(i) != '+')){
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
