public class FindTheDifference {
    public static void main(String[] args) {
        String s = "";
        String t = "e";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        char differ = 0;

        for (char c : s.toCharArray()) {
            differ ^= c;
        }

        for (char c : t.toCharArray()) {
            differ ^= c;
        }
        return differ;
    }
}
