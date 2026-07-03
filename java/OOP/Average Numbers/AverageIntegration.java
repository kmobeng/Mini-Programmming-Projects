public class AverageIntegration{
    public static void main(String[] args) {
        AverageInput input = new AverageInput();
        AverageProcess process = new AverageProcess();
        AverageOutput output = new AverageOutput();

        double numbers[] = input.getNumber();

        double average = process.getAverage(numbers);

        output.result(average);
    }
}