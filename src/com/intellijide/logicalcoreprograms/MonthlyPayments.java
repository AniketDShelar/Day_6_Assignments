package com.intellijide.logicalcoreprograms;

import java.util.Scanner;

public class MonthlyPayments {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter principal ,year and rate");
        double p = s.nextDouble();
        double y = s.nextDouble();
        double r = s.nextDouble();
        s.close();
        System.out.println("mothly payment is " + Util.monthlyPayment(p, y, r));
    }
}