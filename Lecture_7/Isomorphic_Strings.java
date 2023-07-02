import java.util.HashMap;
public class Isomorphic_Strings {
        public static boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            HashMap<Character, Character> sMap = new HashMap<>();
            HashMap<Character, Character> tMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                if (!sMap.containsKey(sChar)) {
                    if (tMap.containsKey(tChar) && tMap.get(tChar) != sChar) {
                        return false;
                    }
                    sMap.put(sChar, tChar);
                }

                if (!tMap.containsKey(tChar)) {
                    if (sMap.containsKey(sChar) && sMap.get(sChar) != tChar) {
                        return false;
                    }
                    tMap.put(tChar, sChar);
                }
            }

            return true;
        }

        public static void main(String[] args) {
            String s = "egg";
            String t = "add";
            System.out.println(isIsomorphic(s, t)); // Output: true
        }
    }