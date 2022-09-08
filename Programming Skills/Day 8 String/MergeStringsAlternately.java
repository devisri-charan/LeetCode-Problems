public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()){
            char w1 = word1.charAt(i);
            char w2 = word2.charAt(j);
            mergedString.append(w1);
            mergedString.append(w2);
            i++;
            j++;
        }

        while (i < word1.length()){
            char w1 = word1.charAt(i);
            mergedString.append(w1);
            i++;
        }

        while (j < word2.length()){
            char w2 = word2.charAt(j);
            mergedString.append(w2);
            j++;
        }

        return String.valueOf(mergedString);
    }
}
