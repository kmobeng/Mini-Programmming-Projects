public class SumIntegration {
    public static void main(String[] args) {
        SumInput input = new SumInput();
        SumProcess process = new SumProcess();
        ResultsOutput results = new ResultsOutput();

        double num1 = input.getFirstNumber();
        double num2 = input.getSecondNumber();

        double sum = process.sumNumber(num1, num2);

        results.displayMessage(sum);
    }
}
