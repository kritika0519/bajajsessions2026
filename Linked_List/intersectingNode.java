package Linked_List;

public class intersectingNode {
    
}


// /**
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// public class Solution {
//     public ListNode present(ListNode head){
//         ListNode slow=head;
//         ListNode fast=head;

//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast) return slow;
//         }
//         return null;
//     }
//     public ListNode detectCycle(ListNode head) {
//         ListNode point=present(head);
//         if(point==null) return null;
        
//         ListNode t=head;
//         while(t!=point){
//             t=t.next;
//             point=point.next;
//         }
//         return t;
//     }
// }
