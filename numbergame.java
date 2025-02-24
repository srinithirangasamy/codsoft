package javacodesoftintern;

import java.util.Random;
import java.util.Scanner;

public class numbergame 
{
    public static void main (String []args)
    {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1, upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0, maxAttempts = 3;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                guessedCorrectly = true;
                break;
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + randomNumber + ".");
        }

        System.out.println("Game Over.");
        scanner.close();
    }
}


    

     
    

