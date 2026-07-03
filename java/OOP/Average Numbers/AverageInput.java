import java.util.Scanner;

public class AverageInput {
    private double numArr[];

    public AverageInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter: ");
        int num = input.nextInt();

        numArr = new double[num];

        for(int i = 0; i < num; i++){
            System.out.println("Enter number " + (i+1));
            numArr[i] = input.nextDouble();
        }
    }

    public double[] getNumber(){
        return numArr;
    }
}
