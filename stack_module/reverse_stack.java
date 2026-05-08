import java.util.*;

public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> st_original=new Stack<>();
        st_original.push(1);
        st_original.push(2);
        st_original.push(3);
        st_original.push(4);
        st_original.push(5);
        System.out.println("original stack: "+st_original);

        Stack<Integer> st_reversed=new Stack<>();
        while(!st_original.isEmpty()){
            st_reversed.push(st_original.pop());
        }
        System.out.println("reversed stack: "+st_reversed);
    }
}
