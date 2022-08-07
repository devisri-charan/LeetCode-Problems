import java.util.HashSet;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "ABCCCCDD"; // a: 1; b:1; c:4;d:2
        // l = 0 + 0 + 4 + 2
        System.out.println(1/2 * 2);
        System.out.println(longestPalindrome1(s));
    }

    public static int longestPalindrome(String s) {
        int length = 0;
        HashSet<Character> hashSet = new HashSet<>();       
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            if (hashSet.contains(sChar)){
                hashSet.remove(sChar);
                length++;
            }
            else{
                hashSet.add(sChar);
            }
        }
        if (hashSet.isEmpty()){
            return length*2;
        }
        return length*2 + 1;
    }

    public static int longestPalindrome1(String s) {
        int length = 0;
        int count[] = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
            if (count[c] == 2){
                length+=2;
                count[c] = 0;
            }
        }
        if (length != s.length()){
            return length + 1;
        }
        return length;
    }
}
