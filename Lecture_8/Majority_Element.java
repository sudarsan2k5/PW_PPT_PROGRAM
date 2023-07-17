public class Majority_Element {
    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Find potential majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Validate if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Return the majority element if it exists
        if (count > nums.length / 2) {
            return candidate;
        }

        // No majority element found
        throw new IllegalArgumentException("No majority element exists.");
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = findMajorityElement(nums);

        // Printing the result
        System.out.println(majorityElement); // Output: 4
    }
}
