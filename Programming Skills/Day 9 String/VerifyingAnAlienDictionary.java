public class VerifyingAnAlienDictionary {
    public static void main(String[] args) {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words, order));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        int[] orderArray = new int[26];

        for (int i = 0; i < orderArray.length; i++) {
            orderArray[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            if (compare(orderArray,words[i-1],words[i])){
                return false;
            }
        }
        return true;
    }

    public static boolean compare(int[] orderArray, String word, String word2) {
        int l1 = word.length();
        int l2 = word2.length();
        for (int i = 0; i < l1 && i < l2; i++) {
            if (word.charAt(i) != word2.charAt(i)){
                return orderArray[word.charAt(i) - 'a'] > orderArray[word2.charAt(i) - 'a'];
            }
        }
        
        return l1>l2;
    }
}
