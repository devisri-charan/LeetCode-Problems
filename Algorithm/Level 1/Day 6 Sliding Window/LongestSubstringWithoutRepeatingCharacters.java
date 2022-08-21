import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> window = new HashSet<>();

        while (end < s.length()) {
            if (!window.contains(s.charAt(end))){
                window.add(s.charAt(end));
                end++;
                length = Math.max(length, window.size());
            }
            else{
                window.remove(s.charAt(start));
                start++;
            }
        }
        return length;
    }
}