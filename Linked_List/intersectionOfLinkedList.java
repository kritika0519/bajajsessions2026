public class intersectionOfLinkedList {
    
}

 * /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA==null || headB==null) return null;

//         ListNode p1 = headA;
//         ListNode p2 = headB;

//         while (p1 != p2) {
//             if (p1 == null) p1 = headB; 
//             else   p1 = p1.next;
            
//             if (p2 == null) p2 = headA;
//             else    p2 = p2.next;
//         }

//         return p1;
        
//     }
// }
 










// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode t1=headA;
//         int len1=0;
//         while(t1.next!=null){
//             len1++;
//             t1=t1.next;
//         }

//         int len2=0;
//         ListNode t2=headB;
//         while(t2.next!=null){
//             len2++;
//             t2=t2.next;
//         }

//         // making the length of both ll same
//         t1=headA;
//         t2=headB;
//         if(len1>len2){
//             for(int i=1;i<=len1-len2;i++){
//                 t1=t1.next;
//             }
//         }
//         else{
//             for(int i=1;i<=len2-len1;i++){
//                 t2=t2.next;
//             }
//         }

//         while(t1!=t2){
//             t1=t1.next;
//             t2=t2.next;
//         }

//         return t1;
//     }
// }