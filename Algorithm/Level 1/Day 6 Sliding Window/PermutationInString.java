public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] charCount = new int[26];
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }

        int start = 0;
        int end = 0;

        int count = s1.length();

        while(end < s2.length()){
            if(charCount[s2.charAt(end) - 'a']-- > 0){
                count--;
            }
            end++;

            if(count == 0){
                return true;
            }
            
            if(end - start == s1.length()){
                if (charCount[s2.charAt(start) - 'a']++ >= 0){
                    count++;
                }
                start++;
            }
        }
        return false;
    }
}
