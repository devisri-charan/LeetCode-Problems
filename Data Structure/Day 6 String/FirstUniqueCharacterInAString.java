import java.util.Arrays;
import java.util.HashMap;

public class FirstUniqueCharacterInAString{
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar1(s));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hashMap.containsKey(c)){
                hashMap.put(c, 1);
            }
            else{
                hashMap.replace(c, hashMap.get(c), hashMap.get(c)+1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.get(c)==1){
                return i;
            }
        }
        return -1;
    }
    public static int firstUniqChar1(String s) {
        char[] arr = s.toCharArray();
        int[] temp = new int[256];
        for (char c : arr) {
            temp[c - 'a'] += 1;
        }
        System.out.println(Arrays.toString(temp));

        for (int i = 0; i < arr.length; i++) {
            if (temp[arr[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}