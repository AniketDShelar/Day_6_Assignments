package com.intellijide.logicalcoreprograms;
import java.util.Scanner;

public class VendingMachine {
    int I, TOTAL;
    int[] NOTES = { 1000, 500, 100, 50, 10, 5, 2, 1 };

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Amount you want to withdraw -> ");
        int value = scan.nextInt();
        vendingMachine.notes(value);
    }
    void notes(int value) {
        if (value / NOTES[I] != 0) {
            TOTAL += (value / NOTES[I]);
            System.out.println(NOTES[I] + " Rs Notes : " +value / NOTES[I]);
            value = value % NOTES[I];
        }
        I++;
        if (value == 0) {
            System.out.println("total notes :" + TOTAL);
            return;
        }
        notes(value);
    }
}