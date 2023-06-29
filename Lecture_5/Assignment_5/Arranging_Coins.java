public class Arranging_Coins {
    public static int arrangeCoins(int n) {
        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sum = (long) mid * (mid + 1) / 2; // Calculate the sum as a long to avoid overflow

            if (sum > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = arrangeCoins(n);
        System.out.println(result);
    }
}
