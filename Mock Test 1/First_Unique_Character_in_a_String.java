//First Unique Character in a String
//
//        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//        Example 1:
//        Input: s = "leetcode"
//        Output: 0
//
//        Example 2:
//        Input: s = "loveleetcode"
//        Output: 2
//
//        Example 3:
//        Input: s = "aabb"
//        Output: -1
//
//        Constraints:
//        a. 1 <= s.length <= 10^5
//        b. s consists of only lowercase English letters.

public class First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c - 'a'] == 1) {
                return i;
            }
        }

        System.out.println("No Repeating Character Found: ");
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
