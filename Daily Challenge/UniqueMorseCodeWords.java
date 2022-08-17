import java.util.HashSet;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
        System.out.println(uniqueMorseRepresentations(new String[]{"a"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] alphabets = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hashset = new HashSet<>();

        for (String word : words) {
            String morseCode = "";
            for (char letter : word.toCharArray()) {
                morseCode += alphabets[letter - 'a'];
            }
            hashset.add(morseCode);
        }
        return hashset.size();
    }
}
