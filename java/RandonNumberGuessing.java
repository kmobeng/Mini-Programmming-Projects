// Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display "Too high,try again." If the user's guess is lower than the random number, the program should display "Too low, try again." The program should use a loop that repeats until the user correctyl guesses the random number

import java.util.Scanner;

public class RandonNumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isNumber = false;
        int number = (int) (Math.random() * 100) + 1;
        int counter = 0;

        do {
            System.out.print("Enter a number: ");
            int userInput = input.nextInt();
            if (userInput > number) {
                System.out.println("Too high, try again.");
            } else if (userInput < number) {
                System.out.println("Too low, try again");
            } else {
                isNumber = true;
                System.out.println("Congratulations! You guessed the number in " + counter + " attempts.");
            }
            counter++;
        } while (!isNumber);

        input.close();
    }
}
