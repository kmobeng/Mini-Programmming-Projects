public class CombinedTableElements {
    public static void main(String[] args) {
        int[][] combined = new int[2][6];
        int z = 0;

        int[][] x = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] y = { { 7, 8, 9 }, { 10, 11, 12 } };

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                combined[0][z] += x[i][j];
                combined[1][z] += y[i][j];
                z++;
            }
        }

        for (int a = 0; a < combined[0].length; a++) {
            System.out.println("columns " + (a + 1) + " combined is " + (combined[0][a] + combined[1][a]));
        }
    }
}