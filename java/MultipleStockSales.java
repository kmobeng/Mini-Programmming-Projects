// public static double calculateProfit(int numberOfShares, double purchasePricePerShare, double purchaseCommissionPaid, double salePricePerShare, double saleCommissionPaid) {
//         return ((numberOfShares * salePricePerShare) - saleCommissionPaid) - ((numberOfShares * purchasePricePerShare) + purchaseCommissionPaid);
//     }
// Use the method in a program that calculates the total profit or loss from the sale of multiple stocks. The program should ask the user for the number of stock sales, and the necessary data for each stock sale. It should accumulate the profit or loss for each stock sale and the display the total.

import java.util.Scanner;

public class MultipleStockSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of stock sales: ");
        int numberOfSales = input.nextInt();
        double totalProfit = 0;

        for (int i = 0; i < numberOfSales; i++) {
            System.out.println("Stock Sale " + (i + 1) + ":");
            System.out.print("Enter the number of shares: ");
            int numberOfShares = input.nextInt();
            System.out.print("Enter the purchase price per share: ");
            double purchasePricePerShare = input.nextDouble();
            System.out.print("Enter the purchase commission paid: ");
            double purchaseCommissionPaid = input.nextDouble();
            System.out.print("Enter the sale price per share: ");
            double salePricePerShare = input.nextDouble();
            System.out.print("Enter the sale commission paid: ");
            double saleCommissionPaid = input.nextDouble();

            double profit = StockProfit.calculateProfit(numberOfShares, purchasePricePerShare, purchaseCommissionPaid,
                    salePricePerShare, saleCommissionPaid);
            totalProfit += profit;
        }

        if (totalProfit > 0) {
            System.out.println("Total profit from all stock sales: " + totalProfit);
        } else if (totalProfit < 0) {
            System.out.println("Total loss from all stock sales: " + -totalProfit);
        } else {
            System.out.println("No profit or loss from all stock sales.");
        }

        input.close();
    }
}
