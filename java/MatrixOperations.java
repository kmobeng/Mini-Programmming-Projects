import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 5;
        int cols = 4;
        int[][] N = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for row " + (i + 1) + ", column " + (j + 1) + ": ");
                N[i][j] = input.nextInt();
            }
        }

        int total = 0;
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                total += N[i][j];
                rowSum += N[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        double average =(double) total / (rows * cols);
        System.out.println("Average of all elements: " + average);

        int leadingProduct = 1;
        for (int i = 0; i < 4; i++)
            leadingProduct *= N[i][i];

        System.out.println("Product of leading diagonal: " + leadingProduct);

        int trailingProduct = 1;
        for (int i = 0; i < 4; i++) {
            trailingProduct *= N[i][cols - 1 - i];
        }

        int difference = leadingProduct - trailingProduct;
        System.out.println("Trailing diagonal product: " + trailingProduct);
        System.out.println("Leading - Trailing: " + difference);

        input.close();
    }
}