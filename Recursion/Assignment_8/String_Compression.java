import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_Compression {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        helper(s, p, 0, 0, result);
        return result;
    }

    private static void helper(String s, String p, int start, int end, List<Integer> result) {
        if (end - start == p.length()) {
            if (isAnagram(s.substring(start, end), p)) {
                result.add(start);
            }
            return;
        }

        if (end < s.length()) {
            helper(s, p, start, end + 1, result);
        } else if (start + 1 < s.length()) {
            helper(s, p, start + 1, start + 1, result);
        }
    }

    private static boolean isAnagram(String s1, String s2) {
        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = findAnagrams(s, p);
        System.out.println(indices);
    }
}
