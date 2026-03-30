// Write a program that tests your ESP(extrasensory perception). The program should randomly select the name of a color from the following list of words:
// red,green,blue,orange,yellow
// To select a word, the program can generate a random number. For example, if the number is 0, the selected word is Red, if the number is 1, the selected word is Green, and so forth.
// Next, the program should ask the user to enter the color that the computer has selected. After the user has entered his or her guess, the program should display the name of the randomly selected color. The program should repeat this 10 times and then display the number of times the user correctly guessed the selected color.

import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] colors = {"red", "green", "blue", "orange", "yellow"};
        int correctGuesses = 0;

        for (int i = 0; i < 10; i++) {
            int randomIndex = (int) (Math.random() * colors.length);
            String selectedColor = colors[randomIndex];

            System.out.print("Guess the color (red, green, blue, orange, yellow): ");
            String userGuess = input.nextLine().toLowerCase();

            if (userGuess.equals(selectedColor)) {
                correctGuesses++;
                System.out.println("Correct! The selected color was " + selectedColor);
            } else {
                System.out.println("Wrong! The selected color was " + selectedColor);
            }
        }
        System.out.println("You guessed correctly " + correctGuesses + " out of 10 times.");
        input.close();
    }
}
