import java.util.Arrays;
public class Maximum_Product_of_Three_Numbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;

        int product1 = nums[length - 1] * nums[length - 2] * nums[length - 3];
        int product2 = nums[0] * nums[1] * nums[length - 1];

        return Math.max(product1, product2);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxProduct = maximumProduct(nums);
        System.out.println(maxProduct);
    }
}
