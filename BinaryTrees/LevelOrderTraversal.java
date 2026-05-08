import java.util.*;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}

public class LevelOrderTraversal {

    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node=node;
            this.level=level;
        }
    }

    public static void main(String[] args) {
        // Level 0
        Node a = new Node(1);

        // Level 1
        Node b = new Node(4);
        Node c = new Node(3);

        // Level 2
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node k = new Node(11);

        // Level 3
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node l = new Node(12);
        Node m = new Node(13);

        // Connections
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = k;

        d.left = g;
        d.right = h;

        e.left = i;
        e.right = j;

        f.left = l;
        f.right = m;


    //                                           a(1)
    //                       ┌─────────────┴────────────────┐
    //                    b(4)                             c(3)
    //            ┌───────────┴──────────┐           ┌──────┴──────┐
    //         d(2)                     e(6)       f(5)          k(11)
    //     ┌──────┴──────┐          ┌────┴────┐   ┌───┴───┐
    //  g(7)            h(8)      i(9)    j(10)  l(12)  m(13)


        levelOrder(a);
    }

    public static void levelOrder(Node root){
        Queue<Pair> q= new LinkedList<>();
        Pair p = new Pair(root, 0);
        if(root!=null) q.add(p);

        while(q.size()>0){
            Pair front= q.remove();
            System.out.print(front.node.val+" ");

            if(front.node.left!=null) 
                q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right!=null) 
                q.add(new Pair(front.node.right, front.level+1));
        }
        // System.out.println();


    }



}
