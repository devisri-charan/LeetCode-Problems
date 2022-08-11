public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = "God Ding";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords(s1));
    }

    public static String reverseWords(String s) {
        int start = 0;
        int end = 0;

        char[] sChars = s.toCharArray();

        while (end < s.length()){
            if (sChars[end] == ' ' || end == s.length() - 1){
                int aEnd = end;
                if (end != s.length() - 1){
                    end--;
                }
                while (start < end){
                    char temp = sChars[start];
                    sChars[start] = sChars[end];
                    sChars[end] = temp;
                    start++;
                    end--;
                }
                start = aEnd + 1;
                end = aEnd + 1;
            }
            end++;
        }
        return String.valueOf(sChars);
    }
}
