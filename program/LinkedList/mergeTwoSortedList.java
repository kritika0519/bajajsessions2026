class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val= val;
	}
	ListNode(int val, ListNode next){
		this.val=val;
		this.next=next;
	}
}

class mergeTwoSortedList{
	// merge sort technique
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1= list1;
        ListNode temp2= list2;

        ListNode newHead=new ListNode(-1);
        ListNode dummy= newHead;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                dummy.next=new ListNode(temp1.val);
                temp1=temp1.next;
                dummy=dummy.next;
            }
            else{
                dummy.next= new ListNode(temp2.val);
                temp2=temp2.next;
                dummy=dummy.next;
            }
        }

        while(temp1!=null){
            dummy.next= new ListNode(temp1.val);
            temp1=temp1.next;
            dummy=dummy.next;
        }
        while(temp2!=null){
            dummy.next= new ListNode(temp2.val);
            temp2=temp2.next;
            dummy=dummy.next;
        }

        return newHead.next;
    }

    public static void main(String[] args){

    	ListNode head1= new ListNode(-1);
    	ListNode dummy1= head1;
    	dummy1.next= new ListNode(2);
    	dummy1=dummy1.next;
    	dummy1.next= new ListNode(5);
    	dummy1=dummy1.next;
    	dummy1.next= new ListNode(6);
    	dummy1=dummy1.next;
    	dummy1.next= new ListNode(9);



    	ListNode head2= new ListNode(-1);
    	ListNode dummy2= head2;
    	dummy2.next= new ListNode(3);
    	dummy2=dummy2.next;
    	dummy2.next= new ListNode(4);
    	dummy2=dummy2.next;
    	dummy2.next= new ListNode(7);
    	dummy2=dummy2.next;
    	dummy2.next= new ListNode(8);
    	dummy2=dummy2.next;
    	dummy2.next= new ListNode(10);
    	dummy2=dummy2.next;
    	dummy2.next= new ListNode(11);
    	dummy2=dummy2.next;
    	

    	ListNode merged = mergeTwoLists(head1.next, head2.next);
    	ListNode temp=merged;

    	while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

    }
}