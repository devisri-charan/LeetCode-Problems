import java.util.ArrayList;
import java.util.HashMap;
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
        int i = 0;
        while (i <= s.length() - p.length()) {
            String subString = s.substring(i, i+p.length());
            if (isAnagram(subString,p)){
                startingIndices.add(i);
            }
            i+=1;
        }
        return startingIndices;
    }

    private static boolean isAnagram(String subString, String p) {
        return true;
    }
}