package com.intellijide.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.print("Enter value of n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
}
