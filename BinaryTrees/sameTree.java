import java.util.ArrayList;
import java.util.List;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}

public class sameTree {
    public static void main(String[] args) {
        // tree node a
        Node a= new Node(1);
        Node b= new Node(4);
        Node c= new Node(3);
        Node d= new Node(2);
        Node e= new Node(6);
        Node f= new Node(5);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;

        //tree node p
        Node p= new Node(1);
        Node q= new Node(4);
        Node r= new Node(3);
        Node s= new Node(2);
        Node t= new Node(6);
        Node u = new Node(5);
        p.left=q;
        p.right=r;
        q.left=s;
        q.right=t;
        r.left=u;

        System.out.println("Are trees same:- " + isSameTree(a, p));
    }

    public static boolean isSameTree(Node p, Node q) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        preorder(p,arr1);
        preorder(q,arr2);

        return arr1.equals(arr2);

    }

    public static void preorder(Node root, List<Integer> arr){
        if(root==null) {
            arr.add(null);
            return;
        }
        arr.add(root.val);
        preorder(root.left,arr);
        preorder(root.right,arr);
    }

}
