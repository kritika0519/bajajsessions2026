package Linked_List;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class SSL {
    Node head;

    // Insert at end
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            return;
        }
        Node x = head;
        while (x.next != null) {
            x = x.next;
        }
        x.next = temp;
    }

    // Display list
    void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Get size of list
    int Size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // Insert at head
    void insertAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
    }

    // Insert at index
    void insertAtIndex(int index, int val) {
        int size = Size();
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertAtHead(val);
            return;
        }

        Node temp = new Node(val);
        Node x = head;
        for (int i = 0; i < index - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
    }

    // Delete at index
    void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        int size = Size();
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node x = head;
        for (int i = 0; i < index - 1; i++) {
            x = x.next;
        }
        x.next = x.next.next;
    }

    // get the value at index
    void ValueAtIndex(int index){
        int size=Size();
        if(index<0 || index>=size){
            System.out.println("invalid index");
            return;
        }
        Node x=head;
        for(int i=0;i<index;i++){
            x=x.next;
        }
        System.out.println(x.val);
    }

    // set the value at index
    void SetAtIndex(int index, int val){
        int size=Size();
        if(index<0 || index>=size){
            System.out.println("invalid index");
            return;
        }
        Node x=head;
        for(int i=0;i<index;i++){
            x=x.next;
        }
        x.val=val;
    }




}

public class Implement_SSL {
    public static void main(String[] args) {
        SSL ll = new SSL();
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.Display();

        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.Display(); // 20 10 30 40

        ll.insertAtIndex(1, 15);
        ll.Display(); // 20 15 10 30 40

        ll.deleteAtIndex(3);
        ll.Display(); // 20 15 10 40

        ll.ValueAtIndex(2);
        ll.SetAtIndex(1, 100);
        ll.Display();
    }
}
