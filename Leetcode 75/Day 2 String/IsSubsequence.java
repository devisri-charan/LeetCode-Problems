public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        if (s.length() > t.length()){
            return false;
        }

        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i+=1;
            }
            j+=1;
        }
        return (i == s.length());
    }
}
