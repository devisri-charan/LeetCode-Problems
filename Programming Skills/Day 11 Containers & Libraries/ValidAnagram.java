public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        int[] temp = new int[26];
        int[] temp1 = new int[26];
        for (char ch : sChar) {
            temp[ch - 'a'] += 1;
        }
        for (char ch : tChar) {
            temp1[ch - 'a'] += 1;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != temp1[i]){
                return false;
            }
        }
        return true;
    }
}
