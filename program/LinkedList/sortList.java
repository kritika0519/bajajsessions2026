// brute force approach
class sortList{
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr= new ArrayList<>();
        // add linked list elements to arraylist

        ListNode temp= head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }

        //sort arraylist
        Collections.sort(arr);

        //make new linked list
        ListNode newHead= new ListNode(-1);
        ListNode dummy= newHead;

        //copying elements from sorted arraylist to new linked list
        for(int i=0;i<arr.size();i++){
            dummy.next= new ListNode(arr.get(i));
            dummy=dummy.next;
        }
        dummy.next=null;

        return newHead.next;
    }
}
//------------------------------------------------------------------------------------//


class sortList{
    public static void main(String[] args){
        
    }
}