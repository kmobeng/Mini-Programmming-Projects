// Write a program that uses nested loops to collect data and calculate the average rainfall over a period of years. First the program should ask for the number of years. The outer loop will iterate once for each year. The inner loop will iterate 12 times, once for each month. Each iteration of the inner loop will ask the user for the inches of rainfall for that month. After all iterations, the program should display the number of months, the total inches of rainfall, and the average rainfall per month for the entire period.
// Input Validation: Do not accept a number less than 1 for the number of years. Do not accept negative numbers for the monthly rainfall

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int years;

        do {
            System.out.print("Enter the number of years: ");
            years = input.nextInt();
            if (years < 1) {
                System.out.println("Please enter a number greater than 0.");
            }
        } while (years < 1);

        double totalRainfall = 0.0;
        int totalMonths = years * 12;

        for (int i = 0; i < years; i++) {
            for (int j = 0; j < 12; j++) {
                double numOfInches;
                do {
                    System.out.print("Enter rainfall for Year " + (i + 1) + ", Month " + (j + 1) + ": ");
                    numOfInches = input.nextDouble();
                    if (numOfInches < 0)
                        System.out.println("Rainfall cannot be negative. Try again.");
                } while (numOfInches < 0);

                totalRainfall += numOfInches;
            }
        }

        System.out.println("The total number of months is " + totalMonths);
        System.out.println("The total inches of rainfall is " + totalRainfall);
        double averageRainfall = totalRainfall / totalMonths;
        System.out.println("The average rainfall per month is " + averageRainfall);
        input.close();
    }
}
