public class Find_Peak_Element {
    public static int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peakIndex = findPeakElement(nums);

        // Printing the result
        System.out.println(peakIndex);
    }
}
