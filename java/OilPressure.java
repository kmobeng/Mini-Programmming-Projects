// A drilling rig extracts oil in "bursts." Each burst yields a certain amount of oil but also increases the "Pressure Stress" on the drill bit. If the pressure exceeds a safety limit, the drill must stop immediately to prevent a blowout. Write a program in Java for the following technical specifications:

// 1. *Variables:*
// • double totalOil = 0.0.
// • double pressureStress = 10.0 (Starting base pressure).
// • int burstCount = 0.
// • final double MAX_PRESSURE = 85.0.

// 2. *The Loop:*
// • Use a do-while loop to simulate the drilling bursts.

// 3. *The Logic:*
// • Action: For every burst, ask the user: "Enter oil yield for Burst [n]: ".
// • Accumulation: Add the yield to totalOil.
// • Pressure Increase: For every 10 liters of oil extracted, the pressureStress increases by 5.0 units. (Formula: pressureStress = pressureStress + (yield / 10.0 * 5.0)).
// • Termination: The loop continues only if the pressureStress is less than MAX_PRESSURE.

// 4. *Final Summary:*
// • Print the total oil extracted.
// • Print the final pressure level.
// • If the loop stopped due to pressure, print: "EMERGENCY SHUTDOWN: Pressure limit reached!".

import java.util.Scanner;

public class OilPressure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalOil = 0.0, pressureStress = 10.0;
        int burstCount = 0;
        final double MAX_PRESSURE = 85.0;

        do {
            burstCount++;
            System.out.print("Enter oil yield for Burst " + burstCount + ": ");
            double amount = input.nextDouble();

            totalOil += amount;

            pressureStress += (amount / 10.0) * 5.0;
        } while (pressureStress < MAX_PRESSURE);

        System.out.println("Total oil extracted: " + totalOil);
        System.out.println("Final pressure level: " + pressureStress);

        if (pressureStress >= MAX_PRESSURE) {
            System.out.println("EMERGENCY SHUTDOWN: Pressure limit reached!");
        }

        input.close();
    }
}
