public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder decryptedString = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (i+2 < s.length() && s.charAt(i+2) == 35){
                decryptedString.append((char)(96 + Integer.parseInt(s.substring(i, i+2))));
                i+=2;
            }
            else{
                decryptedString.append((char) (96 + Integer.parseInt(s.substring(i, i+1))));
            }
        }

        return String.valueOf(decryptedString);
    }
}
