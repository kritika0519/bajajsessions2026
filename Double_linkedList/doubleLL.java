class dNode{
    int val;
    dNode next;
    dNode prev;

    dNode(int val){
        this.val=val;
    }
}

public class doubleLL {
    public static void print(dNode head){
        dNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void printReverse(dNode tail){
        dNode temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        dNode a=new dNode(10);
        dNode b=new dNode(20);
        dNode c=new dNode(30);
        dNode d=new dNode(40);
        dNode e=new dNode(50);

        a.next=b;a.prev=null;
        b.next=c;b.prev=a;
        c.next=d;c.prev=b;
        d.next=e;d.prev=c;
        e.next=null;e.prev=d;

        print(a);
        printReverse(e);

    }   
}
