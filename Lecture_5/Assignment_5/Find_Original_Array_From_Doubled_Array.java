import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Original_Array_From_Doubled_Array {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : changed) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> original = new ArrayList<>();
        for (int num : changed) {
            if (count.get(num) > 0) {
                count.put(num, count.get(num) - 1);
                if (count.getOrDefault(num * 2, 0) > 0) {
                    count.put(num * 2, count.get(num * 2) - 1);
                    original.add(num);
                } else {
                    return new int[0];
                }
            }
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
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
