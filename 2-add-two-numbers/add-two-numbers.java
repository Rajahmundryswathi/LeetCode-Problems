/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int s=0, carry=0;
        while(t1!=null || t2!=null){
            s = carry;
            if(t1!=null){
                s += t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                s += t2.val;
                t2 = t2.next;
            }
            carry = s/10;
            s = s%10;
            ListNode newNode = new ListNode(s);
            curr.next = newNode;
            curr = curr.next;
        }
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
            curr = curr.next;
        }
        
        return dummy.next;
    }
}