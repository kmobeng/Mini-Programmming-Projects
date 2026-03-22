// Write a program in JAVA that creates 10 elements array and assign each element with one of the even integers from 2 to 20(i.e 2,4,6,8,...20). Compute the average and find the factorial of the average. Your program must accept the numbers (1,2,3,4,5, ... 20) as inputs from the user and determine the even integers. Compute the square root of the factorial result obtained.Find the standard deviation of the square root output and the factorial results

import java.util.Scanner;

public class StandardDeviation {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int [] evenNumbers = new int[10];
        int sum = 0;

        Scanner input = new Scanner(System.in);

        int count = 0;
        while (count < 10) {
            System.out.print("Enter an integer (1-20): ");
            int number = input.nextInt();

            if (number >= 1 && number <= 20 && number % 2 == 0) {
                evenNumbers[count] = number;
                sum += number;
                count++;
            } else {
                System.out.println("Please enter an even integer between 1 and 20.");
            }
        }

        int average = sum / evenNumbers.length;

        int factorialResult = factorial(average);

        double sqrtFactorial = Math.sqrt(factorialResult);

        double mean = (sqrtFactorial + factorialResult) / 2;

        double variance = (Math.pow(sqrtFactorial - mean, 2) + Math.pow(factorialResult - mean, 2)) / 2;
        double standardDeviation = Math.sqrt(variance);
        System.out.println("Average: " + average);
        System.out.println("Factorial of Average: " + factorialResult);
        System.out.println("Square Root of Factorial: " + sqrtFactorial);
        System.out.println("Standard Deviation: " + standardDeviation);

        input.close();
    }

}
