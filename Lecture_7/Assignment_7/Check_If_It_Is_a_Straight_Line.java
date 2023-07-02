public class Check_If_It_Is_a_Straight_Line {
    public static boolean checkStraightLine(int[][] coordinates) {
        int[] point1 = coordinates[0];
        int[] point2 = coordinates[1];
        double slope = calculateSlope(point1, point2);

        for (int i = 2; i < coordinates.length; i++) {
            int[] currentPoint = coordinates[i];
            double currentSlope = calculateSlope(point1, currentPoint);
            if (currentSlope != slope) {
                return false;
            }
        }

        return true;
    }

    public static double calculateSlope(int[] point1, int[] point2) {
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];

        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY;
        }

        return (double) (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        System.out.println(checkStraightLine(coordinates)); // Output: true
    }
}
