package Linked_List;
class Node{
    int val;
    Node next;
     Node(int val){
        this.val=val;
     }
}

public class Basics {
    //print recurssively
    public static void PrintRec(Node head){
        if(head==null) return;
        Node temp=head;
        System.out.print(temp.val+" ");
        temp=temp.next;
        PrintRec(temp);
    } 
    //print normally
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;

        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        //System.out.println(a.val);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // print(a);
        PrintRec(a);


    }
}
