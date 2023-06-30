import java.util.Arrays;

public class Minimum_Product_Sum_with_Rearrangement {
    public static int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int left = 0;
        int right = nums1.length - 1;
        int minProductSum = 0;

        while (left < nums1.length) {
            minProductSum += nums1[left] * nums2[right];
            left++;
            right--;
        }

        return minProductSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 3, 4, 2};
        int[] nums2 = {4, 2, 2, 5};
        int minProductSum = minProductSum(nums1, nums2);
        System.out.println(minProductSum);
    }
}
