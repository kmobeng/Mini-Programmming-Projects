// The profite from the sale of a stock can be calculated as follows: Profit = ((NS * SP) - SC) - ((NS * PP) + PC)
// where NS is the number of shares, PP is the purchase price per share, PC is the purchase commission paid, SP is the sale price per share, and SC is the sale commission paid. If the calculation yields a positive value, then the sale of the stock resulted in a profit. If the calculation yields a negative value, then the sale of the stock resulted in a loss.
// Write a method that accepts the number of shares, purchase price per share, purchase commission paid, sale price per share, and sale commission paid. The method should return the profit (or loss) from the sale of the stock. Demonstrate the method in a program that asks the uer to enter the neccessary data and displays the amount of the profit or loss.

import java.util.Scanner;

public class StockProfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

        double profit = calculateProfit(numberOfShares, purchasePricePerShare, purchaseCommissionPaid, salePricePerShare, saleCommissionPaid);
        if (profit > 0) {
            System.out.println("You made a profit of " + profit);
        } else if (profit < 0) {
            System.out.println("You incurred a loss of " +  -profit);
        } else {
            System.out.println("You broke even.");
        }
        input.close();
    }

    public static double calculateProfit(int numberOfShares, double purchasePricePerShare, double purchaseCommissionPaid, double salePricePerShare, double saleCommissionPaid) {
        return ((numberOfShares * salePricePerShare) - saleCommissionPaid) - ((numberOfShares * purchasePricePerShare) + purchaseCommissionPaid);
    }
}
