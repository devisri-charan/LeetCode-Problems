public class ToLowerCase {
    public static void main(String[] args) {
       String s = "Hello";
       System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        char[] lowerCaseString = s.toCharArray();
        for (int i = 0; i< s.length(); i++) {
            if ('A' <= lowerCaseString[i] && lowerCaseString[i] <= 'Z' ){
                lowerCaseString[i] -= (char)('A');
                lowerCaseString[i] += (char)('a');
            }
        }
        return String.valueOf(lowerCaseString);
    }
}
