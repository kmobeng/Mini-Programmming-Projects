import java.util.Scanner;

public class SumInput {
    Scanner input = new Scanner(System.in);

    public double getFirstNumber(){
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();
        return num1;
    }

    public double getSecondNumber(){
        System.out.println("Enter first number: ");
        double num2 = input.nextDouble();
        return num2;
    }
}