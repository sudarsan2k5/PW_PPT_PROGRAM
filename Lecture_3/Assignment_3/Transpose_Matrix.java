public class Transpose_Matrix {
    public static int[][] transpose(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[][] transpose = new int[numCols][numRows];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                transpose[col][row] = matrix[row][col];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] result = transpose(matrix);

        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

