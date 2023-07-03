public class Minimum_ASCII_Delete_Sum_for_Two_Strings {
    public static int minimumDeleteSum(String s1, String s2) {
        return minimumDeleteSumHelper(s1, s2, 0, 0);
    }

    private static int minimumDeleteSumHelper(String s1, String s2, int i, int j) {
        // Base cases: If one of the strings is empty, return the sum of ASCII values of the remaining characters
        if (i == s1.length()) {
            int sum = 0;
            for (; j < s2.length(); j++) {
                sum += (int) s2.charAt(j);
            }
            return sum;
        }
        if (j == s2.length()) {
            int sum = 0;
            for (; i < s1.length(); i++) {
                sum += (int) s1.charAt(i);
            }
            return sum;
        }

        // If the characters at current indices are equal, move to the next indices
        if (s1.charAt(i) == s2.charAt(j)) {
            return minimumDeleteSumHelper(s1, s2, i + 1, j + 1);
        }

        // Delete either s1[i] or s2[j] and find the minimum sum recursively
        int deleteS1 = (int) s1.charAt(i) + minimumDeleteSumHelper(s1, s2, i + 1, j);
        int deleteS2 = (int) s2.charAt(j) + minimumDeleteSumHelper(s1, s2, i, j + 1);

        // Return the minimum sum
        return Math.min(deleteS1, deleteS2);
    }

    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "eat";
        int result = minimumDeleteSum(s1, s2);
        System.out.println(result);  // Output: 231
    }
}
