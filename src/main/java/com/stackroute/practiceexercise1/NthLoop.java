package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class NthLoop {

    public int[] printer(int num){
        int size = 0;
        int index = 0;
        for (int i = 1; i <= num; i++) size += i;
        int[] resultArray = new int[size];
        for (int i = 1; i <= num; i++){
            for (int j = 0; j < i; j++) {
                resultArray[index] = i;
                index++;
            }
        }
        return resultArray;
    }
}
