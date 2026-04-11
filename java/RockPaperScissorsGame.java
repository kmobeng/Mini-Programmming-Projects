// Write a program that lets the user play the game of Rock, Paper,Scissors against the computer. The program should work as follows:
// When the program begins, a random number in the range of 1 through 3 is generated. If the number is 1, the computer has chosen rock. If the number is 2, the computer has chosen paper. If the number is 3, the computer has chosen scissors. (Don't display the computer's choice to the user at this point.)
// The user enters his or her choice of rock, paper, or scissors. (You can use a menu if you prefer.)
// The computer's choice is displayed. 
// A winner is selected according to the following rules:
// if one player chooses rock and the other player chooses scissors, rock wins. (Rock smashes scissors.)
// if one player chooses scissors and the other player chooses paper, scissors wins. (Scissors cut paper.)
// if one player chooses paper and the other player chooses rock, paper wins. (Paper wraps rock.)
// if both players make the same choice, the game must be played again to determine the winner.

// Be sure to divide the program into methods that perform each of the major tasks. 

import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] choices = { "rock", "paper", "scissors" };
        while (true) {
            int randomIndex = (int) (Math.random() * choices.length);
            String computerChoice = choices[randomIndex];

            String userChoice;
            while (true) {
                System.out.print("Enter your choice (rock, paper, scissors): ");
                userChoice = input.nextLine().trim().toLowerCase();

                if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
                    break;
                }

                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
            }

            displayComputerChoice(computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            if (!result.equals("It's a tie! Let's play again."))
                break;
        }

        input.close();
    }

    static void displayComputerChoice(String computerChoice) {
        System.out.println("Computer chose: " + computerChoice);
    }

    static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice))
            return "It's a tie! Let's play again.";

        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")))
            return "You win!";

        return "Computer wins! Try again.";
    }
}