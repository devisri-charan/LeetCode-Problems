import java.util.HashMap;

public class BullsAndCows {
    public static void main(String[] args) {
        String secret = "1122";
        String guess = "2211";
        System.out.println(getHint(secret, guess));
    }

    public static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        HashMap<Character,Integer> hashMap1 = new HashMap<>();
        HashMap<Character,Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s != g){
                hashMap1.put(s, hashMap1.getOrDefault(s, 0)+1);
                hashMap2.put(g, hashMap2.getOrDefault(g, 0)+1);
            }
            else {
                bulls++;
            }
        }
        for (char c : hashMap1.keySet()) {
            if (hashMap2.containsKey(c)){
                cows += Math.min(hashMap1.get(c), hashMap2.get(c));
            }
        }
        return bulls + "A" + cows +"B";
    }
}
