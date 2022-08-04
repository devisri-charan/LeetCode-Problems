// import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();

        int[] temp = new int[26];
        int[] temp1 = new int[26];
        for (char ch : r) {
            temp[ch - 'a'] += 1;
        }
        for (char ch : m) {
            temp1[ch - 'a'] += 1;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > temp1[i]){
                return false;
            }
        }
        return true;
    }
}
