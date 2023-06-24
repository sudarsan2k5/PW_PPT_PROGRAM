import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Longest_Harmonious_Subsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> frqMap = new HashMap<>();
        for (int num : nums) {
            frqMap.put(num, frqMap.getOrDefault(num, 0) + 1);
        }

        int maxSubLen = 0;

        for (Map.Entry<Integer, Integer> entry : frqMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frqMap.containsKey(num + 1)) {
                int subLength = frequency + frqMap.get(num + 1);
                maxSubLen = Math.max(maxSubLen, subLength);
            }
        }

        return maxSubLen;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int maxSubLen = findLHS(arr);
        System.out.println(maxSubLen);
    }
}
