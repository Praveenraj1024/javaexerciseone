package com.stackroute.practiceexercise1;

public class JunitDemo {
    public String concatAndUppercase(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return "Null Value Not Allowed";
        }
        String concatedString = str1.concat(str2);
        return concatedString.toUpperCase();
    }

    public String reverseString(String str) {
        String reverseOfString = "";
        try {
            for (int i = str.length() - 1; i >= 0; i--) {
                reverseOfString = reverseOfString.concat(String.valueOf(str.charAt(i)));

            }
        } catch (NullPointerException ex) {
            reverseOfString = ex.toString();
            System.out.println(ex.toString());
            return ex.toString();
        }
        return reverseOfString;
    }
}
