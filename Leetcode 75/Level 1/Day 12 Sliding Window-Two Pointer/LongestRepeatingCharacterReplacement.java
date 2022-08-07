public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        String s1 = "AABABBA";
        int k1 = 1;
        System.out.println(characterReplacement(s, k));
        System.out.println(characterReplacement(s1, k1));
    }

    public static int characterReplacement(String s, int k) {
        int lengthLongestSubString = 0;

        int[] count = new int[26];
        int maxCountOfSingleChar = 0;

        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'A'] += 1;
            maxCountOfSingleChar = Math.max(maxCountOfSingleChar, count[s.charAt(end) - 'A']);
            if (end - start + 1 - maxCountOfSingleChar > k){
                count[s.charAt(start) - 'A'] --;
                start++;
            }
            lengthLongestSubString = Math.max(lengthLongestSubString, end - start + 1);
        }

        return lengthLongestSubString;
    }
}
