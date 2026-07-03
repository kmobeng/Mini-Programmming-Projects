public class GradeIntegration {
    public static void main(String[] args) {
        GradeInput nIn = new GradeInput();
        GradeProcessing gP = new GradeProcessing();
        ResultsOutput results = new ResultsOutput();

        results.displayMessage(gP.calcAverage(nIn.getNumber()));
        results.displayMessage(gP.calcStandardDeviation(nIn.getNumber()));
    }
}
