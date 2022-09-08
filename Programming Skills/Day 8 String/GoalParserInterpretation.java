public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        String goal = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G'){
                goal += "G";
            }
            else if (command.charAt(i) == '('){
                if (command.charAt(i+1) == ')'){
                    goal += "o";
                    i+=1;
                }
                else {
                    goal += "al";
                    i+=3;
                }
            }
        }
        return goal;
    }
}
