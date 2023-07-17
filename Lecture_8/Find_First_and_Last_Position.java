public class Find_First_and_Last_Position {
    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;

        // Finding the starting position
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                start = mid;
                high = mid - 1; // Search in the left half
            } else if (nums[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        // Finding the ending position
        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                end = mid;
                low = mid + 1; // Search in the right half
            } else if (nums[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return new int[]{start, end};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);

        // Printing the result
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
