import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                result.add(Math.abs(nums[i]));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> output = findDuplicates(nums);
        System.out.println(output);
    }
}
