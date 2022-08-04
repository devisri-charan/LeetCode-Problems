import java.util.Hashtable;

public class IsomorphicStrings{
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Hashtable<Character, Character> hashtable = new Hashtable<Character, Character>();        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (hashtable.containsKey(sChar)){
                if (hashtable.get(sChar).equals(tChar)){
                    continue;
                }
                else{
                    return false;
                }
            }

            else{
                if (!hashtable.containsValue(tChar)){
                    hashtable.put(sChar, tChar);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}