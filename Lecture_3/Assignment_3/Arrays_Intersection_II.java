import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Arrays_Intersection_II {
    public static List<List<Integer>> findDistinctElements(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                answer1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                answer2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(answer1);
        answer.add(answer2);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> result = findDistinctElements(nums1, nums2);
        System.out.println(result);  // Output: [[1, 3], [4, 6]]
    }
}

