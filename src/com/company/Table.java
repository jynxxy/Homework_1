package com.company;

import java.util.Scanner;

public class Table {

    public static void main (String[] args) {
        System.out.println("Please set the size of table");
        Scanner size = new Scanner(System.in);
        int tableSize = size.nextInt();

        int[] table = new int[tableSize];
        int sum = 0;

        for (int i = 0; i < tableSize; i++) {
            System.out.println("Enter " + (i +1) + " value.");
            table[i] = size.nextInt();
            sum += table[i];
        }

        double average = (double) sum / tableSize;

        int max = table[0];
        for (int i = 0; i < tableSize; i++) {
            if (table[i] > max) {
                max = table[i];
            }
        }

        System.out.println("Average value of the entered numbers is: " + average);
        System.out.println("Maximum value of the entered numbers is: " + max);
    }
}
