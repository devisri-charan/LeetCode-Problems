import java.util.HashSet;

public class CheckIfOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        int nonEqualPositions = 0;
        HashSet<Character> hashSet1 = new HashSet<>();
        HashSet<Character> hashSet2 = new HashSet<>();

        for (int i = 0; i < s2.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2){
                hashSet1.add(c1);
                hashSet2.add(c2);
                nonEqualPositions++;
            }
        }

        if (nonEqualPositions != 0 && nonEqualPositions !=2){
            return false;
        }

        return hashSet1.equals(hashSet2);
    }
}
