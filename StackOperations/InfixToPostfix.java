import java.util.Stack;

public class InfixToPostfix {

    static int precendence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPost(String expression) {
        Stack<Character> st = new Stack<>();
        String result = "";
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // If current character is a letter
            if(Character.isLetterOrDigit(c)) {
                result += c;
            }
            else if(c == '(') {
                st.push(c);
            }
            else if(c == ')') {
                while(!st.isEmpty() && st.peek() != '(') {
                    result += st.pop();
                }
                // if(!st.isEmpty() && st.peek() != '(') {
                //     return "Invalid Expression";
                // }
                if(st.isEmpty()) {
                    return "Invalid Expression...";
                }
                else {
                    st.pop();
                }
            }
            // if character is an operator
            else {
                while(!st.isEmpty() && precendence(c) <= precendence(st.peek())) {
                    if(st.peek() == '(') {
                        return "Invalid Expression";
                    }
                    result += st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()) {
            result += st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String expression = "a+b*c-d";
        String res = infixToPost(expression);
        System.out.println("Result : " + res);
    }
}
