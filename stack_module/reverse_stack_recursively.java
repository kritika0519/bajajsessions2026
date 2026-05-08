import java.util.Stack;

public class reverse_stack_recursively {
     public static void insertAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top=st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st) {
        if(st.isEmpty()) return;
        int top=st.pop();
        reverse(st);
        insertAtBottom(st, top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverse(st);

        System.out.println(st);
    }
}
