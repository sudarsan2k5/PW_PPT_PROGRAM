import java.util.Arrays;
import java.util.Scanner;

public class Array_Partition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int maxSum = arrayPairSum(arr);
        System.out.println(maxSum);
    }
}
