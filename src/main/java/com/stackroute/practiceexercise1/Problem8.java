package com.stackroute.practiceexercise1;

import java.util.Random;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a number to guess the target number");
        int inputNum = scanner.nextInt();
        int targetNum = random.nextInt(100) + 1;
        boolean boo = true;
        while (boo) {
            if (inputNum == targetNum) {
                System.out.println("Matches with the Original Number");
                boo = false;
            }
            else if (inputNum > targetNum){
                System.out.println("Entered Number Greater than the target number");
                inputNum = scanner.nextInt();
            }
            else{
                System.out.println("Entered Number lesser than the target number");
                inputNum = scanner.nextInt();
            }
        }
    }
}
