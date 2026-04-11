// Design a TestScores class that has fiels to hold three test scores. The class should have a constructor, accessor and mutator methods for the test score fields, and a method that returns the average of the test scores. Demonstrate the class by writing a separate program that creates an instance of the class. The program should ask the user to enter three test scores, which are stored in the TestScores object. Then the program should display the average of the scores, as reported bu the TestScores object.

import java.util.Scanner;

public class TestScoresClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TestScores testScores = new TestScores();

        System.out.print("Enter score 1: ");
        testScores.setScore1(input.nextDouble());

        System.out.print("Enter score 2: ");
        testScores.setScore2(input.nextDouble());

        System.out.print("Enter score 3: ");
        testScores.setScore3(input.nextDouble());

        System.out.println("Average test score: " + testScores.getAverage());

        input.close();
    }
}

class TestScores {
    private double score1;
    private double score2;
    private double score3;

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getAverage() {
        return (score1 + score2 + score3) / 3;
    }
}