import java.util.Scanner;

public class GradeInput {
    private double[] grades;

    public GradeInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students do you want to enter");
        int num = input.nextInt();

        grades = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the grade for student " + (i + 1));
            grades[i] = input.nextDouble();
        }
    }

    public double[] getNumber(){
        return grades;
    }
}