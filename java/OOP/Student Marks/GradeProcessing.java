public class GradeProcessing {
    public double calcAverage(double[] grades) {
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        return sum / grades.length;
    }

    public double calcStandardDeviation(double[] grades){
        double average = calcAverage(grades);

        double sum = 0;

        for(int i = 0; i < grades.length; i++){
            sum += Math.pow(grades[i] - average, 2);
        }

        return Math.sqrt(sum / grades.length);
    }
}
