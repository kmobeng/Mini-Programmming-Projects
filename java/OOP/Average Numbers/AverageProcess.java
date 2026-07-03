public class AverageProcess {
    private double sum = 0;
    public double getAverage(double num[]){
        for (double n : num) {
            sum += n;
        }
        return sum/num.length;
    }
}
