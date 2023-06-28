import java.util.Arrays;
public class Array_Partition_I {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // Add the minimum value from each pair
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int maxSum = arrayPairSum(nums);
        System.out.println(maxSum);
    }
}
