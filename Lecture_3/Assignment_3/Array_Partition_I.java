import java.util.Arrays;

public class Array_Partition_I {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int maxSum = arrayPairSum(nums);
        System.out.println(maxSum);  // Output: 4
    }
}

