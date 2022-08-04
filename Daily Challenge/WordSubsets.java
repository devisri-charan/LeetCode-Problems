import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","oo"};
        System.out.println(wordSubsets(words1, words2));
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> universalStrings = new ArrayList<>();
        for (String word1 : words1) {
            if (isUniversal(word1,words2)){
                universalStrings.add(word1);
            }
        }
        return universalStrings;
    }

    public static boolean isUniversal(String word1, String[] words2) {
        // HashSet<Character> hashSet = new HashSet<>();
        // for (char word1Char : word1.toCharArray()) {
        //     hashSet.add(word1Char);
        // }
        for (String word2 : words2) {
            // char word2Char = word2.charAt(0);
            if (!word2.matches(word1)){
                return false;
            }
        }
        return true;
    }
}
