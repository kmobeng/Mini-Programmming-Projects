// A retail store is running a promotion where expensive items get a special discount. You need to write a Java program to help the cashier calculate the customer's final bill.

// 1. *Data Setup:*
// • Create a double array containing the prices of 4 items: {15.0, 55.0, 120.0, 200.0}.
// • Initialize a double totalBill = 0.0.

// 2. *Iterative Logic:*
// • Use a for loop to process each item in the array.

// 3. *The Discount Rule:*
// • For each item, check if the price is above $100.
// • If it is, apply a 20% discount to that specific item before adding it to the total.
// • If the price is $100 or less, add the original price to the total.

// 4. *Output:*
// • For every item, print the item number and the final price paid for that item.
// • If a discount was applied, print: " (20% Discount Applied!)".
// • After the loop, print the Total Bill Amount.

public class TotalBill {
    public static void main(String[] args) {
        double prices[] = { 15.0, 55.0, 120.0, 200.0 };
        double totalBill = 0.0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 100.0) {
                prices[i] *= 0.8;
                totalBill += prices[i];
                System.out.println("Item " + (i + 1) + " = " + prices[i] + " (20% Discount Applied!)");
            } else {
                totalBill += prices[i];
                System.out.println("Item " + (i + 1) + " = " + prices[i]);
            }
        }

        System.out.println("Total Bill: " + totalBill);
    }
}
