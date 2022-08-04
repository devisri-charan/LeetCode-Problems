import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern{
    public static void main(String[] args) {
        String[] words = {"a","b","c"};
        String pattern = "a";
        System.out.println(findAndReplacePattern(words, pattern));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (checkPattern(word, pattern)){
                list.add(word);
            }
        }
        return list;
    }
    public static List<String> findAndReplacePattern1(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (checkPattern1(word, pattern)){
                list.add(word);
            }
        }
        return list;
    }

    private static boolean checkPattern(String word, String pattern) {
        HashMap<Character,Character> hashMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char wChar = word.charAt(i);
            char pChar = pattern.charAt(i);
            if (!hashMap.containsKey(wChar)){
                if (hashMap.containsValue(pChar)){
                    return false;
                }
                else{
                    hashMap.put(wChar, pChar);
                }
            }
            else{
                if(!hashMap.get(wChar).equals(pChar)){
                    return false;
                }
                else{
                    continue;
                }
            }
        }
        return true;
    }

    private static boolean checkPattern1(String word, String pattern){
        for(int i=0;i<word.length();i++){
            if(word.indexOf(word.charAt(i))!=pattern.indexOf(pattern.charAt(i))){
                return false;
            }
        }
        return  true;
    }
}