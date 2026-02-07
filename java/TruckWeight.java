// A shipping company needs a program to help workers load a delivery truck. The truck has a specific weight limit, and the worker will enter the weight of each package until the truck is full or they choose to stop. You are required to write a program in Java that performs the following technical specifications:

// 1. *Variables:*
// • Set a double weightLimit = 1000.0 (kg).
// • Initialize double currentWeight = 0.0.
// • Initialize int packageCount = 0.

// 2. *The Loop:*
// • Use a while loop that continues as long as currentWeight is less than weightLimit.
// • Sentinel Value: If the user enters -1 for a package weight, the loop should stop immediately (this signifies the worker is done loading).

// 3. *The Logic:*
// • Inside the loop, prompt for the weight of the next package.
// • Validation: If the new package would put the truck over the weightLimit, display: "Package too heavy! Truck only has [remaining] kg of space left." and do not add it.
// • Accumulation: If the package fits and is not -1, add it to currentWeight and increment packageCount.

// 4. *Output:*
// • After the loop, display the Total Packages Loaded and the Final Weight on the truck.
// • If the truck is exactly at 1000.0 kg, display: "TRUCK AT MAXIMUM CAPACITY".

import java.util.Scanner;

public class TruckWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weightLimit = 1000.0, currentWeight = 0.0;
        int packageCount = 0;

        while (currentWeight < weightLimit) {
            System.out.print("Enter package weight: ");
            double packageWeight = input.nextDouble();
            if (packageWeight == -1) {
                break;
            } else {
                if (currentWeight + packageWeight > weightLimit) {
                    System.out.println("Package too heavy! Truck only has " + (weightLimit - currentWeight)
                            + " kg of space left.");
                } else {
                    currentWeight += packageWeight;
                    packageCount++;
                }
            }
        }

        System.out.println("Total packages loaded: " + packageCount);
        System.out.println("The final weight on the truck: " + currentWeight);
        if (currentWeight == weightLimit) {
            System.out.println("TRUCK AT MAXIMUM CAPACITY");
        }
        input.close();
    }
}
