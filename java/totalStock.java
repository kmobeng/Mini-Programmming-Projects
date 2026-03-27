// A warehouse needs a program to audit their stock. You are tasked with writing a program in Java that processes items and identifies which ones need reordering.

// 1. *Constants & Setup:*
// • Create an array called stockLevels with 6 values: {12, 45, 8, 100, 3, 25}.
// • Initialize an int reorderCount = 0.
// • Initialize an int totalStock = 0.

// 2. *The Loop:*
// • Use a for loop to iterate through all 6 items in the warehouse.

// 3. *The Logic:*
// • For each item, check if the stock is less than 10.
// • If it is less than 10: * Print: "Item [i]: [stock] units - CRITICAL: Reorder immediately!".
// • Add 1 to your reorderCount.
// • If it is 10 or more: * Just print: "Item [i]: [stock] units - Stable".
// • Regardless of the amount, add the current stock to your totalStock variable.

// 4. *Final Summary:*
// • After the loop, print the Total Units in Warehouse.
// • Print the Total Number of Items to Reorder.

public class TotalStock {
    public static void main(String[] args) {
        int stockLevels[] = { 12, 45, 8, 100, 3, 25 };
        int reorderCount = 0, totalStock = 0;

        for (int i = 0; i < stockLevels.length; i++) {
            if (stockLevels[i] < 10) {
                System.out.println("Item" + (i + 1) + ": " + stockLevels[i] + " units - CRITICAL: Reorder immediately!");
                reorderCount += 1;
                totalStock += stockLevels[i];
            } else {
                System.out.println("Item" + (i + 1) + ": " + stockLevels[i] + " units - Stable");
                totalStock += stockLevels[i];
            }
        }

        System.out.println("The total units in the warehouse is " + totalStock);
        System.out.println("The total number of items to reoder is " + reorderCount);
    }
}
