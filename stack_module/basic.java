import java.util.*;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("remove top element from stack: "+st.pop());
        System.out.println("check is stack is empty or not: "+st.isEmpty());
        System.out.println("size of stack: "+st.size());
        System.out.println(st);
        System.out.println("top element of stack: "+st.peek());
    }
}
