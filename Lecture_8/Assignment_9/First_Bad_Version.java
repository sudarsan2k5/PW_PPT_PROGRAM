public class First_Bad_Version {
    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // Placeholder for the isBadVersion API provided by the system
    private static boolean isBadVersion(int version) {
        // Implementation not shown
        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        int firstBadVersion = firstBadVersion(n);

        // Printing the result
        System.out.println(firstBadVersion); // Output: 4
    }
}
