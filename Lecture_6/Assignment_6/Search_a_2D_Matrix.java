public class Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int midIndex = (left + right) / 2;
            int midRow = midIndex / n;
            int midCol = midIndex % n;
            int midValue = matrix[midRow][midCol];

            if (target == midValue) {
                return true;
            } else if (target < midValue) {
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;

        boolean found = searchMatrix(matrix, target);
        System.out.println(found);
    }
}
