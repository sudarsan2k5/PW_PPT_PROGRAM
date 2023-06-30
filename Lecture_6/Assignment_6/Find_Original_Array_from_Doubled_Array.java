import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Original_Array_from_Doubled_Array {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0]; // If the length is odd, it cannot be a valid doubled array
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : changed) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> original = new ArrayList<>();
        Arrays.sort(changed); // Sort the changed array in non-decreasing order

        for (int num : changed) {
            if (frequencyMap.getOrDefault(num, 0) == 0) {
                continue; // Skip if the element is already used
            }

            int half = num / 2;
            if (half == 0 || frequencyMap.getOrDefault(half, 0) == 0) {
                return new int[0]; // Not a valid doubled array
            }

            original.add(num);
            frequencyMap.put(num, frequencyMap.get(num) - 1);
            frequencyMap.put(half, frequencyMap.get(half) - 1);
        }

        int[] result = new int[original.size()];
        for (int i = 0; i < original.size(); i++) {
            result[i] = original.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }
}
