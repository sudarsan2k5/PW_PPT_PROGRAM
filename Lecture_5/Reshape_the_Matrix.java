import java.util.Arrays;

public class Reshape_the_Matrix {
    public static int[][] convertTo2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];

        for (int i = 0; i < original.length; i++) {
            int row = i / n;
            int col = i % n;
            result[row][col] = original[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] result = convertTo2DArray(original, m, n);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
