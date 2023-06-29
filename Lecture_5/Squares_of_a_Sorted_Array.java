import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] output = sortedSquares(nums);
        System.out.println(Arrays.toString(output));
    }
}
