// Write a program that will predict the size of a population of organisma. The program should ask for the starting number of organisms, their average daily population increase(as a percentage), and the number of days they will multiply. For example, a population might begin with two organisms, have an average daily increase of 50 percent, and will be allowed to multiply for seven days. The program should use a loop to display the size of the population for each day.
// Input Validation: Do not accept a number less than 2 for the starting size of the population. Do not accept a number less than 1 for the number of days they will multiply.

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startingOrganisms;
        do {
            System.out.print("Enter the starting number of organisms (min 2): ");
            startingOrganisms = input.nextInt();
            if (startingOrganisms < 2)
                System.out.println("Please enter a number of 2 or more.");
        } while (startingOrganisms < 2);

        double dailyIncrease;
        do {
            System.out.print("Enter the average daily population increase (as a percentage): ");
            dailyIncrease = input.nextDouble();
            if (dailyIncrease < 0)
                System.out.println("Please enter a non-negative percentage.");
        } while (dailyIncrease < 0);

        int days;
        do {
            System.out.print("Enter the number of days they will multiply (min 1): ");
            days = input.nextInt();
            if (days < 1)
                System.out.println("Please enter a number of 1 or more.");
        } while (days < 1);

        System.out.println("Day 0: " + startingOrganisms);
        double population = startingOrganisms;
        for (int i = 1; i <= days; i++) {
            population += population * (dailyIncrease / 100);
            System.out.println("Day " + i + ": " + Math.round(population));
        }

        input.close();
    }
}