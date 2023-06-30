import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_All_Duplicates_in_an_Array {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            // GET THE INDEX, THE ELEMENTS CPRRESPONDS TO
            int index = Math.abs(nums[i]) - 1;

            // if the number is alreasy negative, it means we are
            //encountering it twice
            if(nums[index] < 0){
                result.add(index + 1);
            }

            //Flip the number at the index to negative
            nums[index] = nums[index] * -1;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> output = findDuplicates(nums);
        System.out.println(output);
    }
}
