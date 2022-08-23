import java.util.Stack;

public class StackUsingJava {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");

        System.out.println("Popped Element :: " + st.pop());
        System.out.println("Popped Element :: " + st.pop());
        System.out.println("Peek Element :: " + st.peek());
        System.out.println("Popped Element :: " + st.pop());
    }
}
