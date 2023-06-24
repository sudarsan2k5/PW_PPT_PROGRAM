public class Shuffle_the_Array {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            result[idx++] = nums[i];
            result[idx++] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] shuffledArray = shuffle(nums, n);
        for (int num : shuffledArray) {
            System.out.print(num + " "); // Output: 2 3 5 4 1 7
        }
    }
}
