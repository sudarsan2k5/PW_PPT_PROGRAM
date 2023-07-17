public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int index = searchInsert(nums, target);

        // Printing the result
        System.out.println(index); // Output: 2

        target = 7;
        index = searchInsert(nums, target);

        // Printing the result
        System.out.println(index); // Output: 4
    }
}
