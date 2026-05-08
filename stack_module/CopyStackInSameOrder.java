import java.util.*;

public class CopyStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st_og=new Stack<>();
        st_og.push(1);
        st_og.push(2);
        st_og.push(3);
        st_og.push(4);
        st_og.push(5);
        System.out.println("original stack: "+st_og);
        Stack<Integer> st_reverseCopy=new Stack<>();
        while(!st_og.isEmpty()){
            st_reverseCopy.push(st_og.pop());
        }

        Stack<Integer> copy=new Stack<>();
        while(!st_reverseCopy.isEmpty()){
            copy.push(st_reverseCopy.pop());
        }

        System.out.println("copy stack: "+ copy);

    }
}
