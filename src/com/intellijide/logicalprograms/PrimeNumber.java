package com.intellijide.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean result = false;
        System.out.println("Enter number -> ");
        int n = scan.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = true;
                break;
            }
        }
        if(!result){
            System.out.println(n + " is a Prime number");
        }else{
            System.out.println(n + " is not Prime number");
        }
    }
}
