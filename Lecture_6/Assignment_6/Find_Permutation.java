import java.util.ArrayList;
import java.util.List;

public class Find_Permutation {
    public static int[] reconstructPerm(String s) {
        List<Integer> perm = new ArrayList<>();
        int low = 0;
        int high = s.length();

        for (char ch : s.toCharArray()) {
            if (ch == 'I') {
                perm.add(low);
                low++;
            } else if (ch == 'D') {
                perm.add(high);
                high--;
            }
        }

        // Add the remaining number
        perm.add(low);

        // Convert List<Integer> to int[]
        int[] result = new int[perm.size()];
        for (int i = 0; i < perm.size(); i++) {
            result[i] = perm.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = reconstructPerm(s);
        printArray(perm);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
