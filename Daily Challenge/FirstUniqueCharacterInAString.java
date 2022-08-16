public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] temp = new int[256];
        for (char c : arr) {
            temp[c - 'A'] += 1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (temp[arr[i] - 'A'] == 1){
                return i;
            }
        }
        return -1;
    }
}
