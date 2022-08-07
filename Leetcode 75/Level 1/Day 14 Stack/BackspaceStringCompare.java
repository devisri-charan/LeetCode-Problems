import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        System.out.println(backspaceCompare(s, t));
    }
    public static boolean backspaceCompare(String s, String t) {
        return formatString(s).equals(formatString(t));
    }

    public static String formatString(String s){
        Stack<Character> stack = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (character != '#'){
                stack.push(character);
            }
            else if (!stack.empty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}