public class Delete_Operation_for_Two_Strings {
    public static int minSteps(String word1, String word2) {
        return minStepsHelper(word1, word2, 0, 0);
    }

    private static int minStepsHelper(String word1, String word2, int i, int j) {
        if (i == word1.length()) {
            return word2.length() - j;
        }
        if (j == word2.length()) {
            return word1.length() - i;
        }

        if (word1.charAt(i) == word2.charAt(j)) {
            return minStepsHelper(word1, word2, i + 1, j + 1);
        }

        int deleteFromWord1 = 1 + minStepsHelper(word1, word2, i + 1, j);
        int deleteFromWord2 = 1 + minStepsHelper(word1, word2, i, j + 1);

        return Math.min(deleteFromWord1, deleteFromWord2);
    }

    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        int result = minSteps(word1, word2);
        System.out.println(result);  // Output: 2
    }
}
