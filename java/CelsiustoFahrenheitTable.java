// write a program that displays a table of the Celsius temperatures 0 through 20 and their Fahrenheit equivalents. The formula for converting Celsius to Fahrenheit is F = (9/5) * C + 32 where F is the Fahrenheit temperature and C is the Celsius temperature. Your program must use a loop to display the table.


public class CelsiustoFahrenheitTable {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        for (int celsius = 0; celsius <= 20; celsius++) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println(celsius + "\t" + fahrenheit);
        }
    }
}
