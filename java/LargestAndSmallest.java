// Write a program with a loop that lets the user enter a series of integers. The user should enter -99 to signal the end of the series. After all the numbers have been entered, the program should display the largest and smallest numbers entered

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter an integer (-99 to end): ");
            number = input.nextInt();

            if (number == -99) break;

            if (number > largest)  largest = number;
            if (number < smallest) smallest = number;
        }

        if (largest == Integer.MIN_VALUE && smallest == Integer.MAX_VALUE) {
            System.out.println("No valid numbers were entered.");
        } else {
            System.out.println("Largest number entered:  " + largest);
            System.out.println("Smallest number entered: " + smallest);
        }

        input.close();
    }
}