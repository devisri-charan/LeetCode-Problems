import java.util.Stack;

public class ValidParentheses{
    public static void main(String[] args) {
        String s = "({{}[][[[)]]]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.add(c);
            }
            else{
                if (stack.isEmpty()){
                    return false;
                }
                char check;
                switch (c) {
                    case '}':
                        check = stack.pop();
                        if ( check != '{'){
                            return false;
                        }
                        break;
                    case ')':
                        check = stack.pop();
                        if ( check != '('){
                            return false;
                        }
                        break;
                    case ']':
                        check = stack.pop();
                        if ( check != '['){
                            return false;
                        }
                        break;
                }
            }
        }
        return (stack.isEmpty());
    }
}