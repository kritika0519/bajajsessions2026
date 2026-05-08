import java.util.*;

import javax.swing.tree.TreeNode;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class NodesOfTree {
    
    public static void main(String[] args) {
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


        //System.out.println(a.left.val);
        // PreOrder(a);
        // System.out.println();
        // InOrder(a);
        // System.out.println();
        // PostOrder(a);
        // System.out.println();

        // System.out.println("sum of tree nodes:- "+sum(a));
        // System.out.println("product of tree nodes:- "+product(a));
        // System.out.println("maxNode of tree :- "+maxNode(a));
        // System.out.println("level of tree :- "+levelOfTree(a));
        // System.out.println("size of tree :- "+sizeOfTree(a));
        // System.out.print("Level Order Traversal :- ");
        LevelOrder(a);
        // int n=1;
        // nthLevel(a,0,n);
    }


    public List<Integer> rightSideView(Node root) {
        List<Integer> arr=new ArrayList();
        if(root == null ) return arr;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node n=q.poll();
                if(i==size-1) arr.add(n.val);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
        }
        return arr;
    }

    private static void nthLevel(Node root, int level, int n){
        if(root==null) return;
        if(level==n)System.out.print(root.val+" ");
        nthLevel(root.left,level+1,n);
        nthLevel(root.right,level+1,n);
    }

    private static void PreOrder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    private static void InOrder(Node root){
        if(root==null) return;
        InOrder(root.left);
        System.out.print(root.val+" ");
        InOrder(root.right);
    }

    private static void PostOrder(Node root){
        if(root==null) return; 
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.val+" ");
    }

    public static int sum(Node root){
        int ans=0;
        if(root==null) return 0;
        ans+=root.val+ sum(root.left)+ sum(root.right);
        return ans;

    }

    public static int product(Node root){
        int ans=1;
        if(root==null) return 1;
        ans*=root.val*product(root.left)*product(root.right);
        return ans;
    }

    public static int maxNode(Node root){
        if(root==null) return 0;
        int max=root.val;
        max=Math.max(max, Math.max(maxNode(root.left), maxNode(root.right)));
        return max;
    }

    public static int levelOfTree(Node root){
        if(root==null) return 0;
        int leftLevel=levelOfTree(root.left);
        int rightLevel=levelOfTree(root.right);

        return Math.max(leftLevel,rightLevel)+1;
    }

    public static int sizeOfTree(Node root){
        if(root==null) return 0;
        int size =1+ sizeOfTree(root.left)+sizeOfTree(root.right);
        return size;
    }
    
    //BFS from left to right
    public static void LevelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null) q.add(root);

        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }


}
