public class Buddy_Strings {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] > 1) {
                    return true;
                }
            }
            return false;
        }

        int firstMismatch = -1;
        int secondMismatch = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstMismatch == -1) {
                    firstMismatch = i;
                } else if (secondMismatch == -1) {
                    secondMismatch = i;
                } else {
                    return false;
                }
            }
        }

        return (secondMismatch != -1 && s.charAt(firstMismatch) == goal.charAt(secondMismatch)
                && s.charAt(secondMismatch) == goal.charAt(firstMismatch));
    }

    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        boolean result = buddyStrings(s, goal);
        System.out.println(result);
    }
}
