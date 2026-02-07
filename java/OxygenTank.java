// A deep-sea research station has a limited supply of oxygen. Every time a scientist enters the water, they use a different amount based on the duration of their dive. You are required to write a program in Java to perform the following technical specifications:

// 1. *Initial Setup:*
// • Start with a double oxygenTank = 500.0 (Liters).
// • Initialize an int diverCount = 0 to track how many successful dives occurred.

// 2. *The Loop:*
// • Use a while loop that continues as long as oxygenTank is greater than 50.0 (the safety reserve).

// 3. *The Logic:*
// • Inside the loop, prompt the user: "Enter oxygen needed for next dive: ".
// • Check for Safety: If the requested oxygen is more than what is currently in the tank, print: "Insufficient oxygen for this dive!" and use the break keyword to end the session.
// • Process Dive: If safe, subtract the amount from oxygenTank and add 1 to diverCount.
// • Status Alert: If the tank drops below 150.0, print: "WARNING: Oxygen level at [amount] - Return to surface soon.".

// 4. *Final Summary:*
// • After the loop finishes, print: "Total Successful Dives: [diverCount]".
// • Print: "Remaining Oxygen: [oxygenTank] Liters".

import java.util.Scanner;

public class OxygenTank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double oxygenTank = 500.0;
        int diverCount = 0;
        double neededOxygen;

        while (oxygenTank > 50.0) {
            System.out.print("Enter oxygen needed for next dive: ");
            neededOxygen = input.nextDouble();
            if (neededOxygen > oxygenTank) {
                System.out.println("Insufficient oxygen for this dive!");
                break;
            }

            oxygenTank -= neededOxygen;
            diverCount++;
            if (oxygenTank < 150.0) {
                System.out.println("WARNING: Oxygen level at " + oxygenTank + " - Return to surface soon.");
            }
        }
        ;

        System.out.println("Total Successful Dives: " + diverCount);
        System.out.println("Remaining Oxygen: " + oxygenTank + " Liters");
        input.close();
    }
}
