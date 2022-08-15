package com.intellijide.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to reverse ->");
        int number = scan.nextInt();
        for(;number != 0;){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reversed number is = "+reverse);
    }
}
