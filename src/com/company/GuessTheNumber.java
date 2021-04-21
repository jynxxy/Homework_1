package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        System.out.println(numberToGuess);

        Scanner input = new Scanner(System.in);
        System.out.print("Hi! Enter a number between 0 and 99. Please enter your number: ");

        for (int i = 5; i > 0; i--) {
            int numberFromPlayer = input.nextInt();
            if (numberFromPlayer > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess");
                System.out.println("You have " + (i - 1) + " tries left. Please try again");
            } else if (numberFromPlayer < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess");
                System.out.println("You have " + (i - 1) + " tries left. Please try again");
            } else if (numberFromPlayer == numberToGuess) {
                System.out.println("You guessed it!");
                break;
            }
            if (i == 1) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
            }
        }
    }
}
