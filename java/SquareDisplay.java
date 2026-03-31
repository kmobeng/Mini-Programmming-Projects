// Write a program that asks the user for a positive integer no greater than 15. The program should then display a square on the screen using the character 'X'. The number entered by the user will be the length of each side of the square. For example, if the user enters 5, the program should display the following output:
// X X X X X
// X X X X X
// X X X X X
// X X X X X
// X X X X X

// If the user enters 8, the program should display the following output:
// X X X X X X X X
// X X X X X X X X
// X X X X X X X X
// X X X X X X X X
// X X X X X X X X
// X X X X X X X X
// X X X X X X X X
// X X X X X X X X

import java.util.Scanner;

public class SquareDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        do {
            System.out.print("Enter a positive integer (1-15): ");
            size = input.nextInt();
            if (size < 1 || size > 15)
                System.out.println("Please enter a number between 1 and 15.");
        } while (size < 1 || size > 15);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }

        input.close();
    }
}
