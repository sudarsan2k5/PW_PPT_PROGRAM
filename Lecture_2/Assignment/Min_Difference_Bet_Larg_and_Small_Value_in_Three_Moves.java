public class Min_Difference_Bet_Larg_and_Small_Value_in_Three_Moves {
    public static int minimumScore(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (max - min <= 2 * k) {
            return 0;
        }

        int potentialMin = min + k;
        int potentialMax = max - k;

        return potentialMax - potentialMin;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minimumScore(nums, k);
        System.out.println(minScore); // Output: 0
    }
}

