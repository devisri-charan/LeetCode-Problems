import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString{
    public static void main(String[] args) {
        String s = "ababababab";
                  //0123456789
        String p = "aab";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> startingIndices = new ArrayList<>();

        int S = s.length();
        int P = p.length();

        int[] frequencyP = frequency(p);
        int[] frequencySubString = frequency(s.substring(0, P));

        if (isAnagram(frequencySubString, frequencyP)){
            startingIndices.add(0);
        }

        for (int i = P; i < S; i++) {
            frequencySubString[s.charAt(i) - 'a']++;    
            frequencySubString[s.charAt(i - P) - 'a']--;    
            if (isAnagram(frequencySubString, frequencyP)){
                startingIndices.add(i - P +1);
            }
        }
        return startingIndices;
    }

    public static boolean isAnagram(int[] frequencySubString, int[] frequencyP) {
        for (int i = 0; i < 26; i++) {
            if (frequencySubString[i] != frequencyP[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] frequency(String s){
        int[] freqString = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freqString[s.charAt(i) - 'a']++;
        }
        return freqString;
    }
}