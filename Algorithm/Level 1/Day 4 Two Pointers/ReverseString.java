public class ReverseString{
    public static void main(String[] args) {
        String string = "hello";
        System.out.println(reverseString(string));
    }

    public static String reverseString(String s) {
        int start = 0;
        int end = s.length() - 1;

        char[] sChars = s.toCharArray();
        while (start < end){
            char temp = sChars[start];
            sChars[start] = sChars[end];
            sChars[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(sChars);
    }
}