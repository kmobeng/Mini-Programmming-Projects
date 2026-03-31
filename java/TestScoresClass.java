// Design a TestScores class that has fiels to hold three test scores. The class should have a constructor, accessor and mutator methods for the test score fields, and a method that returns the average of the test scores. Demonstrate the class by writing a separate program that creates an instance of the class. The program should ask the user to enter three test scores, which are stored in the TestScores object. Then the program should display the average of the scores, as reported bu the TestScores object.

import java.util.Scanner;

public class TestScoresClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TestScores testScores = new TestScores();

        for (int i = 1; i <= 3; i++) {
            double score;
            do {
                System.out.print("Enter test score " + i + ": ");
                score = input.nextDouble();
                if (score < 0 || score > 100)
                    System.out.println("Test score must be between 0 and 100. Try again.");
            } while (score < 0 || score > 100);

            testScores.setScore(i, score);
        }

        System.out.println("Average test score: " + testScores.getAverage());

        input.close();
    }
}

class TestScores {
    private double score1;
    private double score2;
    private double score3;

    public void setScore(int testNumber, double score) {
        switch (testNumber) {
            case 1:
                this.score1 = score;
                break;
            case 2:
                this.score2 = score;
                break;
            case 3:
                this.score3 = score;
                break;
            default:
                System.out.println("Invalid test number. Please enter 1, 2, or 3.");
        }
    }

    public double getAverage() {
        return (score1 + score2 + score3) / 3;
    }
}