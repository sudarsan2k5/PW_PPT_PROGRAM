public class Decode_String {
        public static String decodeString(String s) {
            StringBuilder result = new StringBuilder();
            int index = 0;

            while (index < s.length()) {
                if (Character.isDigit(s.charAt(index))) {
                    int count = 0;
                    while (Character.isDigit(s.charAt(index))) {
                        count = count * 10 + Character.getNumericValue(s.charAt(index));
                        index++;
                    }

                    // Skip the '['
                    index++;

                    // Recursive call to process the encoded substring
                    String subResult = decodeString(s.substring(index));
                    for (int i = 0; i < count; i++) {
                        result.append(subResult);
                    }

                    // Skip the encoded substring and the corresponding ']'
                    index += subResult.length() + 1;
                } else if (s.charAt(index) == ']') {
                    // End of the current encoded substring
                    return result.toString();
                } else {
                    // Regular characters are added to the result
                    result.append(s.charAt(index));
                    index++;
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String s = "3[a]2[bc]";
            String decodedString = decodeString(s);
            System.out.println(decodedString);
        }
}
