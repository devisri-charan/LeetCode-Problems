import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch != ']'){
                stack.push(ch);
            }
            else{
                // find the string in brackets
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isLetter(stack.peek())){
                    sb.insert(0, stack.pop());
                }

                String string = sb.toString();
                stack.pop();

                // find the no. of it should be repeated
                sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())){
                    sb.insert(0, stack.pop());
                }

                int count = Integer.valueOf(sb.toString());

                //repeat the string count no.of times and push it back to stack
                for (int i = 0; i < count; i++) {
                    for (Character character : string.toCharArray()) {
                        stack.push(character);
                    }
                }
            }
        }
        StringBuilder decodedString = new StringBuilder();
        while (!stack.isEmpty()){
            decodedString.insert(0, stack.pop());
        }
        return decodedString.toString();
    }
}
